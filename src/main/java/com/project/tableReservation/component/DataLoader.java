package com.project.tableReservation.component;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import com.project.tableReservation.Repository.BookingRepository;
import com.project.tableReservation.Repository.RestaurantTableRepository;
import com.project.tableReservation.Repository.UserRepository;
import com.project.tableReservation.entities.Booking;
import com.project.tableReservation.entities.RestaurantTable;
import com.project.tableReservation.entities.User;


@Component
public class DataLoader implements ApplicationRunner {

	@Autowired
    BookingRepository bookingRepository;
	
    @Autowired
    UserRepository userRepository;
   
   @Autowired
    RestaurantTableRepository restaurantTableRepository;
	
	@Override
	public void run(ApplicationArguments args) throws Exception {
		// TODO Auto-generated method stub
		
		
        RestaurantTable table1 = new RestaurantTable(1, 4,"Delhi Point");
        restaurantTableRepository.save(table1);
        RestaurantTable table2 = new RestaurantTable(2, 4,"Baba Ka Dhaba");
        restaurantTableRepository.save(table2);
        RestaurantTable table3 = new RestaurantTable(3, 3,"Punjabi Dhaba");
        restaurantTableRepository.save(table3);
        RestaurantTable table4 = new RestaurantTable(4, 4,"Chinese Restaurant");
        restaurantTableRepository.save(table4);
        RestaurantTable table5 = new RestaurantTable(5, 3,"Hotel Punjab");
        restaurantTableRepository.save(table5);
        
         
        List myTables = new ArrayList<RestaurantTable>(Arrays.asList((table1)));
        List myTables2 = new ArrayList<RestaurantTable>(Arrays.asList((table3)));
        List myTables3 = new ArrayList<RestaurantTable>(Arrays.asList((table5)));
        List myTables4 = new ArrayList<RestaurantTable>(Arrays.asList((table4)));

     
        User User1 = new User("Ankit", "09392383620", "ankit@gmail.com");
        userRepository.save(User1);
        User User2 = new User("Abhishek", "09892380059", "abhishek@gmail.com");
        userRepository.save(User2);
        User User3 = new User("Utkarsh", "09893940256", "utkarsh@gmail.com");
        userRepository.save(User3);
        User User4 = new User("Shivam", "085443451243", "shivam@gmail.com.com");
        userRepository.save(User4);
        User User5 = new User("Shubham", "8937055976", "shubham@gmail.com");
        userRepository.save(User5);
     
        Booking booking1 = new Booking(User1, LocalDate.parse("2022-09-10"), LocalTime.parse("16:00"), 3, myTables);
        bookingRepository.save(booking1);
        Booking booking2 = new Booking(User2, LocalDate.parse("2022-09-11"), LocalTime.parse("15:00"), 3, myTables );
        bookingRepository.save(booking2);
        Booking booking3 = new Booking(User3, LocalDate.parse("2022-09-13"), LocalTime.parse("17:00"), 1,myTables2 );
        bookingRepository.save(booking3);
        Booking booking4 = new Booking(User3, LocalDate.parse("2022-09-15"), LocalTime.parse("18:00"), 2,myTables3);
        bookingRepository.save(booking4);
        Booking booking5 = new Booking(User4, LocalDate.parse("2022-09-16"), LocalTime.parse("13:00"), 4,myTables4);
        bookingRepository.save(booking5);
	
	}
	
}
