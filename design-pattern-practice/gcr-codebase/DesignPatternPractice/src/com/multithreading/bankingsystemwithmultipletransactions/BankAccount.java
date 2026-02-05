package com.multithreading.bankingsystemwithmultipletransactions;

import java.time.LocalTime;

/*
 * BankAccount class
 * ------------------
 * Represents a shared bank account.
 * Multiple threads (customers) will access this object concurrently.
 * Synchronization is required to avoid race conditions.
 */
public class BankAccount {

	private int balance = 10000; // initial balance

	// Synchronized method to ensure thread-safe withdrawal
	public synchronized boolean withdraw(int amount, String customerName) {

		// Check if sufficient balance is available
		if (balance >= amount) {
			System.out.println("Transaction successful: " + customerName + ", Amount: " + amount + ", Balance: "
					+ (balance - amount) + ", Time: " + LocalTime.now());

			balance -= amount;
			return true;
		} else {
			System.out.println("Transaction failed: " + customerName + ", Amount: " + amount + ", Balance: " + balance
					+ ", Time: " + LocalTime.now());
			return false;
		}
	}

	// Getter for balance
	public int getBalance() {
		return balance;
	}

}
