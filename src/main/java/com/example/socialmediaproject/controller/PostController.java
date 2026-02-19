package com.example.socialmediaproject.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/posts")
public class PostController {

    @GetMapping
    public String getPosts(){
        return "All posts";
    }
}
