package com.maxi.blog.film.services;

import java.util.List;

import com.maxi.blog.film.entities.Movie;

public interface MovieService {
    
    Movie save(Movie movie);

    List<Movie> findAll();
}
