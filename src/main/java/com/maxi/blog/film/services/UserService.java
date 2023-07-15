package com.maxi.blog.film.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.maxi.blog.film.entities.User;
import com.maxi.blog.film.exceptions.ObjectNotFoundException;
import com.maxi.blog.film.repositories.UserRepository;

import jakarta.transaction.Transactional;

@Service
@Transactional
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public List<User> findAll(){
        List<User> list = userRepository.findAll();
        return list;
    }

    public User findById(Long id){
        Optional<User> user = userRepository.findById(id);
        return user.orElseThrow( () -> new ObjectNotFoundException("O ID ["+id+"] informado não foi encontrado"));
    }

    public User findByUsername(String username){
        Optional<User> obj =userRepository.findByUsername(username);
        return obj.orElseThrow(() -> new ObjectNotFoundException("O usuario ["+username+"] informado não foi encontrado"));
    }

    public User save(User obj){
        obj.setId(null);
        User user = userRepository.save(obj);
        return user;
    }

    public boolean existsByUsername(String username){
        return userRepository.existsByUsername(username);
    }

    public boolean existsByUserId(Long id){
        return userRepository.existsById(id);
    }
    
}
