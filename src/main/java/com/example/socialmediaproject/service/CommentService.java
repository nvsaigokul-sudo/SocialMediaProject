package com.example.socialmediaproject.service;

import com.example.socialmediaproject.model.Comment;
import com.example.socialmediaproject.repository.CommentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CommentService {

    @Autowired
    private CommentRepo commentRepo;

    public Comment saveComment(Comment comment) {
        return commentRepo.save(comment);
    }

    public List<Comment> getAllComments() {
        return commentRepo.findAll();
    }
}