package com.pc.spring.zeroxml;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.jws.soap.InitParam;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

// option 1: @Component("testBaseBallCoach")

//option2 : IOC will cfreate a bean with Id baseBallCoach


@Scope("singleton")
@PropertySource("classpath:personal_details.properties")

@Component("testBaseBallCoachZeroXml")
public class BaseBallCoach {

	@Value("${person.name}")
	private String name;

	public String getName() {
		return name;
	}

	@PostConstruct
	public void m1() {

		System.out.println("I am from Post construct method m1....");
	}

	@PreDestroy
	public void m2() {

		System.out.println("I am from Pre Destroy method m2....");
	}

}
