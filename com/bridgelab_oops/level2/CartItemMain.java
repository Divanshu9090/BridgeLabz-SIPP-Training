package com.bridgelab_oops.level2;

import java.util.ArrayList;
import java.util.Scanner;

public class CartItemMain {
    public static void main(String[] args) {
        // Create a Scanner object
        Scanner input = new Scanner(System.in);

        // Create an ArrayList to hold CartItem objects
        ArrayList<CartItem> cart = new ArrayList<>();

        // Menu for shopping cart operations
        int choice;
        do {
            System.out.println("\n--- Shopping Cart Menu ---");
            System.out.println("1. Add item to cart");
            System.out.println("2. Remove item from cart");
            System.out.println("3. Display cart and total");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            choice = input.nextInt();
            input.nextLine(); // consume newline

            switch (choice) {
                case 1:
                    System.out.print("Enter item name: ");
                    String name = input.nextLine();
                    System.out.print("Enter price: ");
                    double price = input.nextDouble();
                    System.out.print("Enter quantity: ");
                    int quantity = input.nextInt();
                    cart.add(new CartItem(name, price, quantity));
                    System.out.println("Item added to cart.");
                    break;

                case 2:
                    System.out.print("Enter item name to remove: ");
                    String itemToRemove = input.nextLine();
                    boolean removed = false;
                    for (int i = 0; i < cart.size(); i++) {
                        if (cart.get(i).getItemName().equalsIgnoreCase(itemToRemove)) {
                            cart.remove(i);
                            removed = true;
                            System.out.println("Item removed.");
                            break;
                        }
                    }
                    if (!removed) {
                        System.out.println("Item not found in cart.");
                    }
                    break;

                case 3:
                    if (cart.isEmpty()) {
                        System.out.println("Cart is empty.");
                    } else {
                        double total = 0;
                        System.out.println("\nItems in cart:");
                        for (CartItem item : cart) {
                            item.displayItem();
                            total += item.getTotalPrice();
                        }
                        System.out.println("Total Cost: ₹" + total);
                    }
                    break;

                case 4:
                    System.out.println("Thank you for shopping!");
                    break;

                default:
                    System.out.println("Invalid choice.");
            }
        } while (choice != 4);

        // Close the scanner
        input.close();
    }
}