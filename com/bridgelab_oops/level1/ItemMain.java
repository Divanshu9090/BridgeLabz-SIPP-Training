package com.bridgelab_oops.level1;

import java.util.Scanner;

public class ItemMain {
    public static void main(String[] args) {
        // Create a Scanner object
        Scanner input = new Scanner(System.in);

        // Take user input for item details
        System.out.println("Enter Item code:");
        int itemCode = input.nextInt();
        input.nextLine(); // Consume the newline character left by nextInt()

        // Take user input for item name and price
        System.out.println("Enter Item name:");
        String itemName = input.nextLine();
        System.out.println("Enter Item price:");
        double price = input.nextDouble();

        // Create an Item object with the provided details
        Item item = new Item(itemCode, itemName, price);

        // Display item details
        item.itemDetails();

        // Take user input for quantity of the item
        System.out.println("Enter Item quantity:");
        int quantity = input.nextInt();

        // Calculate and display the total cost based on the quantity
        item.totalCost(quantity);

        // Close the Scanner
        input.close();
    }

}