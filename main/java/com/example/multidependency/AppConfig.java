package com.example.multidependency;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


@Configuration
public class AppConfig {
	@Bean
	 public University university() {
		return new University(faculty(),library());
   }
	@Bean
	public Faculty faculty() {
		return new Faculty("john");
	}
	@Bean
	public Library library() {
		return new Library("JAVA FRAMEWORK");
		
	}
}
