package com.example.iocdemo;

public class Student {
	private String name;
	public Student() {
		System.out.println("Student object is created");
	}
	public void setName(String name) {
		this.name=name;
	}
	public void display() {
		System.out.println(" student name:" +name);
	}

}
