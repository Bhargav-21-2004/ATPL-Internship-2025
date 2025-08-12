package com.example.autowire;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class EmployeeField {
    @Autowired
    private Department department;

    public void showDetails() {
        System.out.println("Employee (Field Injection):");
        department.showDepartment();
    }
}
