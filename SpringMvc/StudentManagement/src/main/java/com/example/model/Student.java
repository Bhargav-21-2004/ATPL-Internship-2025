package com.example.model;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

public class Student {
    private Long id;

    @NotBlank(message = "Name is required")
    @Size(max = 100, message = "Name must be <= 100 chars")
    private String name;

    @NotBlank(message = "Email is required")
    @Email(message = "Invalid email format")
    private String email;

    private String course;
    public Student() {}
    public Student(Long id, String name, String email, String course) {
        this.id = id; this.name = name; this.email = email; this.course = course;
    }
    public Long getId() { 
    	return id; 
    	}
    public void setId(Long id){
    	this.id = id; 
    	}
    public String getName() { 
    	return name;
    	}
    public void setName(String name) {
    	this.name = name;
    	}
    public String getEmail() { 
    	return email; 
    	}
    public void setEmail(String email) { 
    	this.email = email; 
    	}
    public String getCourse() { 
    	return course;
    	}
    public void setCourse(String course) { 
    	this.course = course; 
    	}
}