package com.example.socialmediaproject.service;

import com.example.socialmediaproject.exception.ResourceNotFoundException;
import com.example.socialmediaproject.model.Comment;
import com.example.socialmediaproject.repository.CommentRepo;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CommentService {

    private final CommentRepo commentRepo;

    public CommentService(CommentRepo commentRepo) {
        this.commentRepo = commentRepo;
    }

    // ADD COMMENT
    public Comment addComment(Comment comment) {
        return commentRepo.save(comment);
    }

    // GET ALL COMMENTS
    public List<Comment> getAllComments() {
        return commentRepo.findAll();
    }

    // GET COMMENTS BY POST ID
    public List<Comment> getCommentsByPostId(Long postId) {
        return commentRepo.findByPostId(postId);
    }

    // DELETE COMMENT
    public void deleteComment(Long id) {

        Comment comment = commentRepo.findById(id)
                .orElseThrow(() ->
                        new ResourceNotFoundException(
                                "Comment not found with id: " + id));

        commentRepo.delete(comment);
    }
}