package com.example.asignacion_3.controllers;

import com.example.asignacion_3.models.Director;
import com.example.asignacion_3.services.DirectorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
@RequestMapping("/directors")
public class DirectorController {

    @Autowired
    private DirectorService directorService;

    @GetMapping("/all")
    public ArrayList<Director> getDirectors() {
        return directorService.getAllDirectors();
    }

    @PostMapping("/add")
    public boolean addDirector(@RequestBody Director director) {
        return directorService.addDirector(director);
    }
}
