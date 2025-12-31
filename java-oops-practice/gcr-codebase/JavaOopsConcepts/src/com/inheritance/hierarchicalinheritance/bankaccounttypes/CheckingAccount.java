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
public class CheckingAccount extends BankAccount {

    private double withdrawalLimit;

    public CheckingAccount(String accountNumber, double balance, double withdrawalLimit) {
        super(accountNumber, balance);
        this.withdrawalLimit = withdrawalLimit;
    }

    @Override
    public void displayAccountType() {
        System.out.println("Checking Account");
        System.out.println("Withdrawal Limit: Rs" + withdrawalLimit);
    }
}

