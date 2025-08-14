package com.example.mvcflow.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import com.example.mvcflow.interceptor.LoggingInterceptor;
@Configuration
public class WebConfig implements WebMvcConfigurer {
	public void addInterceptors(InterceptorRegistry registry) {
		registry.addInterceptor(new LoggingInterceptor());
		
	}

}
