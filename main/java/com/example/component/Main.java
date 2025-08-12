package com.example.component;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        TrainingCenter tc = context.getBean(TrainingCenter.class);
        tc.showTrainerDetails();
        context.close();
    }
}

