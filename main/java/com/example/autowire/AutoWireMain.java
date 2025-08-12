package com.example.autowire;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AutoWireMain {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

        EmployeeField empField = context.getBean(EmployeeField.class);
        empField.showDetails();

        EmployeeSetter empSetter = context.getBean(EmployeeSetter.class);
        empSetter.showDetails();

        EmployeeConstructor empConstructor = context.getBean(EmployeeConstructor.class);
        empConstructor.showDetails();

        context.close();
    }
}
