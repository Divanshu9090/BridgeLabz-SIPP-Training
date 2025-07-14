package com.OOPD.association;

import java.util.ArrayList;
import java.util.List;

class Customer {
    private String name;
    private List<Account> accounts;

    public Customer(String name) {
        this.name = name;
        this.accounts = new ArrayList<>();
    }

    public void addAccount(Account account) {
        accounts.add(account);
    }

    public void viewBalance() {
        System.out.println("Accounts for " + name + ":");
        for (Account account : accounts) {
            System.out.println("Account " + account.getAccountNumber() + ": $" + account.getBalance());
        }
    }
}