package com.example.employeesvc.employee.service;

import java.util.List;

import com.example.employeesvc.employee.dto.EmployeeRequest;
import com.example.employeesvc.employee.model.Employee;

public interface EmployeeService {
	Employee create(EmployeeRequest request);
	Employee findById(long id);
	List<Employee>findAll();
}
