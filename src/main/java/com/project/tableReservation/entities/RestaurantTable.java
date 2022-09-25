package com.project.tableReservation.entities;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.JoinColumn;

import org.hibernate.annotations.Cascade;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
public class RestaurantTable {

	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long tableId;
	
	@Column(nullable = false)
	private int tableNumber;
	
	@Column(nullable = false)
	private int seating;
	
	@Column(nullable = false)
    private String restaurantName;
	
	public RestaurantTable() {
		
		
    }
	
	public Long getTableId() {
		return tableId;
	}


	public void setTableId(Long tableId) {
		this.tableId = tableId;
	}


	public int getTableNumber() {
		return tableNumber;
	}


	public void setTableNumber(int tableNumber) {
		this.tableNumber = tableNumber;
	}


	public int getSeating() {
		return seating;
	}


	public void setSeating(int seating) {
		this.seating = seating;
	}
	
	


	public String getRestaurantName() {
		return restaurantName;
	}

	public void setRestaurantName(String restaurantName) {
		this.restaurantName = restaurantName;
	}

	public List<Booking> getBookings() {
		return bookings;
	}


	public void setBookings(List<Booking> bookings) {
		this.bookings = bookings;
	}



	public RestaurantTable(int tableNumber, int seating, String restaurantName) {
		
		this.tableNumber = tableNumber;
		this.seating = seating;
		this.restaurantName = restaurantName;
		this.bookings = new ArrayList<>();
	}

 
	@ManyToMany
	@JsonIgnore
    @Cascade(org.hibernate.annotations.CascadeType.SAVE_UPDATE)
    @JoinTable(
            name = "RestaurantTable_Booking",
            joinColumns = {@JoinColumn(name = "table_id", nullable = false, updatable = false)},
            inverseJoinColumns = {@JoinColumn(name="booking_id", nullable = false, updatable = false)})
	
	private List<Booking> bookings;
	
}
