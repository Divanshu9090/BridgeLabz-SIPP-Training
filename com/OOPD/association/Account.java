package com.OOPD.association;

class Account {
    private String accountNumber;
    private double balance;
    private Customer customer;
    private Bank bank;

    public Account(String accountNumber, Customer customer, Bank bank) {
        this.accountNumber = accountNumber;
        this.balance = 0.0;
        this.customer = customer;
        this.bank = bank;
    }

    public void deposit(double amount) {
        balance += amount;
    }

    public double getBalance() {
        return balance;
    }

    public String getAccountNumber() {
        return accountNumber;
    }
}