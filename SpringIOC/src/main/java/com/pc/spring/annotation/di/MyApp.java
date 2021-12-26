package com.pc.spring.annotation.di;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyApp {
	public static void main(String[] args) {

		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
				"applicationContext_annotation.di.xml");

		/**
		 * 
		 * After instantiating the bean Core contained could not initialize it and will
		 * fail with the following error
		 * 
		 * Unsatisfied dependency expressed through field 'fitnessServ'; nested
		 * exception is
		 * org.springframework.beans.factory.NoUniqueBeanDefinitionException:
		 * 
		 * Since here FitnessService has multiple implementation and there is an
		 * ambiguity for containes to uderstand which one to inject.
		 * 
		 * To make hm understand use @Qualifier
		 * 
		 * 
		 * 
		 */

		Coach theBBC = context.getBean("baseBallCoach", Coach.class);

		System.out.println(theBBC.dailyWorkOut());
		System.out.println(theBBC.getAdditionalFitness());
		context.close();

	}

}
