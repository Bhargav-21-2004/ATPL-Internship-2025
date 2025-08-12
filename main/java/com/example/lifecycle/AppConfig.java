package com.example.lifecycle;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;

@Configuration
@ImportResource("classpath:beans.xml") 
public class AppConfig {   
    @Bean
    public Teacher teacher() {
        return new Teacher();
    }
}