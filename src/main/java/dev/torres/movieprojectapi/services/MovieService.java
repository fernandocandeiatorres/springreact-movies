package dev.torres.movieprojectapi.services;

import dev.torres.movieprojectapi.entities.Movie;
import dev.torres.movieprojectapi.repositories.MovieRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MovieService {

    @Autowired
    private MovieRepository movieRepository;

    // TO DO!
    // CHANGE FIELD INJECTION TO CONSTRUCTOR INJECTION
    public List<Movie> allMovies() {
        return movieRepository.findAll();
    }
}
