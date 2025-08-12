package com.example.constructorinjection;

public class Course {
	private String courseName;
	public Course(String courseName) {
		this.courseName=courseName;
	}
	public String getCourseName() {
		return courseName;
	}
	public void display() {
		System.out.println("courseName:" + courseName);
	}

}
