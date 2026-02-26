package com.example.socialmediaproject.service;

import com.example.socialmediaproject.model.Comment;
import com.example.socialmediaproject.repository.CommentRepo;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CommentService {

    private final CommentRepo repo;

    public CommentService(CommentRepo repo) {
        this.repo = repo;
    }

    public Comment createComment(Comment c) {
        return repo.save(c);
    }

    public List<Comment> getAllComments() {
        return repo.findAll();
    }

    public void deleteComment(Long id) {
        repo.deleteById(id);
    }
}