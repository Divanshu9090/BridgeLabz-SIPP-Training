package com.OOPD.aggregation;

public class Main {
    public static void main(String[] args) {
        // Create Book objects
        Book book1 = new Book("1984", "George Orwell");
        Book book2 = new Book("Pride and Prejudice", "Jane Austen");

        // Create Library objects
        Library library1 = new Library("City Library");
        Library library2 = new Library("Town Library");

        // Add books to libraries (demonstrating aggregation)
        library1.addBook(book1);
        library1.addBook(book2);
        library2.addBook(book1); // Same book can exist in multiple libraries

        // List books
        library1.listBooks();
        library2.listBooks();
    }
}