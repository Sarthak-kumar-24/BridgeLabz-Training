package com.exceptions.banktransactionsystem;

public class BankAccount {
	
	   private double balance;

	    // Constructor to initialize balance
	    public BankAccount(double balance) {
	        this.balance = balance;
	    }

	    // Withdraw method
	    // Throws:
	    // 1) InsufficientBalanceException (checked)
	    // 2) IllegalArgumentException (unchecked)
	    public void withdraw(double amount) throws InsufficientBalanceException {

	        // Negative amount check
	        if (amount < 0) {
	            throw new IllegalArgumentException("Invalid amount!");
	        }

	        // Insufficient balance check
	        if (amount > balance) {
	            throw new InsufficientBalanceException("Insufficient balance!");
	        }

	        // Withdrawal successful
	        balance -= amount;
	        System.out.println("Withdrawal successful, new balance: " + balance);
	    }

}
