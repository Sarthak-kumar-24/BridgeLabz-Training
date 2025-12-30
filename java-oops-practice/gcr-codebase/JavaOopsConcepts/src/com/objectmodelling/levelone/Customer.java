package com.objectmodelling.levelone;

public class Customer {

    private String name;
    private double balance;

    public Customer(String name) {
        this.name = name;
        this.balance = 0.0;
    }

    public String getName() {
        return name;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    // Customer communicates with Bank
    public void viewBalance(Bank bank) {
        System.out.println(name + "'s balance at "
                + bank.getBankName() + " is Rs" + balance);
    }
}

