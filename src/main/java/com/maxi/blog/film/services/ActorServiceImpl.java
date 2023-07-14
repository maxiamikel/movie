package com.maxi.blog.film.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.maxi.blog.film.entities.Actor;
import com.maxi.blog.film.repositories.ActorRepository;

import jakarta.transaction.Transactional;

@Service
@Transactional
public class ActorServiceImpl implements ActorService {
    
    @Autowired
    private ActorRepository actorRepository;

    @Override
    public void save(Actor actor) {
        actorRepository.save(actor);
        
    } 
}
