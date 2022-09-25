package com.project.tableReservation.Repository;

import java.util.List;

import org.springframework.data.jdbc.repository.query.Query;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.project.tableReservation.entities.User;

@Repository
public interface UserRepository extends JpaRepository<User,Long> {

    List<User> findUserByUserId(Long userId);
	
}
