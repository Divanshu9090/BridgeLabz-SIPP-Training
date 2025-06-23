package com.bridgelab_oops.level2;

import java.util.Scanner;

public class BankAccountMain {
    public static void main(String[] args) {
        // Create a Scanner object
        Scanner input = new Scanner(System.in);

        // Account creation
        System.out.print("Enter Account Holder Name: ");
        String holder = input.nextLine();

        System.out.print("Enter Account Number: ");
        String accNumber = input.nextLine();

        System.out.print("Enter Initial Balance: ");
        double balance = input.nextDouble();

        // Create a BankAccount object
        BankAccount account = new BankAccount(holder, accNumber, balance);

        // ATM menu
        int choice;
        do {
            System.out.println("\n--- ATM Menu ---");
            System.out.println("1. Deposit");
            System.out.println("2. Withdraw");
            System.out.println("3. Check Balance");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            choice = input.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter amount to deposit: ");
                    double deposit = input.nextDouble();
                    account.deposit(deposit);
                    break;
                case 2:
                    System.out.print("Enter amount to withdraw: ");
                    double withdraw = input.nextDouble();
                    account.withdraw(withdraw);
                    break;
                case 3:
                    account.displayBalance();
                    break;
                case 4:
                    System.out.println("Thank you for using the ATM.");
                    break;
                default:
                    System.out.println("Invalid choice.");
            }
        } while (choice != 4);

        // Close the scanner
        input.close();
    }
}
