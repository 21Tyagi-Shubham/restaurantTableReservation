package com.project.tableReservation.entities;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;

import org.hibernate.annotations.Cascade;
import org.springframework.beans.factory.annotation.Autowired;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
public class Booking {

	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long bookingId;

    private LocalDate date;

    
    private LocalTime time;

    
    private int numberOfPerson;
    
    
    public Booking()
    {
    	
    } 

	public Booking(User user, LocalDate date, LocalTime time, int numberOfPerson,List<RestaurantTable> restaurantTables) {
		this.user = user;
		this.date = date;
        this.time = time;
        this.numberOfPerson = numberOfPerson;
        this.restaurantTables = restaurantTables;
               
    }


	public Long getBookingId() {
		return bookingId;
	}


	public void setBookingId(Long bookingId) {
		this.bookingId = bookingId;
	}

	
	public User getUser() {
		return user;
	}


	public void setUser(User user) {
		this.user = user;
	}

	public LocalDate getDate() {
		return date;
	}


	public void setDate(LocalDate date) {
		this.date = date;
	}


	public LocalTime getTime() {
		return time;
	}


	public void setTime(LocalTime time) {
		this.time = time;
	}


	public int getNumberOfPerson() {
		return numberOfPerson;
	}


	public void setNumberOfPerson(int numberOfPerson) {
		this.numberOfPerson = numberOfPerson;
	}


	public List<RestaurantTable> getRestaurantTables() {
		return restaurantTables;
	}


	public void setRestaurantTables(List<RestaurantTable> restaurantTables) {
		this.restaurantTables = restaurantTables;
	}
	

	@ManyToOne
	@JsonIgnore
    @JoinColumn(name = "user_id") //, nullable = false)
    private User user;
	
	@ManyToMany
	@JsonIgnore
    @Cascade(org.hibernate.annotations.CascadeType.SAVE_UPDATE)
    @JoinTable(
            joinColumns = {@JoinColumn(name = "booking_id", nullable = false, updatable = false)},
            inverseJoinColumns = {@JoinColumn(name = "table_id", nullable = false, updatable = false)}
    )
    private List<RestaurantTable> restaurantTables;
    
}
