package com.luv2code.springdemo;

import java.util.Random;

import org.springframework.stereotype.Component;

@Component
public class RandomFortuneService implements FortuneService {

	// create an array of string
	
	private String[] data= {
		"hello",
		"bhaskar",
		"BEL"
	};
	
	//create Random number
	private Random myrandom=new Random();
	
	 
	@Override
	public String getFortune() {
		int index=myrandom.nextInt(data.length);
		String theFortune=data[index];
		
		return theFortune;
				}

}
