package com.demo.spring;

public class TrackCoach implements Coach {

	//define a private field
	private FortuneService fortuneService;
	
	//define a constructor.
	public TrackCoach(FortuneService thefortuneService) {
		fortuneService = thefortuneService; 
	}
	
	public TrackCoach() {
	}

	@Override
	public String getDailyWorkout() {
		return "hello head over and do a 5k run";
	}

	@Override
	public String getDailyFortune() {
		
		return fortuneService.getFortune();
	}

	//add an init method
	public void dostartupmethod(){
		
		System.out.println("Track Coach : inside my init method");
	}
	
	//add a destroy method
	public void docleanup() {
		
		System.out.println("Track Coach : inside my destroy method");
	}
}
