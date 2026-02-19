package com.example.socialmediaproject.service;

import com.example.socialmediaproject.repository.CommentRepo;
import org.springframework.stereotype.Service;

@Service
public class CommentService {

    private final CommentRepo commentRepo;

    public CommentService(CommentRepo commentRepo) {
        this.commentRepo = commentRepo;
    }
}
