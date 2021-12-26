package com.pc.spring.annotation;

import org.springframework.stereotype.Component;

// option 1: @Component("testBaseBallCoach")

//option2 : IOC will cfreate a bean with Id baseBallCoach

@Component
public class BaseBallCoach {

	public BaseBallCoach() {

		System.out.println("I am from default constructor......");
	}

	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		System.out.println("Property Injected.....");

		this.name = name;
	}
	
	public void m1() {
		
		System.out.println("I am from method m1....");
	}

}
