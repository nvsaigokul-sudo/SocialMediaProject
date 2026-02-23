package com.example.socialmediaproject.repository;

import com.example.socialmediaproject.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepo extends JpaRepository<User, Long> {}