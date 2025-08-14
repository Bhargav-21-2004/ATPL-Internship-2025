package com.example.employeesvc.common.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import com.example.employeesvc.exception.NotFoundException;

import java.util.List;

@ControllerAdvice
public class GlobalExceptionHandler {
  @ExceptionHandler(MethodArgumentNotValidException.class)
  public ResponseEntity<ApiError> handleValidation(MethodArgumentNotValidException ex) {
    List<String> errors = ex.getBindingResult()
        .getAllErrors()
        .stream()
        .map(ObjectError::getDefaultMessage)
        .toList();
    return ResponseEntity.status(HttpStatus.BAD_REQUEST)
        .body(new ApiError(HttpStatus.BAD_REQUEST.value(), errors));
  }

  @ExceptionHandler(NotFoundException.class)
  public ResponseEntity<ApiError> handleNotFound(NotFoundException ex) {
    return ResponseEntity.status(HttpStatus.NOT_FOUND)
        .body(new ApiError(HttpStatus.NOT_FOUND.value(), List.of(ex.getMessage())));
  }

  @ExceptionHandler(Exception.class)
  public ResponseEntity<ApiError> handleOther(Exception ex) {
    return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR)
        .body(new ApiError(HttpStatus.INTERNAL_SERVER_ERROR.value(), List.of("Unexpected error")));
  }
}