package com.project.tableReservation.serviceImpl;

import java.util.List;

import com.project.tableReservation.entities.RestaurantTable;

public interface RestaurantTableServiceImpl {

	List<RestaurantTable> findTablesBySeating(int number);
    List<RestaurantTable> findAll();
}
