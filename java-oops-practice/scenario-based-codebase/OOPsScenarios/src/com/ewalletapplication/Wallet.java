package com.ewalletapplication;

import java.util.ArrayList;

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
public abstract class Wallet implements Transferrable {

    private double balance; 
    protected double transferLimit;

    
    protected ArrayList<Transaction> history = new ArrayList<>();

    
    public Wallet(double balance) {
        this.balance = balance;
    }

    
    protected double getBalanceInternal() {
        return balance;
    }

    protected void updateBalance(double amount) {
        balance += amount;
    }

    // Public read-only access
    public double getBalance() {
        return balance;
    }

    public void showTransactions() {
        for (Transaction t : history) {
            System.out.println(t);
        }
    }
}

