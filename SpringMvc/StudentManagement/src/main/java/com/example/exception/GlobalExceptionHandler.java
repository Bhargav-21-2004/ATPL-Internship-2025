package com.example.exception;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(StudentNotFoundException.class)
    public String handleNotFound(StudentNotFoundException e, Model model) {
        model.addAttribute("message", e.getMessage());
        return "error"; 
    }
}
