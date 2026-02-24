package com.example.socialmediaproject.controller;

import com.example.socialmediaproject.model.Like;
import com.example.socialmediaproject.service.LikeService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/likes")
public class LikeController {

    private final LikeService likeService;

    public LikeController(LikeService likeService) {
        this.likeService = likeService;
    }

    // ADD LIKE
    @PostMapping
    public Like addLike(@RequestBody Like like) {
        return likeService.likePost(like); // FIXED
    }

    // GET ALL LIKES
    @GetMapping
    public List<Like> getLikes() {
        return likeService.getAllLikes();
    }

    // DELETE LIKE
    @DeleteMapping("/{id}")
    public void deleteLike(@PathVariable Long id) {
        likeService.dislikePost(id);
    }
}