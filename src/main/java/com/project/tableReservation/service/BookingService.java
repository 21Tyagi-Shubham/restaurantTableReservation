package com.project.tableReservation.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.tableReservation.Repository.BookingRepository;
import com.project.tableReservation.entities.Booking;
import com.project.tableReservation.serviceImpl.BookingServiceImpl;

@Service
public class BookingService implements BookingServiceImpl {

	@Autowired
	BookingRepository bookingRepository;
	
	@Override
	public List<Booking> findAll() {
		// TODO Auto-generated method stub
		return bookingRepository.findAll();
	}

	
}
