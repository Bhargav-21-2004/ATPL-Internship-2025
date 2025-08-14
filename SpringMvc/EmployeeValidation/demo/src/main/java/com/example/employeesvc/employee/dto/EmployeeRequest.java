package com.example.employeesvc.employee.dto;

import java.math.BigDecimal;

import jakarta.validation.constraints.NotBlank;

public record EmployeeRequest (
	
		@NotBlank(message="Name must not be blank")
		String name,
		@NotBlank(message="mail must not be blank")
		String email,
		BigDecimal salary) {}
