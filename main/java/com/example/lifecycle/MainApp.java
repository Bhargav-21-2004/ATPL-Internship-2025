package com.example.lifecycle;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainApp {
    public static void main(String[] args) {
        
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(AppConfig.class);

        System.out.println("Spring Container Initialized");

        Teacher annotationTeacher = context.getBean("teacher", Teacher.class);
        annotationTeacher.teach();

        Teacher xmlTeacher = context.getBean("teacherBean", Teacher.class);
        xmlTeacher.teach();
        context.close();
    }
}