package com.demo.spring;

public class HappyFortuneService implements FortuneService{

	@Override
	public String getFortune() {
		
		return "Yayy!! It's your lucky Day!";
	}

	
}
