package com.project.tableReservation.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.tableReservation.Repository.RestaurantTableRepository;
import com.project.tableReservation.entities.RestaurantTable;
import com.project.tableReservation.serviceImpl.RestaurantTableServiceImpl;

@Service
public class RestaurantTableService implements RestaurantTableServiceImpl{

	@Autowired
	RestaurantTableRepository restaurantTableRepository;
	
	@Override
	public List<RestaurantTable> findTablesBySeating(int number) {
		
		return restaurantTableRepository.findTablesBySeating(number);
	}

	@Override
	public List<RestaurantTable> findAll() {
		
		return restaurantTableRepository.findAll();
	}

}
