package com.maxi.blog.film.services;

import java.util.List;

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
    public Movie save(Movie movie) {
        return movieRepository.save(movie);
    }

    @Override
    public List<Movie> findAll(){
        return movieRepository.findAll();
    }
    
}
