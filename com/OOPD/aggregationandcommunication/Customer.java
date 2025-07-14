package com.OOPD.aggregationandcommunication;

import java.util.ArrayList;
import java.util.List;

class Customer {
    private String name;
    private List<Order> orders;

    public Customer(String name) {
        this.name = name;
        this.orders = new ArrayList<>();
    }

    public Order placeOrder(String orderId) {
        Order order = new Order(orderId);
        orders.add(order);
        return order;
    }

    public void listOrders() {
        System.out.println("Orders for " + name + ":");
        for (Order order : orders) {
            order.listProducts();
        }
    }
}