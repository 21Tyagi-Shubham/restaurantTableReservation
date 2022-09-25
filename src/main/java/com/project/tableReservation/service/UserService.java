package com.project.tableReservation.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.tableReservation.Repository.UserRepository;
import com.project.tableReservation.entities.User;
import com.project.tableReservation.serviceImpl.UserServiceImpl;

@Service
public class UserService implements UserServiceImpl {

	@Autowired
	private UserRepository userRepository;
	@Override
	public List<User> findUserByUserId(Long userId) {
		// TODO Auto-generated method stub
		return userRepository.findUserByUserId(userId);
	}

}
