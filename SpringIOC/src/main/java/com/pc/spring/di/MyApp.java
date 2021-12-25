package com.pc.spring.di;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class MyApp 
{
    public static void main( String[] args )
    {
        //Coach myCoach = new  CricketCoach();
        
        //System.out.println(myCoach.dailyWorkOut());
        
      ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext_di.xml");
        
        
    //  Coach theBBCoach= context.getBean("baseBC", Coach.class);
      
      CricketCoach theCCCoach= context.getBean("baseCC", CricketCoach.class);
     
       
        System.out.println(theCCCoach.dailyWorkOut());
        
        System.out.println("Player name is  "+theCCCoach.getName() +" and location is "+theCCCoach.getLocation());
        
    }
}
