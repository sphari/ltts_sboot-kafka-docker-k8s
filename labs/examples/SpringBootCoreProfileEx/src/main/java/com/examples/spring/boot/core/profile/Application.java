package com.examples.spring.boot.core.profile;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.examples.spring.boot.core.profile.service.DbConnectionConfig;
import com.examples.spring.boot.core.profile.service.MonitoringService;
import com.examples.spring.boot.core.profile.service.WeatherService;

@SpringBootApplication
public class Application implements CommandLineRunner {

//    @Autowired
//    private WeatherService weatherService;
//    
//    @Autowired
//    private MonitoringService monitoringService;
	
	@Autowired
	DbConnectionConfig dbConfig;

    @Override
    public void run(String... args) throws Exception {
//        System.out.println(weatherService.forecast());
//        System.out.println(monitoringService.getHealthStatus());
    	System.out.println(dbConfig.getDbname());
    }

    public static void main(String[] args) throws Exception {
        SpringApplication.run(Application.class, args);
    }

}
