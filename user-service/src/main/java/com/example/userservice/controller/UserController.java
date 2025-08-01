package com.example.userservice.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

@RestController
public class UserController {
    @GetMapping("/users")
    public List<String> getUsers() {
        return List.of("Alice", "Bob", "Charlie");
    }
}
