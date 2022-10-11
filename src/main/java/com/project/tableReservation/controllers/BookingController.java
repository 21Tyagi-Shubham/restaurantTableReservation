package com.project.tableReservation.controllers;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.project.tableReservation.Repository.BookingRepository;
import com.project.tableReservation.entities.Booking;
import com.project.tableReservation.serviceImpl.BookingServiceImpl;

@RestController
@RequestMapping("/bookings")
public class BookingController {

	@Autowired
	BookingServiceImpl bookingServiceImpl;

    
    @GetMapping("/allbookings")
	public List<Booking> displayAllBookings()
	{
		return bookingServiceImpl.findAll();
	}

      @GetMapping(value="/user/{userId}")
    public List<Booking> getBookingsByUserUserId(@PathVariable Long userId){
        return bookingServiceImpl.getBookingsByUserUserId(userId);
    }
	
}
