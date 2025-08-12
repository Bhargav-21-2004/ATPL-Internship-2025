package com.example.restapi.service;

import org.springframework.stereotype.Service;

@Service
public class GreetingService {
	public String greet() {
		return "hello from Greeting Service";
	}

}
