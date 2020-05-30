package com.spring.carona_virus_tracker1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.web.client.RestTemplate;

@Configuration
@EnableScheduling
@SpringBootApplication
public class SpringCaronaVirusTracker1Application {
	private static String VIRUS_DATA_URL = "https://raw.githubusercontent.com/CSSEGISandData/COVID-19/master/csse_covid_19_data/csse_covid_19_time_series/time_series_covid19_confirmed_global.csv";

	public static void main(String[] args) {
		SpringApplication.run(SpringCaronaVirusTracker1Application.class);
		RestTemplate restTemplate = new RestTemplate();
		String str = restTemplate.getForObject(VIRUS_DATA_URL, String.class);
		System.out.println(str);

	}

}
