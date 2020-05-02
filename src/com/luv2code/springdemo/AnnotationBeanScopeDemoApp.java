package com.luv2code.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationBeanScopeDemoApp {

	public static void main(String[] args) {
		
		//  load spring config file
		ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("ApplicationContext.xml");
		
		// retrive bean from spring container
		Coach theCoach=context.getBean("tennisCoach", Coach.class);
		Coach alphaCoach=context.getBean("tennisCoach", Coach.class);

		// check if they are the same
		boolean result=(theCoach==alphaCoach);
		
		//print out the result
		System.out.println("pointing to the same object:"+ result);
	    System.out.println("\n memory location for the theCoach: " + theCoach);
     	System.out.println("\n memory location for the alphaCoach: " + alphaCoach);
	
	//close the  context
	
	context.close();
	
	
	
	}

}
