package com.example.socialmediaproject.service;

import com.example.socialmediaproject.exception.ResourceNotFoundException;
import com.example.socialmediaproject.model.Post;
import com.example.socialmediaproject.repository.PostRepo;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PostService {

    private final PostRepo postRepo;

    public PostService(PostRepo postRepo) {
        this.postRepo = postRepo;
    }

    // CREATE POST  (IMPORTANT METHOD)
    public Post createPost(Post post) {
        return postRepo.save(post);
    }

    // GET ALL POSTS
    public List<Post> getAllPosts() {
        return postRepo.findAll();
    }

    // GET BY ID
    public Post getPostById(Long id) {
        return postRepo.findById(id)
                .orElseThrow(() ->
                        new ResourceNotFoundException(
                                "Post not found with id: " + id));
    }

    // DELETE POST
    public void deletePostById(Long id) {
        Post post = getPostById(id);
        postRepo.delete(post);
    }
}