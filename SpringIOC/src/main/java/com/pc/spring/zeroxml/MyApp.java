package com.pc.spring.zeroxml;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MyApp {
	public static void main(String[] args) {

		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MyConfig.class);

		BaseBallCoach theBBC = context.getBean("testBaseBallCoachZeroXml", BaseBallCoach.class);

		System.out.println(theBBC.getName());

		
		context.close();

	}

}
