package com.project.tableReservation.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.project.tableReservation.Repository.BookingRepository;
import com.project.tableReservation.entities.Booking;

public interface BookingServiceImpl {

	
	
	List<Booking> findAll();
}
