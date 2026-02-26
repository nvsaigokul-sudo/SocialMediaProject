package com.example.socialmediaproject.service;

import com.example.socialmediaproject.model.Post;
import com.example.socialmediaproject.repository.PostRepo;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PostService {

    private final PostRepo repo;

    public PostService(PostRepo repo) {
        this.repo = repo;
    }

    public Post createPost(Post p) {
        return repo.save(p);
    }

    public List<Post> getAllPosts() {
        return repo.findAll();
    }

    public void deletePost(Long id) {
        repo.deleteById(id);
    }
}