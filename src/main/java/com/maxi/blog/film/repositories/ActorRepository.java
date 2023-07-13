package com.maxi.blog.film.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.maxi.blog.film.entities.Actor;

public interface ActorRepository extends JpaRepository<Actor, Long> {
    
}
