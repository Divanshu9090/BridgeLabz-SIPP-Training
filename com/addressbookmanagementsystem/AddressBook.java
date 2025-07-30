package com.addressbookmanagementsystem;

import java.io.*;
import java.util.*;

public class AddressBook<T> {
    private Map<String, Contact<T>> contacts = new HashMap<>();

    // Add contact
    public void addContact(Contact<T> contact) {
        contacts.put(contact.getPhone(), contact);
    }

    // Remove contact by phone
    public void removeContact(String phone) {
        contacts.remove(phone);
    }

    // Search by name
    public Contact<T> searchByName(String name) {
        for (Contact<T> c : contacts.values()) {
            if (c.getName().equalsIgnoreCase(name)) {
                return c;
            }
        }
        return null;
    }

    // Search by phone
    public Contact<T> searchByPhone(String phone) {
        return contacts.get(phone);
    }

    // List all contacts
    public List<Contact<T>> listContacts() {
        return new ArrayList<>(contacts.values());
    }

    // Save to file
    public void saveToFile(String filename) throws IOException {
        try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(filename))) {
            out.writeObject(contacts);
        }
    }

    // Load from file
    public void loadFromFile(String filename) throws IOException, ClassNotFoundException {
        try (ObjectInputStream in = new ObjectInputStream(new FileInputStream(filename))) {
            contacts = (Map<String, Contact<T>>) in.readObject();
        }
    }

    // Check if two contacts share the same address
    public boolean hasSameAddress(Contact<T> c1, Contact<T> c2) {
        return c1.getAddress().equals(c2.getAddress());
    }

    // Sort contacts
    public List<Contact<T>> sortByName() {
        List<Contact<T>> sorted = listContacts();
        sorted.sort(Comparator.comparing(Contact::getName));
        return sorted;
    }

    public List<Contact<T>> sortByPhone() {
        List<Contact<T>> sorted = listContacts();
        sorted.sort(Comparator.comparing(Contact::getPhone));
        return sorted;
    }
}