package com.example.restapi.controller;

import com.example.restapi.model.User;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/users")
public class UserController {
    private Map<Integer, User> userMap = new HashMap<>();

    
    @GetMapping("/{id}")
    public User getUserById(@PathVariable int id) {
        return userMap.get(id);
    }

    @PostMapping
    public String addUser(@RequestBody User user) {
        userMap.put(user.getId(), user);
        return "User added successfully!";
    }
}