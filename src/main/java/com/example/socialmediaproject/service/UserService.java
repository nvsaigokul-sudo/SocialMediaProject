package com.example.socialmediaproject.service;

import com.example.socialmediaproject.exception.ResourceNotFoundException;
import com.example.socialmediaproject.model.User;
import com.example.socialmediaproject.repository.UserRepo;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    private final UserRepo userRepo;

    public UserService(UserRepo userRepo) {
        this.userRepo = userRepo;
    }

    // CREATE USER
    public User createUser(User user) {
        return userRepo.save(user);
    }

    // GET ALL USERS
    public List<User> getAllUsers() {
        return userRepo.findAll();
    }

    // GET USER BY ID
    public User getUserById(Long id) {
        return userRepo.findById(id)
                .orElseThrow(() ->
                        new ResourceNotFoundException(
                                "User not found with id: " + id));
    }

    // DELETE USER
    public void deleteUser(Long id) {
        User user = getUserById(id);
        userRepo.delete(user);
    }
}