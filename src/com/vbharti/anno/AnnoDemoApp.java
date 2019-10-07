package com.vbharti.anno;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnoDemoApp {
	public static void main(String[] args) {
		
		ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");
		TennisCoach tennisCoach=(TennisCoach) context.getBean("theTennisCoach",Coach.class);
		
		System.out.println(tennisCoach.getDailyWorkout());
		
		System.out.println(tennisCoach.getDailyFortune());
		
	}

}
