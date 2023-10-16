package com.example.asignacion_3.repositories;

import com.example.asignacion_3.models.Movie;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.FluentQuery;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Optional;
import java.util.function.Function;

@Repository
public class MovieRepository {

    private static ArrayList<Movie> movies = new ArrayList<>();

    static {
        Movie m1 = new Movie("War dogs", "Action", "1", new Date(123, 9, 16));

        m1.setId(1);

        movies.add(m1);
    }

    public List<Movie> findAll() {
        return movies;
    }

    public boolean save(Movie movie) {
        movie.setId(movies.isEmpty() ? 1 : movies.get(movies.size()-1).getId() + 1);

        return movies.add(movie);
    }
}