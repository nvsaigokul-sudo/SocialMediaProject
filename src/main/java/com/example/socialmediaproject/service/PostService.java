package com.example.socialmediaproject.service;

import com.example.socialmediaproject.repository.PostRepo;
import org.springframework.stereotype.Service;

@Service
public class PostService {

    private final PostRepo postRepo;

    public PostService(PostRepo postRepo) {
        this.postRepo = postRepo;
    }
}
