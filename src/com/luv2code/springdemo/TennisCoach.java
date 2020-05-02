package com.luv2code.springdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")

public class TennisCoach implements Coach {
	
	// field injection
	@Autowired
	@Qualifier("randomFortuneService")
	private FortuneService fortuneService;
	
	 public TennisCoach() {
		System.out.println("inside defalut constuctor");
	}
	
	 
	 
	/*// define setter method
	 @Autowired
	 public void setFortuneService(FortuneService fortuneService) {
			this.fortuneService = fortuneService;
		}*/
	 
	 /*//using own method
	 @Autowired
	 public void doSomeCrazyStuff(FortuneService fortuneService) {
		System.out.println("inside setter method doSomeCrazyStuff()");
		 this.fortuneService = fortuneService;
		}*/
	
	/*@Autowired   for constructor injection
	public TennisCoach(FortuneService theFortuneService)
	{
		fortuneService=theFortuneService;
	}*/

	

	@Override
	public String getDailyWorkOut() {
		// TODO Auto-generated method stub
		return "practice your backend volley";
	}

	

	@Override
	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return fortuneService.getFortune();
	}

}
 