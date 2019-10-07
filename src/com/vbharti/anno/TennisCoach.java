package com.vbharti.anno;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("theTennisCoach")
public class TennisCoach implements Coach {
	
	private Fortune fs;
	
	
@Autowired
	public TennisCoach(Fortune fs)
	{
		this.fs=fs;
	}

	@Override
	public String getDailyWorkout() {
		
		return "Daily Practice alteast 1 hr ";
	}

	@Override
	public String getDailyFortune() {
		
		return fs.getFortune();
	}

}
