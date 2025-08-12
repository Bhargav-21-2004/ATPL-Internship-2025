package com.example.constructorinjection;

public class Faculty {
	private Course course;
	public Faculty(Course course) {
		this.course=course;
	}
	public void teach() {
		System.out.println("Faculty is teaching" + course);
		course.display();
	}

}
