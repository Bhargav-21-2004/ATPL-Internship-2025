package com.example.multidependency;

public class Faculty {
	private String name;
	public Faculty(String name) {
		this.name=name;
	}
	public String getname(){
		return name;	
	}
	public void setname(String name) {
		this.name=name;
	}
	public void facultyDetails() {
		System.out.println("Facluty name:"+ name);
	}
	
}
