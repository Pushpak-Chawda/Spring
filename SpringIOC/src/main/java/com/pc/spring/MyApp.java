package com.pc.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class MyApp 
{
    public static void main( String[] args )
    {
        //Coach myCoach = new  CricketCoach();
        
        //System.out.println(myCoach.dailyWorkOut());
        
      ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        
        
      Coach theCoach= context.getBean("baseBC", Coach.class);
       
        System.out.println(theCoach.dailyWorkOut());
        
    }
}
