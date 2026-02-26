package com.example.socialmediaproject.repository;

import com.example.socialmediaproject.model.Post;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PostRepo extends JpaRepository<Post, Long> {
}