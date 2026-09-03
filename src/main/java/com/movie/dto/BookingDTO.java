package com.movie.dto;

import com.movie.entity.BookingStatus;

import java.time.LocalDateTime;
import java.util.List;

public class BookingDTO {
    private Integer numberOfSeats;
    private LocalDateTime bookingTime;
    private Double price;
    private BookingStatus bookingStatus;
    private List<String> seatNumbers;
    private Long userId;
    private Long showId;
}
