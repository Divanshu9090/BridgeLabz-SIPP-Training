package com.OOPD.aggregationandcommunication;

import java.util.ArrayList;
import java.util.List;

class Order {
    private String orderId;
    private List<Product> products;

    public Order(String orderId) {
        this.orderId = orderId;
        this.products = new ArrayList<>();
    }

    public void addProduct(Product product) {
        products.add(product);
    }

    public void listProducts() {
        System.out.println("Products in Order " + orderId + ":");
        for (Product product : products) {
            System.out.println("- " + product);
        }
    }
}
