package com.bookshelf;

public class Main {
	// Static variable to hold the library instance
	private static Library l;
	// Static block to initialize the library with some books
	static {
		l = new Library();
		l.addBookInLibrary("comedy", "Book1", "Divanshu", 2);
		l.addBookInLibrary("comedy", "Book2", "Anubhav", 2);
		l.addBookInLibrary("comedy", "Book3", "Praksh", 3);

		l.addBookInLibrary("Horror", "Book1", "Ayush", 2);
		l.addBookInLibrary("Horror", "Book2", "Praksh", 2);
		l.addBookInLibrary("Horror", "Book3", "Utkarsh", 2);

		l.addBookInLibrary("Si-Fi", "Book1", "Anubhav", 2);
		l.addBookInLibrary("Si-Fi", "Book2", "Manish", 2);
		l.addBookInLibrary("Si-Fi", "Book3", "Harshit", 2);
	}

	public static void main(String[] args) {
		// Displaying the books available in the library with genre comedy
		l.bookAvailable("comedy");
		System.out.println();

		// Borrowing books from the library
		l.borrowBook("comedy", "Book1");
		l.borrowBook("comedy", "Book1");

		// Trying to borrow a book that is not available
		l.borrowBook("comedy", "Book1");

		// Trying to borrow with genre that does not exist
		l.borrowBook("Family", "Book4");
		// Trying to borrow a book that does not exist
		l.borrowBook("comedy", "Book4");

		// Trying to return a book with genre that does not exist
		l.returnBook("Family", "Book1");

		// Trying to return a book that does not exist
		l.returnBook("comedy", "Book");

		// Returning a book that was borrowed
		l.returnBook("comedy", "Book1");
	}
}
