package com.junit.testingbankingtransactions;

/*
 * BankAccount
 * -----------
 * Represents a simple bank account with
 * deposit and withdrawal functionality.
 */
public class BankAccount {

    private double balance;

    // Constructor
    public BankAccount(double initialBalance) {
        this.balance = initialBalance;
    }

    // Deposit money into account
    public void deposit(double amount) {

        if (amount <= 0) {
            throw new IllegalArgumentException("Deposit amount must be positive");
        }

        balance += amount;
    }

    // Withdraw money from account
    public void withdraw(double amount) {

        if (amount <= 0) {
            throw new IllegalArgumentException("Withdrawal amount must be positive");
        }

        if (amount > balance) {
            throw new IllegalStateException("Insufficient funds");
        }

        balance -= amount;
    }

    // Get current balance
    public double getBalance() {
        return balance;
    }
}

