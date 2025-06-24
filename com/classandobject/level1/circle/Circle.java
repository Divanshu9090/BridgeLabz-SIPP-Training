package com.classandobject.level1.circle;

public class Circle {
    private double radius;

    // Constructor to initialize the radius of the circle
    public Circle(double radius) {
        this.radius = radius;
    }

    // Method to calculate the circumference of the circle
    public double CircleCircumferernce() {
        return (2 * 3.14 * radius);
    }

    // Method to calculate the area of the circle
    public double CircleArea() {
        return (3.14 * radius * radius);
    }
}