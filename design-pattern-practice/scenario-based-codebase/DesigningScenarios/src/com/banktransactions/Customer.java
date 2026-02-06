package com.banktransactions;

/**
 * Customer class represents a bank customer. Each customer runs in its own
 * thread.
 */
public class Customer extends Thread {

	private final Bank bank;
	private final int accountNumber;

	public Customer(String name, Bank bank, int accountNumber) {
		super(name); // Thread name
		this.bank = bank;
		this.accountNumber = accountNumber;
	}

	/**
	 * This method runs when thread starts.
	 */
	@Override
	public void run() {
		bank.deposit(accountNumber, 5000);
		sleepThread();

		bank.withdraw(accountNumber, 2000);
		sleepThread();

		bank.withdraw(accountNumber, 7000);
		sleepThread();

		bank.deposit(accountNumber, 3000);
	}

	/**
	 * Sleep added to simulate real-world delays
	 */
	private void sleepThread() {
		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			System.out.println("Thread interrupted");
		}
	}
}
