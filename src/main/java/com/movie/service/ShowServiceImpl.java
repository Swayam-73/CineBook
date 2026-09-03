package com.movie.service;

import com.movie.dto.ShowDTO;
import com.movie.entity.Booking;
import com.movie.entity.Movie;
import com.movie.entity.Show;
import com.movie.entity.Theater;
import com.movie.repository.MovieRepository;
import com.movie.repository.ShowRepository;
import com.movie.repository.TheaterRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class ShowServiceImpl implements ShowService{
    private final ShowRepository showRepository;
    private final MovieRepository movieRepository;
    private final TheaterRepository theaterRepository;

    public Show createShow(ShowDTO showDTO){
        Movie movie = movieRepository.findById(showDTO.getMovieId())
                .orElseThrow(()-> new RuntimeException("No movie found for id "+showDTO.getMovieId()));
        Theater theater = theaterRepository.findById(showDTO.getTheaterId())
                .orElseThrow(()-> new RuntimeException("No theater found for id "+showDTO.getTheaterId()));
        Show show = new Show();
        show.setShowTime(showDTO.getShowTime());
        show.setPrice(showDTO.getPrice());
        show.setMovie(movie);
        show.setTheater(theater);
        return showRepository.save(show);
    }

    public List<Show> getAllShows(){
        return showRepository.findAll();
    }

    @Override
    public List<Show> getShowsByMovie(String movie) {
        return List.of();
    }

    @Override
    public List<Show> getShowsByTheater(String theater) {
        return List.of();
    }

    public List<Show> getShowsByMovie(Long movieId){
        Optional<List<Show>> showListBox = showRepository.findByMovieId(movieId);
        if (showListBox.isPresent()){
            return showListBox.get();
        }
        else throw new RuntimeException("No shows available for the movie");
    }
    public List<Show> getShowsByTheater(Long theaterId){
        Optional<List<Show>> showListBox = showRepository.findByTheaterId(theaterId);
        if (showListBox.isPresent()){
            return showListBox.get();
        }
        else throw new RuntimeException("No shows available for the Theater");
    }
    public Show updateShow(Long id, ShowDTO showDTO){
        Show show = showRepository.findById(id)
                .orElseThrow(()->new RuntimeException("No show available for the id "+id));
        Movie movie = movieRepository.findById(showDTO.getMovieId())
                .orElseThrow(()->new RuntimeException("No Theater found for id "+showDTO.getMovieId()));
        Theater theater = theaterRepository.findById(showDTO.getTheaterId())
                .orElseThrow(()-> new RuntimeException("No theater found for id "+showDTO.getTheaterId()));
        show.setShowTime(showDTO.getShowTime());
        show.setPrice(showDTO.getPrice());
        show.setMovie(movie);
        show.setTheater(theater);
        return showRepository.save(show);
    }
    public void deleteShow(Long id){
        if (!showRepository.existsById(id)){
            throw new RuntimeException("No show available for the id "+id);
        }
        List<Booking> bookings = showRepository.findById(id).get().getBookings();
        if (!bookings.isEmpty()) {
            throw new RuntimeException("Can't delete show with existing bookings");
        }
        showRepository.deleteById(id);
    }
}
