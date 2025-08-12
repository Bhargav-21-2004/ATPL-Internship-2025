package com.example.demo.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.example.restapi.service.GreetingService;
@Configuration
public class AppConfig {
	@Bean
	public GreetingService greetingService() {
		return new GreetingService();
	}

}
