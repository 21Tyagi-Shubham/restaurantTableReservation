package com.project.tableReservation;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.project.tableReservation.*")
public class TableReservationApplication {

	public static void main(String[] args) {
		SpringApplication.run(TableReservationApplication.class, args);
	}

}
