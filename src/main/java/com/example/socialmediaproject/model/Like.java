package com.example.socialmediaproject.model;

import jakarta.persistence.*;

@Entity
@Table(name = "likes")   // ⭐ IMPORTANT FIX
public class Like {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String reaction;

    public Like(){}

    public Long getId() {
        return id;
    }

    public String getReaction() {
        return reaction;
    }

    public void setReaction(String reaction) {
        this.reaction = reaction;
    }
}
