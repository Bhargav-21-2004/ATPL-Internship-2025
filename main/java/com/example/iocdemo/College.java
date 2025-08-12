package com.example.iocdemo;

public class College {
	private Student student;
	public College() {
		System.out.println("College object is created");
	}
	public void setStudent(Student student) {
		this.student=student;
	}
	public void showCollegeDetails() {
		System.out.println("College has student:");
		student.display();
	}

}
