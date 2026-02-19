package com.example.socialmediaproject.repository;

import com.example.socialmediaproject.model.Comment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CommentRepo extends JpaRepository<Comment, Long> {
}
