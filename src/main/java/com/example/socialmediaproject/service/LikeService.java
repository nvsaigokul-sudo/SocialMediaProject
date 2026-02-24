package com.example.socialmediaproject.service;

import com.example.socialmediaproject.exception.ResourceNotFoundException;
import com.example.socialmediaproject.model.Like;
import com.example.socialmediaproject.repository.LikeRepo;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LikeService {

    private final LikeRepo likeRepo;

    public LikeService(LikeRepo likeRepo) {
        this.likeRepo = likeRepo;
    }

    // ADD LIKE
    public Like likePost(Like like) {
        return likeRepo.save(like);
    }

    // GET ALL LIKES
    public List<Like> getAllLikes() {
        return likeRepo.findAll();
    }

    // DELETE LIKE
    public void dislikePost(Long id) {

        Like like = likeRepo.findById(id)
                .orElseThrow(() ->
                        new ResourceNotFoundException(
                                "Like not found with id: " + id));

        likeRepo.delete(like);
    }
}