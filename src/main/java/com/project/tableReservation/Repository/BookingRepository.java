package com.project.tableReservation.Repository;

import java.time.LocalDate;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.project.tableReservation.entities.Booking;

@Repository
public interface BookingRepository extends JpaRepository<Booking, Long>{
	 
	List<Booking> findAll();
	List<Booking> getBookingsByUserUserId(Long userId); 	
}
