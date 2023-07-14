package com.maxi.blog.film.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.maxi.blog.film.entities.Movie;
import com.maxi.blog.film.services.MovieServiceImpl;

@RestController
@RequestMapping(value = "api/admin")
public class MainController {

    @Autowired
    private MovieServiceImpl movieServiceImpl;

    @GetMapping(value = "/")
    public ResponseEntity<List<Movie>> findAll(){
        List<Movie> list = movieServiceImpl.findAll();
        return ResponseEntity.ok().body(list);
    }

    @PostMapping(value = "/create")
    public ResponseEntity<?> createMovie(@RequestBody Movie obj){
        Movie newMovie = movieServiceImpl.save(obj);
        return ResponseEntity.ok().body(newMovie);
    }
/*
    @GetMapping("/movi-form")
    public ModelAndView mofiForm(Movie obj){
         ModelAndView mv = new ModelAndView();
         mv.setViewName("/admin/moviForm");
         mv.addObject("movie", new Movie());
         return mv;
    }

    @PostMapping(value = "/save")
    public String saveMovie(@RequestParam(name = "file", required = false) MultipartFile avatar, Movie movie,
            RedirectAttributes feedback) {

        if (!avatar.isEmpty()) {
            String link = "D://film_avatar//uploads";
            String avatarName = UUID.randomUUID() + "" + avatar.getOriginalFilename();

            try {
                byte[] bytes = avatar.getBytes();
                Path absolutePath = Paths.get(link + "//" + avatarName);
                Files.write(absolutePath, bytes);
                movie.setAvatar(avatarName);

                movieServiceImpl.save(movie);

                feedback.addFlashAttribute("saveSucess", "Sucessfully save");
            } catch (Exception e) {
                e.getMessage();
            }
        }
        return "/admin/moviForm";
    }*/
}
