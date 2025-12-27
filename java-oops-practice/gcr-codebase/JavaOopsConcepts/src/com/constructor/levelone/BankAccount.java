package com.constructor.levelone;

/**
 * Class Name: BankAccount
 * Represents a basic bank account.
 * Demonstrates use of public, protected, and private access modifiers.
 */
public class BankAccount {

    // Public variable (accessible everywhere)
    public long accountNumber;

    // Protected variable (accessible in subclass)
    protected String accountHolder;

    // Private variable (fully encapsulated)
    private double balance;

    /**
     * Parameterized constructor
     */
    public BankAccount(long accountNumber, String accountHolder, double balance) {
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        this.balance = balance;
    }

    /**
     * Getter for balance
     */
    public double getBalance() {
        return balance;
    }

    /**
     * Setter for balance (controlled modification)
     */
    public void setBalance(double balance) {
        if (balance < 0) {
            throw new IllegalArgumentException("Balance cannot be negative");
        }
        this.balance = balance;
    }

    /**
     * Deposit money into account
     */
    public void deposit(double amount) {
        if (amount <= 0) {
            throw new IllegalArgumentException("Deposit amount must be positive");
        }
        balance += amount;
    }

    /**
     * Withdraw money from account
     */
    public void withdraw(double amount) {
        if (amount <= 0 || amount > balance) {
            throw new IllegalArgumentException("Invalid withdrawal amount");
        }
        balance -= amount;
    }

    /**
     * Displays basic account details
     */
    public void displayAccountDetails() {
        System.out.println("Account Number : " + accountNumber);
        System.out.println("Account Holder : " + accountHolder);
        System.out.println("Balance        : ₹" + balance);
    }
}
