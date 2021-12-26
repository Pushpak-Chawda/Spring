package com.pc.spring.lifecycle;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class BaseBallCoach implements InitializingBean, DisposableBean{

	public BaseBallCoach () {
		
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

	@Override
	public void destroy() throws Exception {
		
		System.out.println("From destroy method of DisposableBean interface.....");
	}

	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("From After Properties Set method from Initializing Bean interface.....");
		
	}
	
	
	public void doStartupJob() {
		
		System.out.println("From custom init.....");
	}
	
	public void doCleanUp() {
		
		System.out.println("From custom destroy method.....");
	}
	
}
