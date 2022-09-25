package com.project.tableReservation.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.project.tableReservation.Repository.RestaurantTableRepository;
import com.project.tableReservation.entities.RestaurantTable;
import com.project.tableReservation.serviceImpl.RestaurantTableServiceImpl;

@RestController
@RequestMapping(value = "/", name="RestaurantTableController")
public class RestaurantTableController {

	@Autowired
	RestaurantTableServiceImpl restaurantTableServiceImpl;
	
	@GetMapping(value="/restaurant-tables")
	public List<RestaurantTable> getAllRestaurantTables() {
        return restaurantTableServiceImpl.findAll();
    }
	
	@GetMapping(value="/restaurant-tables/seating/{number}" )
	public List<RestaurantTable> getTablesBySeating(@PathVariable(value="number") int number){
        return restaurantTableServiceImpl.findTablesBySeating(number);
    }
	
	
}
