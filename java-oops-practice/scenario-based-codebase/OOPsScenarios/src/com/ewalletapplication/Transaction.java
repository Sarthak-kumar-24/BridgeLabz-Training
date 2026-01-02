package com.ewalletapplication;

/* E-Wallet Application
 * 
 * Scenario: Users can register, load money, transfer funds, and view transaction history.
 * 
 * Class: User, Wallet, Transaction
 * Constructors: Initialize wallets with optional referral bonus
 * Access Modifiers: Make balance private, expose via getBalance()
 * Encapsulation: Prevent direct manipulation of balance
 * Abstraction: Expose only essential transaction methods
 * Polymorphism: Same transferTo() method but different business logic
 * Inheritance: PersonalWallet, BusinessWallet with different limits
 * 
 */
public class Transaction {
    private String type;
    private double amount;

    public Transaction(String type, double amount) {
        this.type = type;
        this.amount = amount;
    }

    @Override
    public String toString() {
        return type + " : Rs " + amount;
    }
}

