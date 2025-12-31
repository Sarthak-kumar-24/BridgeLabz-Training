package com.inheritance.hierarchicalinheritance.bankaccounttypes;

/*
 * Bank Account Types
 * 
 * Description: Model a banking system with different account types using hierarchical inheritance. 
 * BankAccount is the superclass, with SavingsAccount, CheckingAccount, and FixedDepositAccount as subclasses.
 * 
 * Define a base class BankAccount with attributes like accountNumber and balance.
 * Define subclasses SavingsAccount, CheckingAccount, and FixedDepositAccount, 
 * each with unique attributes like interestRate for SavingsAccount and withdrawalLimit for CheckingAccount.
 * Implement a method displayAccountType() in each subclass to specify the account type.
 */
public class SavingsAccount extends BankAccount {

    private double interestRate;

    public SavingsAccount(String accountNumber, double balance, double interestRate) {
        super(accountNumber, balance);
        this.interestRate = interestRate;
    }

    @Override
    public void displayAccountType() {
        System.out.println("Savings Account");
        System.out.println("Interest Rate: " + interestRate + "%");
    }
}

