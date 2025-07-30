package com.addressbookmanagementsystem;

import java.io.*;

public class Main {
	public static void main(String[] args) {
        AddressBook<String> book = new AddressBook<>();

        Contact<String> c1 = new Contact<>("Anubhav", "9876543210", "Anubhav@example.com", "123 Street A");
        Contact<String> c2 = new Contact<>("Divanshu", "9123456780", "Divanshu@example.com", "123 Street A");
        Contact<String> c3 = new Contact<>("Prakash", "9988776655", "Prakash@example.com", "456 Street B");

        book.addContact(c1);
        book.addContact(c2);
        book.addContact(c3);

        System.out.println("Search by name: " + book.searchByName("Anubhav"));
        System.out.println("Search by phone: " + book.searchByPhone("9123456780"));

        System.out.println("\nSorted by name:");
        for (Contact<String> c : book.sortByName()) {
            System.out.println(c);
        }

        System.out.println("\nSorted by phone:");
        for (Contact<String> c : book.sortByPhone()) {
            System.out.println(c);
        }

        System.out.println("\nRelationship check (Anubhav & Divanshu): " + book.hasSameAddress(c1, c2));
        System.out.println("Relationship check (Anubhav & Prakash): " + book.hasSameAddress(c1, c3));

        // Optional: save and load
        try {
            book.saveToFile("contacts.dat");
            AddressBook<String> loadedBook = new AddressBook<>();
            loadedBook.loadFromFile("contacts.dat");
            System.out.println("\nContacts loaded from file:");
            for (Contact<String> c : loadedBook.listContacts()) {
                System.out.println(c);
            }
        } catch (IOException | ClassNotFoundException e) {
            System.err.println("File operation error: " + e.getMessage());
        }
    }
}
