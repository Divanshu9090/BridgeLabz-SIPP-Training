package com.bookshelf;

import java.util.HashMap;

public class Library extends LibraryOrganizer{
	public HashMap<String,Book> map;
	public Library() {
		map = new HashMap<>();
	}
	
	public void addBookInLibrary(String genre, String title, String author, int count) {
		Book newBook = new Book(title,author,count);
		if(map.containsKey(genre)) {
			Book temp = map.get(genre);
			while(temp.next!=null) {
				temp = temp.next;
			}
			temp.next = newBook;
		} else {
			map.put(genre, newBook);
		}
	}
	
	public void returnBook(String genre,String title) {
		if(map.containsKey(genre)) {
			Book temp = map.get(genre);
			while(temp!=null) {
				if(temp.getTitle()==title) {
					temp.returned();
					return;
				}
				temp = temp.next;
			}
			System.out.println("Please Enter write title");
		} else {
			System.out.println("Please Enter write genre");
		}
	}
	public void borrowBook(String genre,String title) {
		if(map.containsKey(genre)) {
			Book temp = map.get(genre);
			while(temp!=null) {
				if(temp.getTitle()==title) {
					temp.borrowed();
					return;
				}
				temp = temp.next;
			}
			System.out.println("Please enter write title or no book available with that title.");
		} else {
			System.out.println("No book available with this genre.");
		}
	}
	
	public void bookAvailable(String genre) {
		if(map.containsKey(genre)) {
			Book temp = map.get(genre);
			while(temp!=null) {
				if(temp.isAvailable()) {
					System.out.println(temp.getTitle()+" by "+ temp.getAuthor());
				}
				temp = temp.next;
			}
		} else {
			System.out.println("No book available with this genre.");
		}
	}
}
