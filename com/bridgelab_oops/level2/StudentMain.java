package com.bridgelab_oops.level2;

import java.util.Scanner;

public class StudentMain {
    public static void main(String[] args) {
        // Create a Scanner object
        Scanner input = new Scanner(System.in);

        // User input for student details
        System.out.print("Enter Student Name: ");
        String name = input.nextLine();

        System.out.print("Enter Roll Number: ");
        int rollNumber = input.nextInt();

        System.out.print("Enter Marks: ");
        double marks = input.nextDouble();

        // Create Student object
        Student student = new Student(name, rollNumber, marks);

        // Display student details
        student.displayDetails();

        // Close the Scanner
        input.close();
    }
}