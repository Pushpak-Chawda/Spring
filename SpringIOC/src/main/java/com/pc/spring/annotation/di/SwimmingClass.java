package com.pc.spring.annotation.di;

import org.springframework.stereotype.Component;

@Component
public class SwimmingClass implements FitnessService{

	@Override
	public String additionalFitness() {
		
		return "Please do swimming....";
	}

}
