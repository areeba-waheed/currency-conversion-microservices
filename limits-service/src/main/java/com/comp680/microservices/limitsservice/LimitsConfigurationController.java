package com.comp680.microservices.limitsservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.comp680.microservices.limitsservice.bean.LimitConfiguration;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;

@RestController
public class LimitsConfigurationController {
	
	/*@GetMapping("/limits")
	public LimitConfiguration retrieveLimitsfreomConfigurations() {
		return new LimitConfiguration(100,1);
	}*/
	
	@Autowired
	private Configuration config;
	
	@GetMapping("/limits")
	public LimitConfiguration retrieveLimitsfreomConfigurations() {
		return new LimitConfiguration(config.getMax(),config.getMin());
	}
	
	@GetMapping("/hystrix-fault-example")
	@HystrixCommand(fallbackMethod="fallbackRetrieveConfiguration")
	public LimitConfiguration retrieveConfigurations() {
		throw new RuntimeException("Not available");
	}
	
	public LimitConfiguration fallbackRetrieveConfiguration() {
		return new LimitConfiguration(9,999);
	}
}
