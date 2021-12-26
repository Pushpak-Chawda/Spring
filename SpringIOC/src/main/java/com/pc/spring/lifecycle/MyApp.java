package com.pc.spring.lifecycle;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyApp {
	public static void main(String[] args) {

		//System.out.println("Lets undestand the Singleton Bean Lifecycle........");

		/*
		 *   call default constructor
		 *   set the property from configuration 
		 *   call afterProperties set method from Initializing bean Interface
		 *   call custom init method 
		 *   Print the property name 
		 *   call the destroy method from DisposableBean
		 *   Interface call custom destroy method
		 * 
		 */

		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext_lifecycle.xml");

		//BaseBallCoach theBBC1 = context.getBean("baseBC", BaseBallCoach.class);

		//System.out.println(theBBC1.getName());

		System.out.println("Lets undestand the Prototype Bean Lifecycle........");

		CricketCoach theCCC1 = context.getBean("cricketC", CricketCoach.class);

		System.out.println(theCCC1.getName());
		context.close();

	}

}
