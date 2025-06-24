package com.classandobject.level1.mobilephone;

public class MobilePhone {
    // Attributes of the MobilePhone class
    private String brand;
    private String model;
    private double price;

    // Constructor to initialize the MobilePhone object
    public MobilePhone(String brand, String model, double price) {
        this.brand = brand;
        this.model = model;
        this.price = price;
    }

    // Method to display phone details
    public void displayDetails() {
        System.out.println("\nMobile Phone Details:");
        System.out.println("Brand : " + brand);
        System.out.println("Model : " + model);
        System.out.println("Price : ₹" + price);
    }
}