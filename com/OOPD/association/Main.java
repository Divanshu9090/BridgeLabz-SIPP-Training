package com.OOPD.association;

public class Main {
	public static void main(String[] args) {
        // Create Bank and Customers
        Bank bank = new Bank("Global Bank");
        Customer customer1 = new Customer("Alice");
        Customer customer2 = new Customer("Bob");

        // Open accounts
        Account account1 = bank.openAccount(customer1, "A001");
        Account account2 = bank.openAccount(customer1, "A002");
        Account account3 = bank.openAccount(customer2, "B001");

        // Perform transactions
        account1.deposit(1000);
        account2.deposit(500);
        account3.deposit(2000);

        // View balances
        customer1.viewBalance();
        customer2.viewBalance();
    }
}