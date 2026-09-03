package com.movie.repository;

import java.util.Optional;

public interface TheaterRepository {
    Optional<Object> findById(Long theaterId);
}
