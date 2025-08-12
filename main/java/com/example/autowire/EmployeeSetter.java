package com.example.autowire;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class EmployeeSetter {
    private Department department;

    @Autowired
    public void setDepartment(Department department) {
        this.department = department;
    }

    public void showDetails() {
        System.out.println("Employee (Setter Injection):");
        department.showDepartment();
    }
}
