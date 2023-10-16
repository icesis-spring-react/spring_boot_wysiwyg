package com.example.asignacion_3.services;

import com.example.asignacion_3.models.Director;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.asignacion_3.repositories.DirectorRepository;

import java.util.ArrayList;

@Service
public class DirectorService {

    @Autowired
    private DirectorRepository directorRepository;

    public ArrayList<Director> getAllDirectors() {
        return (ArrayList<Director>) directorRepository.findAll();
    }

    public boolean addDirector(Director director) {
        return directorRepository.save(director);
    }

}