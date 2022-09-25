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

public class BookingTest {

	Booking booking;
    Booking booking1;
    Booking booking2;
    Booking booking3;
    User user;
    User user2;
    RestaurantTable  restaurantTable;
    RestaurantTable  restaurantTable2;
    RestaurantTable  restaurantTable3;
    List<RestaurantTable> myTables;
    
    
    @Before
    public void setUp() {
        
        user = new User("Akshay", "akshay@gmail.com","9219108090");
        user2 = new User("Shubham", "8935061243", "shubham@gmail.com");
        booking = new Booking(user, LocalDate.parse("2022-09-13"), LocalTime.parse("16:00"), 5, myTables );
        booking1 = new Booking(user, LocalDate.parse("2022-09-15"), LocalTime.parse("17:00"), 2, myTables );
        booking2 = new Booking(user, LocalDate.parse("2022-09-14"), LocalTime.parse("13:00"), 3, myTables);
        booking3 = new Booking(user, LocalDate.parse("2022-09-10"), LocalTime.parse("15:00"), 4, myTables);
        restaurantTable = new RestaurantTable(1, 4,"Punjabi Restaurant");
        restaurantTable2 = new RestaurantTable(2, 2,"Delhi Point");
        restaurantTable3 = new RestaurantTable(3, 103,"Chinese Food");
        myTables = new ArrayList<RestaurantTable>(Arrays.asList((restaurantTable), (restaurantTable2)));

    }
    
    @Test
    public void getBookingId() {
        assertEquals(null, booking.getBookingId());
    }
    
    
    @Test
    public void getDate() {
        assertEquals(LocalDate.parse("2022-09-13"), booking.getDate());
    }

    /*@Test
    public void setDate() {
        booking.setDate(new LocalDate(2019,01,07));
        assertEquals(LocalDate.parse("2019-01-07"), booking.getDate());
    }*/

    @Test
    public void getTime() {
        assertEquals(LocalTime.parse("16:00"), booking.getTime());
    }
    
    /*@Test
    public void setTime() {
        booking.setTime("19:15");
        assertEquals(LocalTime.parse("19:15"), booking.getTime());
    }*/

    @Test
    public void getNumberInParty() {
        assertEquals(5, booking.getNumberOfPerson());
    }

    @Test
    public void setNumberInParty() {
       booking.setNumberOfPerson(99);
       assertEquals(99, booking.getNumberOfPerson());
    }
    
    @Test
    public void getUser() {
        assertEquals(user,booking.getUser() );
    }

    @Test
    public void setUser() {
        booking.setUser(user);
        assertEquals(user, booking.getUser());
        booking.setUser(user2);
        assertEquals(user2, booking.getUser());

    }
    
    
    @Test
    public void getRestaurantTables() {
        assertEquals(3, booking.getRestaurantTables().size());
    }

    @Test
    public void setRestaurantTables() {
        booking.setRestaurantTables(myTables);
        assertEquals(2, booking.getRestaurantTables().size());
        assertEquals(restaurantTable, booking.getRestaurantTables().get(0));
    }

    
	
}
