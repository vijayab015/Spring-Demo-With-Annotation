package com.vbharti.anno;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.vbharti.anno")
public class SportsConfig {
	public String getSports() {
		return "We play Cricket Daily";
	}

}
