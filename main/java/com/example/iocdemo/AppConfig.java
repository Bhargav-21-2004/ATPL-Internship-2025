package com.example.iocdemo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
@Configuration
public class AppConfig {
	@Bean
	public Student student() {
		Student s = new Student();
		s.setName("Bhargav sai");
		return s;
		
	}
	@Bean
	public College college() {
		College c = new College();
		c.setStudent(student());
		return c;
	}

}
