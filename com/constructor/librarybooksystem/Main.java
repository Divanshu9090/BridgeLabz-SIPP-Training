package com.constructor.librarybooksystem;

public class Main {

	public static void main(String[] args) {
		// Create a book object
		Book book1 = new Book("The Alchemist", "Paulo Coelho", 1299, true);

		// Display book info
		System.out.println("Book Details:");
		book1.displayInfo();

		System.out.println();

		// Attempt to borrow the book
		book1.borrowBook();

		System.out.println();

		// Check availability after borrowing
		book1.displayInfo();

		System.out.println();

		// Try borrowing again
		book1.borrowBook();
	}

}
