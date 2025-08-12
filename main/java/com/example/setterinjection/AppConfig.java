package com.example.setterinjection;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

    @Bean
    public Book book() {
        Book b = new Book();
        b.setTitle("Effective Java");
        return b;
    }

    @Bean
    public Library library() {
        Library lib = new Library();
        lib.setBook(book()); 
        return lib;
    }
}