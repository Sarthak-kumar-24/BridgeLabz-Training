package com.banktransactions;

import java.util.HashMap;
import java.util.Map;

/**
 * Bank class represents a shared resource. Multiple threads (customers) will
 * access it concurrently.
 */
public class Bank {

	// Stores accountNumber -> balance
	private final Map<Integer, Integer> accounts = new HashMap<>();

	/**
	 * Create an account with initial balance. Synchronized to avoid inconsistent
	 * initialization.
	 */
	public synchronized void createAccount(int accountNumber, int initialBalance) {
		accounts.put(accountNumber, initialBalance);
		System.out.println("Account " + accountNumber + " created with balance " + initialBalance);
	}

	/**
	 * Deposit money into an account. synchronized ensures only ONE thread modifies
	 * balance at a time.
	 */
	public synchronized void deposit(int accountNumber, int amount) {
		int currentBalance = accounts.get(accountNumber);
		int newBalance = currentBalance + amount;
		accounts.put(accountNumber, newBalance);

		System.out.println(Thread.currentThread().getName() + " deposited " + amount + " | New Balance: " + newBalance);
	}

	/**
	 * Withdraw money from an account. Checks balance to prevent overdraft.
	 */
	public synchronized void withdraw(int accountNumber, int amount) {
		int currentBalance = accounts.get(accountNumber);

		if (currentBalance >= amount) {
			int newBalance = currentBalance - amount;
			accounts.put(accountNumber, newBalance);

			System.out.println(
					Thread.currentThread().getName() + " withdrew " + amount + " | New Balance: " + newBalance);
		} else {
			System.out.println(
					Thread.currentThread().getName() + " tried to withdraw " + amount + " | Insufficient balance");
		}
	}

	/**
	 * Get balance of an account.
	 */
	public synchronized int getBalance(int accountNumber) {
		return accounts.get(accountNumber);
	}
}
