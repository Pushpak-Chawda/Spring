package com.pc.spring.annotation.initial;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyApp {
	public static void main(String[] args) {

		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext_annotation.xml");

		
		 BaseBallCoach theBBC = context.getBean("testBaseBallCoach",
		 BaseBallCoach.class); 
		 
		 System.out.println(theBBC.getName());
		

		context.close();

	}

}
