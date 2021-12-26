package com.pc.spring.annotation;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyApp {
	public static void main(String[] args) {

		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
				"applicationContext_annotation.xml");

		BaseBallCoach theBBC = context.getBean("baseBallCoach", BaseBallCoach.class);
		theBBC.m1();

		context.close();

	}

}
