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
public class PersonalWallet extends Wallet {

    public PersonalWallet(double balance) {
        super(balance);
        this.transferLimit = balance / 2;
    }

    @Override
    public void transferTo(User receiver, double amount) {

        if (amount > transferLimit) {
            System.out.println(" Transfer limit exceeded");
            return;
        }

        if (amount > getBalanceInternal()) {
            System.out.println(" Insufficient balance");
            return;
        }

        double tax = amount * 0.02; // 2% tax
        updateBalance( -(amount + tax));
        receiver.getWallet().updateBalance(amount);

        history.add(new Transaction("Sent", amount));
        System.out.println("Transfering to "+ receiver.getName() +": +"+ amount);
        System.out.println("Personal money transfer successful");
    }
}
