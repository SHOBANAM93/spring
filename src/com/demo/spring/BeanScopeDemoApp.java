package com.demo.spring;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanScopeDemoApp {

	public static void main(String[] args) {
		
		//load the spring config file
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beanScope-applicationContext.xml");
		
		//retrieve bean from spring container
		Coach theCoach = context.getBean("myCoach",Coach.class);
		
		Coach alphaCoach = context.getBean("myCoach",Coach.class);
		
		
		//check if they are same
		boolean result = (theCoach == alphaCoach);
		
		//print result
		System.out.println("pointing to same object : " + result);
		
		System.out.println("Memory location of thecoach : " + theCoach);
		System.out.println("Memory location of alphacoach : " + alphaCoach);
	}

}
