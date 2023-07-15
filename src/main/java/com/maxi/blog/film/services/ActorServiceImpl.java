package com.maxi.blog.film.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.maxi.blog.film.entities.Actor;
import com.maxi.blog.film.repositories.ActorRepository;

import jakarta.transaction.Transactional;

@Service
@Transactional
public class ActorServiceImpl {
    
    @Autowired
    private ActorRepository actorRepository;

    public void save(Actor actor) {
        actorRepository.save(actor);
        
    } 
}
