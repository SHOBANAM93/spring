package com.demo.spring;

public class BaseballCoach implements Coach{
	
	//define a private field
	private FortuneService fortuneService;
	
	//define a constructor.
	public BaseballCoach(FortuneService thefortuneService) {
		fortuneService = thefortuneService; 
	}
	
	@Override
	public String getDailyWorkout() {
		
		return "spend 30 minutes on batting practice file";
	}

	@Override
	public String getDailyFortune() {
		
		return fortuneService.getFortune();
	}

}
