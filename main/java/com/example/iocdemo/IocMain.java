package com.example.iocdemo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class IocMain {
	public static void main(String[]args) {
		
			@SuppressWarnings("resource")
			ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
			College college = context.getBean("collegeBean",College.class);
			college.showCollegeDetails();
		   
		
		
	}

}
