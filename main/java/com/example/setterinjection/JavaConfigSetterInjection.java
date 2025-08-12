package com.example.setterinjection;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class JavaConfigSetterInjection {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

        Library library = context.getBean(Library.class);
        library.showLibraryDetails();

        context.close();
    }
}