package com.demo.spring;

import java.util.Random;

public class RandomFortuneService implements FortuneService{

	@Override
	public String getFortune() {
		
		String[] fortune = {"Hey champ! Today is your lucky day.","Aww!! Keep your chin up and gaze at the stars.","March forward... The day is yours to conquer!"};
		Random random = new Random();
		String random_fortune = fortune[random.nextInt(fortune.length)];
		return random_fortune;
	}

}
