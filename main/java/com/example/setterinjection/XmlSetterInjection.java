package com.example.setterinjection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class XmlSetterInjection {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");

        Library library = context.getBean("libraryBean", Library.class);
        library.showLibraryDetails();
    }
}