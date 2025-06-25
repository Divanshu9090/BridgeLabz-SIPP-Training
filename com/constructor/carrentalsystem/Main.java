package com.constructor.carrentalsystem;

public class Main {

	public static void main(String[] args) {
		// Using default constructor
		CarRental defaultRental = new CarRental();
		System.out.println("Default Rental:");
		defaultRental.displayInfo();

		System.out.println();

		// Using parameterized constructor
		CarRental customRental = new CarRental("Karan", "Honda Civic", 4);
		System.out.println("Custom Rental:");
		customRental.displayInfo();
	}

}
