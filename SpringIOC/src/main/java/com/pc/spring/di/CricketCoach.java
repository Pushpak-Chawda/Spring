package com.pc.spring.di;

public class CricketCoach implements Coach{

	private String name;
	private String location;
	
	
	
	
	public String getName() {
		return name;
	}




	public void setName(String name) {
		this.name = name;
	}




	public String getLocation() {
		return location;
	}




	public void setLocation(String location) {
		this.location = location;
	}




	@Override
	public String dailyWorkOut() {
		return "Please do run for atleast 20 mins";
	}
	
	
}
