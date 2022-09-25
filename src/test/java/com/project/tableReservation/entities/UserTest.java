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

public class UserTest {

	User user;
    Booking booking1;
    Booking booking2;
    Booking booking3;
    List myBookings;
    List<RestaurantTable> myTables;
    RestaurantTable restaurantTable;
    RestaurantTable restaurantTable2;
    
    @Before
    public void setUp() {
        booking1 = new Booking(user, LocalDate.parse("2022-09-15"), LocalTime.parse("17:00"), 2, myTables );
        booking2 = new Booking(user, LocalDate.parse("2022-09-14"), LocalTime.parse("13:00"), 3, myTables);
        booking3 = new Booking(user, LocalDate.parse("2022-09-10"), LocalTime.parse("15:00"), 4, myTables);
        myTables = new ArrayList<RestaurantTable>(Arrays.asList((restaurantTable), (restaurantTable2)));
        user = new User("Akshay", "akshay@gmail.com","9219108090" );
        myBookings = new ArrayList<Booking>(Arrays.asList((booking1), (booking2)));
        

    }
    
    @Test
    public void getUserId() {
        assertEquals(0, user.getUserId());
    }
    
    @Test
    public void setUserId() {
        user.setUserId(1);
        assertEquals(1, user.getUserId());
    }
    
    @Test
    public void getUserName() {
        assertEquals("Akshay", user.getUserName());
    }
    
    @Test
    public void setUserName() {
        user.setUserName("Shubham");
        assertEquals("Shubham", user.getUserName());
    }

    @Test
    public void getUserEmail() {
        assertEquals("akshay@gmail.com", user.getUserEmail());
    }

    @Test
    public void setEmail() {
        user.setUserEmail("shubham@gmail.com");
        assertEquals("shubham@gmail.com", user.getUserEmail());
    }
    
    
    @Test
    public void getUserPhone() {
        assertEquals("9219108090", user.getUserPhone());
    }
	
    
    @Test
    public void setUserPhone() {
        user.setUserPhone("8883211100");
        assertEquals("8883211100", user.getUserPhone());
    }
    
    @Test
    public void getBookings() {
        assertEquals(0, user.getBookings().size());
        assertEquals(true, user.getBookings().isEmpty());

    }

    @Test
    public void setBookings() {
        user.setBookings(myBookings);
        assertEquals(booking1, user.getBookings().get(0));
    }
}
