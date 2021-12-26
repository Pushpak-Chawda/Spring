package com.pc.spring.scope;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyApp {
	public static void main(String[] args) {

		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext_scope.xml");

		BaseBallCoach theBBC1 = context.getBean("baseBC", BaseBallCoach.class);
		BaseBallCoach theBBC2 = context.getBean("baseBC", BaseBallCoach.class);

		
		// check whether the both single instance pointing to the same object
		System.out.println(" Whether the both reference are same  " + (theBBC1 == theBBC2));

		System.out.println("Injected Properties  from ref 1 is " + theBBC1.getName() + "  from reference 2 is  "
				+ theBBC2.getName());

		System.out.println("Memory location ref 1 is " + theBBC1 + "  from reference 2 is  " + theBBC2);

		BaseBallCoach theBBC3 = theBBC2;

		System.out.println(" Whether the reference 3 is same  " + (theBBC2 == theBBC3));

		System.out.println("Lets deal with prototype reference");

		CricketCoach theCCC1 = context.getBean("cricketC", CricketCoach.class);
		CricketCoach theCCC2 = context.getBean("cricketC", CricketCoach.class);

		System.out.println(" Whether the both Protype reference are same  " + (theCCC1 == theCCC2));

		System.out.println("Injected Properties  from Prototype ref 1 is " + theCCC1.getName() + "  from reference 2 is  "
				+ theCCC2.getName());

		System.out.println("Memory location ref 1 is " + theCCC1 + "  from reference 2 is  " + theCCC2);

		CricketCoach theCCC3 = theCCC1;

		System.out.println(" Whether the Prototype reference 3 is same  " + (theCCC3 == theCCC1));

		System.out.println("Memory location Prototype ref 1 is " + theCCC1 + "  from reference 3 is  " + theCCC3);
		
		
		context.close();

	}
}
