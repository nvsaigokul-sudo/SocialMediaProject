package com.example.socialmediaproject.repository;

import com.example.socialmediaproject.model.Like;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LikeRepo extends JpaRepository<Like, Long> {
}
