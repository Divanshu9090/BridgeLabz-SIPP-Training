package com.bookshelf;

public class Book {
	private String title;
	private String author;
	private int available;
	Book next;
	Book(String title, String author, int count){
		this.title = title;
		this.author = author;
		this.available = count;
	}
	
	public String getTitle() {
		return title;
	}
	
	public String getAuthor() {
		return author;
	}
	
	// check if the book is available
	public boolean isAvailable() {
		return available>0;
	}
	
	// Borrow the book if available
	public void borrowed() {
		if(!isAvailable()) {
			System.out.println("Book was not available");
			return;
		}
		available--;
		System.out.println("Book borrowed Successfully");
	}
	
	// Return the book and increase the count
	public void returned() {
		available++;
		System.out.println("Book returned Successfully");
	}
}
