package com.example.valueinjection;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
		Product product = context.getBean(Product.class);
		product.printDetails();
		context.close();
	}

}
