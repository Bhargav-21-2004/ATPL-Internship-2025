package com.example.multidependency;

public class Library {
	private String Title;
	public Library(String Title) {
		this.Title=Title;
	}
	public Library() {
		// TODO Auto-generated constructor stub
	}
	public String getname(){
		return Title;	
	}
	public void setname(String Title) {
		this.Title=Title;
	}
	public void LibraryDetails() {
		System.out.println("library Title:"+Title);
	}
	
}
