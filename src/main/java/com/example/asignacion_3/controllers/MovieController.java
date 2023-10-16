package com.example.asignacion_3.controllers;

import com.example.asignacion_3.models.Movie;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.example.asignacion_3.services.MovieService;

import java.util.ArrayList;

@RestController
@RequestMapping("/movies")
public class MovieController {

    @Autowired
    private MovieService movieServices;


    @GetMapping("/all")
    public ArrayList<Movie> getMovies() {
        return movieServices.getAllMovies();
    }

    @PostMapping("/add")
    public boolean addMovie(@RequestBody Movie movie) {
        return movieServices.addMovie(movie);
    }


    @GetMapping("/error")
    public String error() {
        return "Fucking error";
    }


}
