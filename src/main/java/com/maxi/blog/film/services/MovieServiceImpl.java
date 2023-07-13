package com.maxi.blog.film.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.maxi.blog.film.entities.Movie;
import com.maxi.blog.film.repositories.MovieRepository;

import jakarta.transaction.Transactional;

@Service
@Transactional
public class MovieServiceImpl implements MovieService{

    @Autowired
    private MovieRepository movieRepository;
    @Override
    public void save(Movie movie) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'save'");
    }
    
}
