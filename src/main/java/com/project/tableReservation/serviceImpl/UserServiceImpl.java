package com.project.tableReservation.serviceImpl;

import java.util.List;

import com.project.tableReservation.entities.User;

public interface UserServiceImpl {

	 List<User> findUserByUserId(Long userId);
}
