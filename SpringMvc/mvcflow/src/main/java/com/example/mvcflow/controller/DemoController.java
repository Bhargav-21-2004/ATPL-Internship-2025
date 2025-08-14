package com.example.mvcflow.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {
	@GetMapping("/hello")
	public String hello() {
		System.out.println("controller Handling the request");
		return "Hello Welcome to InterceptorHandler";
	}
	

}
