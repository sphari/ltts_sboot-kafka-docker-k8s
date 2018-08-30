package com.examples.spring.boot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication	// same as @Configuration @EnableAutoConfiguration @ComponentScan
public class SpringBootSimpleEx {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootSimpleEx.class, args);
		System.out.println("Welcome to Spring Boot training :) - Spring Boot Simple example!");
	}
}
