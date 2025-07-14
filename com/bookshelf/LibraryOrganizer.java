package com.bookshelf;

abstract class LibraryOrganizer {
	public abstract void returnBook(String genre,String title);
	public abstract void borrowBook(String genre,String title);
	public abstract void bookAvailable(String genre);
}
