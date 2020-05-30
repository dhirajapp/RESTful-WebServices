package com.spring.carona_virus_tracker1.models;

import org.springframework.boot.autoconfigure.AutoConfigurationPackage;

@AutoConfigurationPackage
public class LocationStats {
	
	
	
	
	
	@Override
	public String toString() {
		return "LocationStats [state=" + state + ", country=" + country + ", latestTotalaCases=" + latestTotalaCases
				+ "]";
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public String getLatestTotalaCases() {
		return latestTotalaCases;
	}
	public void setLatestTotalaCases(String latestTotalaCases) {
		this.latestTotalaCases = latestTotalaCases;
	}
	
	private String state;
	private String country;
	private String latestTotalaCases;

}
