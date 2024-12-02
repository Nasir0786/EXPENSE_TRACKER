package com.example.expensetracker;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication  // it combines 3 spring boot annoatiations @congfiguration it marks the class source of bean application
//@enable auto configuration it enables springs auto configuration mechanism which configure according to class path@component scan it enables
//componenet scanning
public class ExpenseTrackerApplication {

	public static void main(String[] args) {
		SpringApplication.run(ExpenseTrackerApplication.class, args);
	}
}
