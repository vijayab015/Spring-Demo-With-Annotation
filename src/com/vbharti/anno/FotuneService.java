package com.vbharti.anno;

import org.springframework.stereotype.Component;

@Component
public class FotuneService implements Fortune {

	@Override
	public String getFortune() {
		
		return "Today is your lucky day";
	}

}
