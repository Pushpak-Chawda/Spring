package com.pc.spring.annotation.di;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyApp {
	public static void main(String[] args) {

		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
				"applicationContext_annotation.di.xml");

		Coach theBBC = context.getBean("baseBallCoach", Coach.class);
		
		System.out.println("Insert here");
	System.out.println(theBBC.dailyWorkOut());	
	System.out.println(theBBC.getAdditionalFitness());
		context.close();

	}

}
