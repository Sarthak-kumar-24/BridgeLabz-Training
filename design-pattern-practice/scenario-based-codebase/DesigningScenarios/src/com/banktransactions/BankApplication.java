package com.banktransactions;

/**
 * Main class to simulate multiple customers accessing the bank concurrently.
 */
public class BankApplication {

	public static void main(String[] args) {

		Bank bank = new Bank();

		// Create one shared account
		bank.createAccount(101, 10000);

		// Multiple customers using SAME account
		Customer c1 = new Customer("Customer-1", bank, 101);
		Customer c2 = new Customer("Customer-2", bank, 101);
		Customer c3 = new Customer("Customer-3", bank, 101);

		// Start all threads
		c1.start();
		c2.start();
		c3.start();

		// Wait for all threads to finish
		try {
			c1.join();
			c2.join();
			c3.join();
		} catch (InterruptedException e) {
			System.out.println("Main thread interrupted");
		}

		// Final balance
		System.out.println("\nFinal Account Balance: " + bank.getBalance(101));
	}
}
