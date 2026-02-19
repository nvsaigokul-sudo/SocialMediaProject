package com.example.socialmediaproject.service;

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

    public User createUser(User user){
        return userRepo.save(user);
    }

    public List<User> getAllUsers(){
        return userRepo.findAll();
    }
}
