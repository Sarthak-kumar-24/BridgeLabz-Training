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
public class BusinessWallet extends Wallet {

    public BusinessWallet(double balance) {
        super(balance);
        this.transferLimit = balance / 2;
    }

    @Override
    public void transferTo(User receiver, double amount) {

        if (amount > transferLimit) {
            System.out.println(" Business transfer limit exceeded");
            return;
        }

        double serviceCharge = amount * 0.01; // 1% charge
        updateBalance(-(amount + serviceCharge));
        
        receiver.getWallet().updateBalance(amount);

        history.add(new Transaction("Business Transfer", amount));
        System.out.println("Business Money transfered to "+ receiver.getName()+": Rs"+ amount);
        System.out.println("Business transfer successful");
    }
}

