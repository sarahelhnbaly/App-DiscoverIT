package com.discoverit.app.repository;

import com.discoverit.app.model.Post;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PostRepository extends JpaRepository<Post, Long> {
    // Additional query methods can be defined here if needed
}


