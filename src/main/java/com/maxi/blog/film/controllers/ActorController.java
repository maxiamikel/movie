package com.maxi.blog.film.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.maxi.blog.film.entities.Actor;
import com.maxi.blog.film.entities.Movie;

@Controller
@RequestMapping("/actors")
public class ActorController {
    
    @GetMapping("/form-actor")
    public String formActor(Actor actor, Model model, @ModelAttribute("moviActor") Movie movie){
        model.addAttribute("actor", new Actor());
        model.addAttribute("film", movie);
        return "/admin/formActor";
    }


}
