package com.example.socialmediaproject.service;

import com.example.socialmediaproject.repository.LikeRepo;
import org.springframework.stereotype.Service;

@Service
public class LikeService {

    private final LikeRepo likeRepo;

    public LikeService(LikeRepo likeRepo) {
        this.likeRepo = likeRepo;
    }
}
