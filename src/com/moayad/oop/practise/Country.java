package com.moayad.oop.practise;

public class Country {
	private String countryName;
	Country(String countryName){
		this.countryName = countryName;
	}
	public String getCountryName() {
		return countryName;
	}
}

class Region extends Country {
	private String regionName;
	Region(String countryName, String regionName) {
		super(countryName);
		this.regionName = regionName;
	}
	
	@Override
	public String getCountryName() {
		return super.getCountryName();
	}
	
	public String getRegionName() {
		return regionName;
	}
}
