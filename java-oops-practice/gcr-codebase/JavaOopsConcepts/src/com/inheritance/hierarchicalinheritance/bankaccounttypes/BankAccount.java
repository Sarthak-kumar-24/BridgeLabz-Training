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
public class BankAccount {

    private String accountNumber;
    protected double balance;

    public BankAccount(String accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void displayAccountType() {
        System.out.println("Generic Bank Account");
    }
    
    public static void main(String[] args) {

        BankAccount acc1 = new SavingsAccount("SA101", 50000, 4.5);
        BankAccount acc2 = new CheckingAccount("CA102", 30000, 10000);
        BankAccount acc3 = new FixedDepositAccount("FD103", 200000, 5);

        acc1.displayAccountType();
        System.out.println();

        acc2.displayAccountType();
        System.out.println();

        acc3.displayAccountType();
    }
}

