package com.security.springsecurity.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
	
	@GetMapping("/hello")
		public String hello() {
		return "Hello this is Spring Security";
	}
	@GetMapping("/public")
	public String publicEndPoint() {
		return "this is public Endpoint";
	}
	

}
