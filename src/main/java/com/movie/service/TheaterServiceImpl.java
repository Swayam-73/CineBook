package com.movie.service;

import com.movie.dto.TheaterDTO;
import com.movie.entity.Theater;
import com.movie.repository.TheaterRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class TheaterServiceImpl implements TheaterService{
    private final TheaterRepository theaterRepository;

    @Override
    public Theater addTheater(TheaterDTO theaterDTO) {
        return null;
    }

    @Override
    public List<TheaterDTO> getTheaterByLocation(String location) {
        return List.of();
    }

    @Override
    public TheaterDTO updateTheater(Long id, TheaterDTO theaterDTO) {
        return null;
    }

    @Override
    public void deleteTheater(Long id) {

    }
}
