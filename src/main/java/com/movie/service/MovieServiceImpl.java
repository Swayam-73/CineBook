package com.movie.service;

import com.movie.dto.MovieDTO;
import com.movie.entity.Movie;
import com.movie.repository.MovieRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class MovieServiceImpl implements MovieService{
    private final MovieRepository movieRepository;

    @Override
    public MovieDTO saveMovie(MovieDTO movieDTO){
        Movie movie = mapToEntity(movieDTO);
        Movie savedMovie = movieRepository.save(movie);
        MovieDTO movieDTO1 = mapToDTO(savedMovie);
        return movieDTO1;
    }

    @Override
    public List<MovieDTO> getAllMovies() {
        List<Movie> movies = movieRepository.findAll();
        List<MovieDTO> movieDTOS = movies.stream()
                .map(e->mapToDTO(e)).collect(Collectors.toList());
        return movieDTOS;
    }

    @Override
    public List<MovieDTO> getMovieByGenre(String genre) {
        List<Movie> byGenre = movieRepository.findByGenre(genre);
        return null;
    }

    private MovieDTO mapToDTO(Movie movie){
        MovieDTO movieDTO = new MovieDTO();
        movieDTO.setName(movie.getName());
        movieDTO.setDescription(movie.getName());
        movieDTO.setGenre(movie.getDescription());
        movieDTO.setDuration(movie.getDuration());
        movieDTO.setReleaseDate(movie.getReleaseDate());
        movieDTO.setLanguage(movie.getLanguage());
        return movieDTO;
    }
    private Movie mapToEntity(MovieDTO movieDTO){
        Movie movie = new Movie();
        movie.setName(movieDTO.getName());
        movie.setDescription(movieDTO.getDescription());
        movie.setGenre(movieDTO.getGenre());
        movie.setDuration(movieDTO.getDuration());
        movie.setReleaseDate(movieDTO.getReleaseDate());
        movie.setLanguage(movieDTO.getLanguage());
        return movie;
    }
}
