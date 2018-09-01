package com.examples.spring.boot.core.profile.service;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Component
@Profile("prod")
public class MonitoringService {
	
	public String getHealthStatus()
	{
		return "OK";
	}

}
