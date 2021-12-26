package com.pc.spring.annotation.di;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

// option 1: @Component("testBaseBallCoach")

//option2 : IOC will cfreate a bean with Id baseBallCoach

@Component
public class BaseBallCoach implements Coach {
	
	
	private FitnessService fitnessServ;
	
	
	@Autowired
	public BaseBallCoach(FitnessService theFitnessServ) {
		fitnessServ = theFitnessServ;
	}

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

	@Override
	public String dailyWorkOut() {
		return "BaseBall coach suuggested to run 40 km everyday";
	}

	@Override
	public String getAdditionalFitness() {
		// TODO Auto-generated method stub
		return fitnessServ.additionalFitness();
	}

}
