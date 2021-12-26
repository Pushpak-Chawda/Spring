package com.pc.spring.annotation.di;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

// option 1: @Component("testBaseBallCoach")

//option2 : IOC will cfreate a bean with Id baseBallCoach

@Component
public class BaseBallCoach implements Coach {
	
	//Option 3 Field Level
	@Autowired
	private FitnessService fitnessServ;
	
	
	//Option 1 Constructor Based Injection
	
	/*
	 * @Autowired public BaseBallCoach(FitnessService theFitnessServ) { fitnessServ
	 * = theFitnessServ; }
	 */

	//Option 2 Setter Based Injection
	
	public BaseBallCoach() {

		System.out.println("I am from default constructor......");
	}

	/*
	 * public FitnessService getFitnessServ() { return fitnessServ; }
	 * 
	 * 
	 * @Autowired public void setFitnessServ(FitnessService fitnessServ) {
	 * System.out.println("Injectiog Dependency through Setter Method...... ");
	 * 
	 * this.fitnessServ = fitnessServ; }
	 */

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
