package com.example.multidependency;

public class University {
	private Faculty faculty;
	private Library library;
	
	public University(Faculty faculty,Library library) {
		this.faculty=faculty;
		this.library=library;
	}
	public void universityDetails() {
		System.out.println("univeristy HAS: ");
		faculty.facultyDetails();
		library.LibraryDetails();
	}
	
	
	
}


