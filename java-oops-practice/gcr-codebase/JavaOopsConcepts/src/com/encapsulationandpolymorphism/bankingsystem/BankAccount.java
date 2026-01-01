package com.encapsulationandpolymorphism.bankingsystem;

import java.util.ArrayList;
import java.util.List;

/* Banking System
 * 
 * Description: Create a banking system with different account types:
 * 
 * Define an abstract class BankAccount with fields like accountNumber, holderName, and balance.
 * Add methods like deposit(double amount) and withdraw(double amount) (concrete) and calculateInterest() (abstract).
 * Implement subclasses SavingsAccount and CurrentAccount with unique interest calculations.
 * Create an interface Loanable with methods applyForLoan() and calculateLoanEligibility().
 * Use encapsulation to secure account details and restrict unauthorized access.
 * Demonstrate polymorphism by processing different account types and calculating interest dynamically.

 */
abstract class BankAccount {

    private String accountNumber;
    private String holderName;
    protected double balance;

    public BankAccount(String accountNumber, String holderName, double balance) {
        this.accountNumber = accountNumber;
        this.holderName = holderName;
        this.balance = balance;
    }

    
    public String getAccountNumber() {
        return accountNumber;
    }

    public String getHolderName() {
        return holderName;
    }

    public double getBalance() {
        return balance;
    }

    // Concrete methods
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("₹" + amount + " deposited");
        }
    }

    public void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
            System.out.println("Rs" + amount + " withdrawn");
        } else {
            System.out.println("Insufficient balance");
        }
    }

    // Abstract method
    public abstract double calculateInterest();
    
    public static void processAccounts(List<BankAccount> accounts) {

        for (BankAccount acc : accounts) {

            double interest = acc.calculateInterest(); 

            System.out.println("Account Holder: " + acc.getHolderName());
            System.out.println("Balance: Rs" + acc.getBalance());
            System.out.println("Interest: Rs" + interest);

            if (acc instanceof Loanable l) {
                System.out.println("Loan Eligibility: Rs" + l.calculateLoanEligibility());
            }

            System.out.println("----------------------------");
        }
    }
    
    public static void main(String[] args) {

        List<BankAccount> accounts = new ArrayList<>();

        accounts.add(new SavingsAccount("SA101", "Aman", 50000));
        accounts.add(new CurrentAccount("CA202", "Neha", 80000));

        processAccounts(accounts);
    }
}

