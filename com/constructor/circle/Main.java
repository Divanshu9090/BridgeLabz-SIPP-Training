package com.constructor.circle;

public class Main {
    public static void main(String[] args) {
        // Using default constructor
        Circle defaultCircle = new Circle();
        defaultCircle.displayInfo();

        System.out.println();

        // Using parameterized constructor
        Circle customCircle = new Circle(4.5);
        customCircle.displayInfo();
    }
}
