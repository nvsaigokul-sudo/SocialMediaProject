package com.example.socialmediaproject.service;

import com.example.socialmediaproject.model.Like;
import com.example.socialmediaproject.repository.LikeRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LikeService {

    @Autowired
    private LikeRepo likeRepo;

    public Like saveLike(Like like) {
        return likeRepo.save(like);
    }

    public List<Like> getAllLikes() {
        return likeRepo.findAll();
    }
}