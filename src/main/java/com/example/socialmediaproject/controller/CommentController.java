package com.example.socialmediaproject.controller;

import com.example.socialmediaproject.model.Comment;
import com.example.socialmediaproject.service.CommentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/comments")
public class CommentController {

    @Autowired
    private CommentService commentService;

    @PostMapping
    public Comment addComment(@RequestBody Comment comment) {
        return commentService.saveComment(comment);
    }

    @GetMapping
    public List<Comment> getComments() {
        return commentService.getAllComments();
    }
}