package com.maxi.blog.film.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.maxi.blog.film.entities.Movie;

public interface MovieRepository extends JpaRepository<Movie, Long> {
    
}
