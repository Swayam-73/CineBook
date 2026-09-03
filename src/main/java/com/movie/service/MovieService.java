package com.movie.service;

import com.movie.dto.MovieDTO;

import java.util.List;

public interface MovieService{
    MovieDTO saveMovie(MovieDTO movieDTO);
    List<MovieDTO> getAllMovies();
    List<MovieDTO> getMovieByGenre(String genre);
}
