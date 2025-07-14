package com.OOPD.aggregationandcommunication;

public class Main {
	public static void main(String[] args) {
        // Create Customer
        Customer bob = new Customer("Bob");

        // Create Products
        Product laptop = new Product("Laptop", 999.99);
        Product phone = new Product("Phone", 499.99);

        // Place Order and Add Products (Aggregation)
        Order order1 = bob.placeOrder("O001");
        order1.addProduct(laptop);
        order1.addProduct(phone);

        // Demonstrate Association and Aggregation
        bob.listOrders();
    }
}