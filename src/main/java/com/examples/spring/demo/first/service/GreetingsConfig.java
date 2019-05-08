package com.examples.spring.demo.first.service;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class GreetingsConfig {

	@Bean
	public GreetingsService greetingsService() {
		return new GreetingsServiceDefaultImpl();
	}
}
