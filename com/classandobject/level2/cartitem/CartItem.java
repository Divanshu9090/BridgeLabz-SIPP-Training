package com.classandobject.level2.cartitem;

public class CartItem {
    // Attributes for CartItem
    private String itemName;
    private double price;
    private int quantity;

    // Constructor to initialize a CartItem object
    public CartItem(String itemName, double price, int quantity) {
        this.itemName = itemName;
        this.price = price;
        this.quantity = quantity;
    }

    // Getters
    public String getItemName() {
        return itemName;
    }

    // Method to get the total price of the item
    public double getTotalPrice() {
        return price * quantity;
    }

    // Method to get the price of a single item
    public void displayItem() {
        System.out.println(itemName + " - ₹" + price + " x " + quantity + " = ₹" + getTotalPrice());
    }
}