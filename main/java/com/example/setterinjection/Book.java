package com.example.setterinjection;

public class Book {
	private String Title;
	public Book() {
		System.out.println("Book object is created");
	}
	public void setTitle(String Title){
		this.Title=Title;
	}
	public void display() {
		System.out.println("book Title:" +Title);
	}

}
