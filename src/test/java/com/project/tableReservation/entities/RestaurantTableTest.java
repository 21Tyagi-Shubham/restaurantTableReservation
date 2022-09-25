package com.project.tableReservation.entities;

import static org.junit.Assert.assertEquals;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class RestaurantTableTest {

	RestaurantTable  restaurantTable;
    Booking booking1;
    Booking booking2;
    Booking booking3;
    List myBookings;
    User user;
    User user2;
    List<RestaurantTable> myTables;
    RestaurantTable restaurantTable2;
    RestaurantTable restaurantTable3;
    
    @Before
    public void setUp() {
        
        user = new User("Akshay", "akshay@gmail.com","9219108090");
        user2 = new User("Shubham", "8935061243", "shubham@gmail.com");
        booking1 = new Booking(user, LocalDate.parse("2022-09-15"), LocalTime.parse("17:00"), 2, myTables );
        booking2 = new Booking(user, LocalDate.parse("2022-09-14"), LocalTime.parse("13:00"), 3, myTables);
        booking3 = new Booking(user, LocalDate.parse("2022-09-10"), LocalTime.parse("15:00"), 4, myTables);
        restaurantTable = new RestaurantTable(1, 4,"Punjabi Restaurant");
        restaurantTable2 = new RestaurantTable(2, 2,"Delhi Point");
        restaurantTable3 = new RestaurantTable(3, 103,"Chinese Food");
        myTables = new ArrayList<RestaurantTable>(Arrays.asList((restaurantTable), (restaurantTable2)));
        myBookings = new ArrayList<Booking>(Arrays.asList((booking1), (booking2)));

    }
    
    @Test
    public void getTableId() {
        assertEquals(null,restaurantTable.getTableId());
    }
    
    
    @Test
    public void getTableNumber() {
        assertEquals(1, restaurantTable.getTableNumber());
    }

    @Test
    public void setTableNumber() {
        restaurantTable.setTableNumber(103);
        assertEquals(103, restaurantTable.getTableNumber());
    }

    @Test
    public void getSeating() {
        assertEquals(4, restaurantTable.getSeating());
    }

    @Test
    public void setSeating() {
        restaurantTable.setSeating(8);
        assertEquals(8, restaurantTable.getSeating());
    }

    @Test
    public void getBookings() {
        assertEquals(0, restaurantTable.getBookings().size());
        assertEquals(true, restaurantTable.getBookings().isEmpty());

    }

    @Test
    public void setBookings() {
        restaurantTable.setBookings(myBookings);
        assertEquals(booking1, restaurantTable.getBookings().get(0));

    }

    
    @Test
    public void getRestaurantName() {
        assertEquals("Punjabi Restaurant", restaurantTable.getRestaurantName());
    }
    
    @Test
    public void setRestaurantName() {
    	restaurantTable.setRestaurantName("Punjabi Restaurant");
        assertEquals("Punjabi Restaurant", restaurantTable.getRestaurantName());
    }
	
}
