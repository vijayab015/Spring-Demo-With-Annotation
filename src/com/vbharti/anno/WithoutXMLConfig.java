package com.vbharti.anno;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class WithoutXMLConfig {
	public static void main(String[] args) {
		
		AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext(SportsConfig.class);
		SportsConfig sc=context.getBean(SportsConfig.class);
		
		System.out.println(sc.getSports());
		context.close();
	}

}
