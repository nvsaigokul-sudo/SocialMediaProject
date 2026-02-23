package com.example.socialmediaproject.controller;

import com.example.socialmediaproject.model.Like;
import com.example.socialmediaproject.service.LikeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/likes")
public class LikeController {

    @Autowired
    private LikeService likeService;

    @PostMapping
    public Like addLike(@RequestBody Like like) {
        return likeService.saveLike(like);
    }

    @GetMapping
    public List<Like> getLikes() {
        return likeService.getAllLikes();
    }
}