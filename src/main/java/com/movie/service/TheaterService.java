package com.movie.service;

import com.movie.dto.TheaterDTO;
import com.movie.entity.Theater;

import java.util.List;

public interface TheaterService {
    Theater addTheater(TheaterDTO theaterDTO);
    List<TheaterDTO> getTheaterByLocation(String location);
    TheaterDTO updateTheater(Long id, TheaterDTO theaterDTO);
    void deleteTheater(Long id);
}
