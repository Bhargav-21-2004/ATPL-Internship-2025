package com.example.autowire;

import org.springframework.stereotype.Component;

@Component
public class Department {
    public Department() {
        System.out.println("Department bean created.");
    }

    public void showDepartment() {
        System.out.println("Belongs to Electrical Engineering Department.");
    }
}
