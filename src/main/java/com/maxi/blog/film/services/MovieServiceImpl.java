package com.maxi.blog.film.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.maxi.blog.film.entities.Movie;
import com.maxi.blog.film.exceptions.ObjectNotFoundException;
import com.maxi.blog.film.repositories.MovieRepository;

import jakarta.transaction.Transactional;

@Service
@Transactional
public class MovieServiceImpl {

    @Autowired
    private MovieRepository movieRepository;
    
    public Movie findById(Long id){
        Optional<Movie> obj = movieRepository.findById(id);
        return obj.orElseThrow( () -> new ObjectNotFoundException("ID [ "+ id + "] não encontrado."));
    }

    public List<Movie> findAll(){
        return movieRepository.findAll();
    }

    public Movie save(Movie movie) {
        return movieRepository.save(movie);
    }
}
