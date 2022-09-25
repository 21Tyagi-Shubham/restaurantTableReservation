package com.project.tableReservation.controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.project.tableReservation.Repository.UserRepository;
import com.project.tableReservation.entities.User;
import com.project.tableReservation.serviceImpl.UserServiceImpl;

@RestController
@RequestMapping("/users")
public class UserController {

	@Autowired
	UserServiceImpl userServiceImpl;

    @GetMapping("/{id}")
    public List<User> getUserById(@PathVariable(value="id") long userId){
        return userServiceImpl.findUserByUserId(userId);
    }
	  
	
	
}
