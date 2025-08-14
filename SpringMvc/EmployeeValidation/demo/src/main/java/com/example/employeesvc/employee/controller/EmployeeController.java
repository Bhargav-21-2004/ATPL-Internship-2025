
package com.example.employeesvc.employee.controller;

import com.example.employeesvc.employee.dto.EmployeeRequest;
import com.example.employeesvc.employee.model.Employee;
import com.example.employeesvc.employee.service.EmployeeService;
import jakarta.validation.Valid;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.net.URI;
import java.util.List;

@RestController
@RequestMapping("/api/employees")
public class EmployeeController {
  private final EmployeeService service;
  public EmployeeController(EmployeeService service) {
	  this.service = service;
	  }

  @PostMapping
  public ResponseEntity<Employee> create(@Valid @RequestBody EmployeeRequest request) {
    Employee created = service.create(request);
    return ResponseEntity.created(URI.create("/api/employees/" + created.getId())).body(created);
  }
  @GetMapping("/{id}")
  public Employee getOne(@PathVariable Long id) {
	  return service.findById(id); 
	  }
  @GetMapping public List<Employee> getAll() {
	  return service.findAll(); 
	  }
}