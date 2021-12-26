package com.pc.spring.scope;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class CricketCoach {

	private String name;
	private String location;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		System.out.println("From Prototype setter method");
		this.name = name;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	

}
