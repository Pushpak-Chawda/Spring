package com.pc.spring.di;

import com.pc.spring.di.Coach;
import com.pc.spring.di.Investor;

public class BaseBallCoach implements Coach{

	private Investor investor;
	
	
	/*
	 * public BaseBallCoach (Investor investor) {
	 * 
	 * this.investor=investor; }
	 */
	
	public BaseBallCoach() {
		
		System.out.println("Spring IOC shuld call me ......");
	}
	
	
	
	public Investor getInvestor() {
		return investor;
	}

	public void setInvestor(Investor investor) {
		this.investor = investor;
	}

	@Override
	public String dailyWorkOut() {
		
		System.out.println(investor.getInvestor());
		
		return "Please do Walk for atleast 30 mins";
	}
	
	
}
