package com.demo.spring;

public class CricketCoach implements Coach{

	//define a private field
	private FortuneService fortuneService;
	
	private String emailAddress;
	private String team;
		
	public void setEmailAddress(String emailAddress) {
		System.out.println("CricketCoach : inside the emailAddress setter method.");
		this.emailAddress = emailAddress;
	}

	public void setTeam(String team) {
		System.out.println("CricketCoach : inside the team setter method.");
		this.team = team;
	}

	public CricketCoach() {
		System.out.println("CricketCoach : inside no-args constructor");
	}
	
	public String getEmailAddress() {
		return emailAddress;
	}

	public String getTeam() {
		return team;
	}

	public void setFortuneService(FortuneService fortuneService) {
		System.out.println("CricketCoach : inside the fortuneservice setter method.");
		this.fortuneService = fortuneService;
	}

	@Override
	public String getDailyWorkout() {
		return "hey, go hit ball over the net 50 times.";
	}

	@Override
	public String getDailyFortune() {
		
		//use my fortuneService to give fortune
		return fortuneService.getFortune();
	}

}
