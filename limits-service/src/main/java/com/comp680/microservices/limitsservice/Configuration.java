package com.comp680.microservices.limitsservice;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties("limits-service") //read everything that comes with the words limits-service  
public class Configuration {
	private int min;
	private int max;
	
	public void setMin(int min) {
		this.min = min;
	}
	public void setMax(int max) {
		this.max = max;
	}
	public int getMin() {
		return min;
	}
	public int getMax() {
		return max;
	}
	
	
}
