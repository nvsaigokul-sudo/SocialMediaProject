package com.example.socialmediaproject.controller;

import com.example.socialmediaproject.model.User;
import com.example.socialmediaproject.service.UserService;
import org.springframework.security.core.Authentication;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class UserController {

    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @PostMapping("/users")
    public User createUser(@RequestBody User user) {
        return userService.createUser(user);
    }

    @GetMapping("/users")
    public List<User> getAllUsers(Authentication authentication) {

        String username = authentication.getName();

        if (!username.equals("admin")) {
            throw new RuntimeException("Only admin allowed");
        }

        return userService.getAllUsers();
    }

    @DeleteMapping("/users/{id}")
    public String deleteUser(@PathVariable Long id) {
        userService.deleteUser(id);
        return "Deleted";
    }
}