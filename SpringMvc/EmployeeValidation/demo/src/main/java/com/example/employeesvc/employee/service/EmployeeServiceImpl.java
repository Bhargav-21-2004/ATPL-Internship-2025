package com.example.employeesvc.employee.service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicLong;

import org.springframework.stereotype.Service;

import com.example.employeesvc.employee.dto.EmployeeRequest;
import com.example.employeesvc.employee.model.Employee;
import com.example.employeesvc.exception.NotFoundException;

@Service
public  class EmployeeServiceImpl  implements EmployeeService{
	private final Map<Long,Employee> store = new HashMap<>();
	private final AtomicLong seq =new AtomicLong(0);
	
	
	public Employee create (EmployeeRequest req) {
		long id = seq.incrementAndGet();
		Employee e =new Employee(id,req.name(),req.email(),req.salary());
		store.put(id,e);
		return e;
	}
	public List<Employee> findAll(){
		return new ArrayList<>(store.values());
	}
	@Override
	public Employee findById(long id) {
		Employee e = store.get(id);
		if(e==null) throw new NotFoundException("Employee With id " + id +"not found");
		return e;
	}

}
