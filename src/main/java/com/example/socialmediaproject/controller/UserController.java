package com.example.socialmediaproject.controller;

import com.example.socialmediaproject.model.User;
import com.example.socialmediaproject.service.UserService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {

    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    // ADD USER
    @PostMapping
    public User addUser(@RequestBody User user) {
        return userService.createUser(user);
    }

    // GET USERS
    @GetMapping
    public List<User> getUsers() {
        return userService.getAllUsers();
    }

    // GET USER BY ID
    @GetMapping("/{id}")
    public User getUserById(@PathVariable Long id) {
        return userService.getUserById(id);
    }

    // DELETE USER
    @DeleteMapping("/{id}")
    public void deleteUser(@PathVariable Long id) {
        userService.deleteUser(id);
    }
}