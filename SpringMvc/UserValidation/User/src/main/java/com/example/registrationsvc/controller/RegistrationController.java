package com.example.registrationsvc.controller;

import com.example.registrationsvc.dto.UserRegistration;
import jakarta.validation.Valid;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.net.URI;
import java.util.Map;

@RestController
@RequestMapping("/api")
public class RegistrationController {

    @PostMapping("/register")
    public ResponseEntity<Map<String, Object>> register(@Valid @RequestBody UserRegistration request) {
        return ResponseEntity.created(URI.create("/api/register/" + request.getUsername()))
                .body(Map.of("message", "User registered", "username", request.getUsername()));
    }
}