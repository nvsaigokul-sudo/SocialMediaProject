package com.example.socialmediaproject.repository;

import com.example.socialmediaproject.model.Comment;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CommentRepo extends JpaRepository<Comment, Long> {

    // REQUIRED METHOD (Spring JPA auto creates query)
    List<Comment> findByPostId(Long postId);
}