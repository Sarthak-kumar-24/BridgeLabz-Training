package com.multithreading.bankingsystemwithmultipletransactions;

/*
 * Transaction class
 * -----------------
 * Represents an ATM transaction performed by a customer.
 * Implements Runnable so it can be executed by a Thread.
 */
public class Transaction implements Runnable {

	private BankAccount account;
	private int amount;
	private String customerName;

	// Constructor
	public Transaction(BankAccount account, int amount, String customerName) {
		this.account = account;
		this.amount = amount;
		this.customerName = customerName;
	}

	@Override
	public void run() {

		// Display thread state before execution
		System.out.println(
				"[" + Thread.currentThread().getName() + "] State before: " + Thread.currentThread().getState());

		System.out.println("[" + customerName + "] Attempting to withdraw " + amount);

		// Perform withdrawal
		account.withdraw(amount, customerName);
	}

}
