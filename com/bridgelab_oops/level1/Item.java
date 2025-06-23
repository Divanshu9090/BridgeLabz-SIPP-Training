package com.bridgelab_oops.level1;

public class Item {

    // Item class represents an item with a code, name, and price.
    private int itemCode;
    private String itemName;
    private double price;

    // Constructor to initialize the item with its code, name, and price.
    public Item(int itemCode, String itemName, double price) {
        this.itemCode = itemCode;
        this.itemName = itemName;
        this.price = price;
    }

    // Method to display the details of the item.
    public void itemDetails() {
        System.out.println("Item Details: ");
        System.out.println("Item Code: " + itemCode);
        System.out.println("Item Name: " + itemName);
        System.out.println("Item Price: " + price);
    }

    // Method to calculate and display the total cost based on the quantity
    // purchased.
    public void totalCost(int quantity) {
        System.out.println("The total cost is: " + price * quantity);
    }
}