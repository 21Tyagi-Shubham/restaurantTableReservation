package com.project.tableReservation;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;

import static org.junit.Assert.assertEquals;

import com.project.tableReservation.Repository.BookingRepository;
import com.project.tableReservation.Repository.RestaurantTableRepository;
import com.project.tableReservation.Repository.UserRepository;
import com.project.tableReservation.entities.Booking;
import com.project.tableReservation.entities.RestaurantTable;
import com.project.tableReservation.entities.User;

class TableReservationApplicationTests {

	@Autowired
	BookingRepository bookingRepository;

	@Autowired
	UserRepository userRepository;

	@Autowired
	RestaurantTableRepository restaurantTableRepository;
	
	@Test
	void contextLoads() {
		
	}
	}

	/*@Test
	public void canFindAllBookings() {
		List<Booking> foundBookings = bookingRepository.findAll();
		assertEquals(5, foundBookings.size());
}
	
	@Test
	public void canFindUserByName() {
		List<User> foundUser = userRepository.findUserByUserName("Abhishek");
		assertEquals(1, foundUser.size());
		assertEquals("Abhishek", foundUser.get(0).getUserName());
	}

	@Test
	public void canFindUserById() {
		List<User> foundUser = userRepository.findUserByUserId(2L);
		assertEquals(1, foundUser.size());
		assertEquals("Abhishek", foundUser.get(0).getUserName());
	}
	
	@Test
	public void canFindAllRestaurantTables() {
		List<RestaurantTable> foundTables = restaurantTableRepository.findAll();
		assertEquals(5, foundTables.size());
	}
	
	@Test
	public void canFindAllRestaurantTablesWithANumberOfSeatings() {
		List<RestaurantTable> foundTables = restaurantTableRepository.findTablesBySeating(4);
		assertEquals(3, foundTables.size());
		assertEquals(1, foundTables.get(0).getTableNumber());
		assertEquals(2, foundTables.get(1).getTableNumber());
		assertEquals(4, foundTables.get(2).getTableNumber());
	}
	
}	*/
