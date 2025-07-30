package com.deliverychainmanagementsystem;

import java.util.Scanner;

public class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        ManagementSystem tracker = new ManagementSystem();

        System.out.println("User: Enter your name:");
        String userName = sc.nextLine();

        System.out.println("User: Enter your package ID:");
        String userPackageId = sc.nextLine();

        System.out.println("Delivery Agent: Enter total number of packages:");
        int totalPackages = sc.nextInt();
        sc.nextLine(); // consume newline

        while (totalPackages-- > 0) {
            System.out.println("Enter package ID:");
            String id = sc.nextLine();
            tracker.addPackageId(id);

            System.out.println("Enter package contents:");
            String contents = sc.nextLine();
            tracker.addPackageContent(contents);

            System.out.println("Enter package status:");
            String status = sc.nextLine();
            tracker.addPackageStatus(status);

            System.out.println("Enter package checkpoint:");
            String checkpoint = sc.nextLine();
            tracker.addPackageCheckpoint(checkpoint);
        }

        tracker.checkOrderStatus(userPackageId, userName);
        tracker.checkPackageDetails(userPackageId);

        // close the scanner
        sc.close();
    }
}
