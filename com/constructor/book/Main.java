package com.constructor.book;

public class Main {

	public static void main(String[] args) {
		// Using default constructor
		Book defaultBook = new Book();
		defaultBook.displayInfo();

		System.out.println();

		// Using parameterized constructor
		Book customBook = new Book("XYZ", "ABC", 1499);
		customBook.displayInfo();
	}
}