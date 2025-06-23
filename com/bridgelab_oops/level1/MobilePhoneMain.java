package com.bridgelab_oops.level1;

import java.util.Scanner;

public class MobilePhoneMain {
    public static void main(String[] args) {
        // Create a Scanner object
        Scanner input = new Scanner(System.in);

        // Input from user for mobile phone details
        System.out.print("Enter Mobile Brand: ");
        String brand = input.nextLine();

        System.out.print("Enter Mobile Model: ");
        String model = input.nextLine();

        System.out.print("Enter Mobile Price: ");
        double price = input.nextDouble();

        // Create MobilePhone object
        MobilePhone phone = new MobilePhone(brand, model, price);

        // Display the details
        phone.displayDetails();

        // Close the Scanner
        input.close();
    }
}