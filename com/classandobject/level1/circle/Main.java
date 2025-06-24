package com.classandobject.level1.circle;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Create a Scanner object
        Scanner input = new Scanner(System.in);

        // Take user input for radius of the circle
        System.out.println("Please enter radius of circle:");
        double radius = input.nextDouble();

        // Create a Circle object with the given radius
        Circle circle = new Circle(radius);

        // Display the circumference and area of the circle
        System.out.println("Circumference of the circle is " + circle.CircleCircumferernce());
        System.out.println("Area of the circle is " + circle.CircleArea());

        // Close the Scanner
        input.close();
    }
}
