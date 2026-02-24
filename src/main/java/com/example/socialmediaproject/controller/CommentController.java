package com.example.socialmediaproject.controller;

import com.example.socialmediaproject.model.Comment;
import com.example.socialmediaproject.service.CommentService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/comments")
public class CommentController {

    private final CommentService commentService;

    public CommentController(CommentService commentService) {
        this.commentService = commentService;
    }

    // ADD COMMENT
    @PostMapping
    public Comment addComment(@RequestBody Comment comment) {
        return commentService.addComment(comment); // FIXED
    }

    // GET ALL COMMENTS
    @GetMapping
    public List<Comment> getComments() {
        return commentService.getAllComments();
    }

    // DELETE COMMENT
    @DeleteMapping("/{id}")
    public void deleteComment(@PathVariable Long id) {
        commentService.deleteComment(id);
    }
}