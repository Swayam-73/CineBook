package com.movie.service;

import com.movie.dto.BookingDTO;
import com.movie.entity.Booking;

import java.util.List;

public interface BookingService {
    Booking createBooking(BookingDTO bookingDTO);

    List<Booking> getUserBookings(Long id);

    Booking confirmBooking(Long id);
}
