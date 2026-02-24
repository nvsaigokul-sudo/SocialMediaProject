package com.example.socialmediaproject.controller;

import com.example.socialmediaproject.model.Post;
import com.example.socialmediaproject.service.PostService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/posts")
public class PostController {

    private final PostService postService;

    public PostController(PostService postService) {
        this.postService = postService;
    }

    // ADD POST
    @PostMapping
    public Post addPost(@RequestBody Post post) {
        return postService.createPost(post); // FIXED
    }

    // GET ALL POSTS
    @GetMapping
    public List<Post> getPosts() {
        return postService.getAllPosts();
    }

    // GET POST BY ID
    @GetMapping("/{id}")
    public Post getPostById(@PathVariable Long id) {
        return postService.getPostById(id);
    }

    // DELETE POST
    @DeleteMapping("/{id}")
    public void deletePost(@PathVariable Long id) {
        postService.deletePostById(id);
    }
}