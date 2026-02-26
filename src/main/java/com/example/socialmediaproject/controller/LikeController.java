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

    @PostMapping
    public Like createLike(@RequestBody Like like) {
        return likeService.createLike(like);
    }

    @GetMapping
    public List<Like> getAllLikes() {
        return likeService.getAllLikes();
    }

    @DeleteMapping("/{id}")
    public String deleteLike(@PathVariable Long id) {
        likeService.deleteLike(id);
        return "Like deleted";
    }
}