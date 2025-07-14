package com.OOPD.association;

import java.util.ArrayList;
import java.util.List;

class Bank {
    private String name;
    private List<Account> accounts;

    public Bank(String name) {
        this.name = name;
        this.accounts = new ArrayList<>();
    }

    public Account openAccount(Customer customer, String accountNumber) {
        Account account = new Account(accountNumber, customer, this);
        accounts.add(account);
        customer.addAccount(account);
        return account;
    }
}