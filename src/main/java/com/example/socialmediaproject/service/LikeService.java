package com.example.socialmediaproject.service;

import com.example.socialmediaproject.model.Like;
import com.example.socialmediaproject.repository.LikeRepo;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LikeService {

    private final LikeRepo repo;

    public LikeService(LikeRepo repo) {
        this.repo = repo;
    }

    public Like createLike(Like l) {
        return repo.save(l);
    }

    public List<Like> getAllLikes() {
        return repo.findAll();
    }

    public void deleteLike(Long id) {
        repo.deleteById(id);
    }
}