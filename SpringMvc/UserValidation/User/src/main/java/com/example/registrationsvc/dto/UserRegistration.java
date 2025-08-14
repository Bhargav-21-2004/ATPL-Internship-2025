package com.example.registrationsvc.dto;

import jakarta.validation.constraints.NotBlank;
@PasswordMatches
public class UserRegistration {
	@NotBlank(message="username is required")
	private String username;
	@NotBlank(message="password is required")
	private String password;
	@NotBlank(message="Confirm password is required")
	private String confirmPassword;
	private Integer age;
	public UserRegistration() {
	}
	public UserRegistration(String username, String password,String confirmPassword, Integer age) {
		this.username = username;
		this.password = password;
		this.confirmPassword = confirmPassword;
		this.age = age;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getConfirmPassword() {
		return confirmPassword;
	}
	public void setConfirmPassword(String confirmPassword) {
		this.confirmPassword = confirmPassword;
	}
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	
	

}
