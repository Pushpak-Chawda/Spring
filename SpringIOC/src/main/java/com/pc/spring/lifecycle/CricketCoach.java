package com.pc.spring.lifecycle;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class CricketCoach implements InitializingBean, DisposableBean {

	
	public CricketCoach() {
		System.out.println("From Prototype Reference constructor.....");
		
	}
	
	private String name;
	private String location;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		System.out.println("From Prototype Reference setter.....");
		this.name = name;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	@Override
	public void destroy() throws Exception {

		System.out.println("From Prototype Reference  destroy method of DisposableBean interface.....");
	}

	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("From Prototype Reference After Properties Set method from Initializing Bean interface.....");

	}

	public void doStartupJob() {

		System.out.println("From Prototype Reference  custom init.....");
	}

	public void doCleanUp() {

		System.out.println("From Prototype Reference  custom destroy method.....");
	}
}
