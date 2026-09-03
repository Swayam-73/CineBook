package com.movie.service;

import com.movie.dto.ShowDTO;
import com.movie.entity.Show;

import java.util.List;

public interface ShowService {
    Show createShow(ShowDTO showDTO);

    List<Show> getAllShows();

    List<Show> getShowsByMovie(String movie);

    List<Show> getShowsByTheater(String theater);

    Show updateShow(Long id, ShowDTO showDTO);

    void deleteShow(Long id);
}
