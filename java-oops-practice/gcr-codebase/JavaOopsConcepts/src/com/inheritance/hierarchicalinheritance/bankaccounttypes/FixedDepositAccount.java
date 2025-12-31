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
public class FixedDepositAccount extends BankAccount {

    private int lockInPeriod; // in years

    public FixedDepositAccount(String accountNumber, double balance, int lockInPeriod) {
        super(accountNumber, balance);
        this.lockInPeriod = lockInPeriod;
    }

    @Override
    public void displayAccountType() {
        System.out.println("Fixed Deposit Account");
        System.out.println("Lock-in Period: " + lockInPeriod + " years");
    }
}

