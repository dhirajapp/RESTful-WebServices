package com.spring.carona_virus_tracker1_service;

import java.io.IOException;
import java.io.StringReader;
import java.net.URI;
import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;

import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVRecord;
import org.apache.http.HttpResponse;
import org.springframework.http.HttpRequest;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.spring.carona_virus_tracker1.models.LocationStats;
@Service
public class Caronavirus_data {
	

	private static String VIRUS_DATA_URL="https://raw.githubusercontent.com/CSSEGISandData/COVID-19/master/csse_covid_19_data/csse_covid_19_time_series/time_series_covid19_confirmed_global.csv";
   private static List<LocationStats> allStats=new ArrayList<>();
	public static List<LocationStats> getAllStats() {
	return allStats;
}
	@PostConstruct
	@Scheduled(cron="* * 1 * * *")
	
   public void fetchvirusData()throws IOException,InterruptedException
	  {
		 List<LocationStats> newStats=new ArrayList<>();
		RestTemplate restTemplate = new RestTemplate();
		String str = restTemplate.getForObject(VIRUS_DATA_URL, String.class); 
		System.out.println(str); 
		StringReader csvBodyReader = new StringReader(str);
		Iterable<CSVRecord>records =CSVFormat.DEFAULT.withFirstRecordAsHeader().parse(csvBodyReader);
		for(CSVRecord record :records)
		{
			LocationStats  locationStat=new LocationStats();
			locationStat.setState(record.get("Province/State"));
			locationStat.setCountry(record.get("Country/Region"));
			locationStat.setLatestTotalaCases(record.get(record.size()-1));
		System.out.println(locationStat);
		newStats.add(locationStat);
		}
		this.allStats=newStats;
	  }
}
