package com.example.valueinjection;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
@Component
public class Product {
	@Value("Laptop")
	private String name;
	@Value("50000")
	private double price;
	@Value("#{50000 * 0.9}")
	private double discountedPrice;
	@Value("true")
	private boolean inStock;
	@Value("#{${product.inStock:true} ? 'Available for purchase':'out of stock'}")
	private String availabilityMessage;
	public void printDetails() {
		System.out.println("Product:"+ name);
		System.out.println("Price:"+price);
		System.out.println("Discount price:" + discountedPrice);
		System.out.println("InStock:" +inStock );
		System.out.println("AvailabilityMessage:" + availabilityMessage );
	} 
	

}
