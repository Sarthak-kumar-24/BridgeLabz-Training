package com.multithreading.bankingsystemwithmultipletransactions;

/*
 * Main class
 * ----------
 * Creates multiple transaction threads and starts them.
 * Demonstrates concurrent access to a shared resource.
 */
public class BankingSystem {

	public static void main(String[] args) throws InterruptedException {

		BankAccount account = new BankAccount();

		// Create transactions with different withdrawal amounts
		Thread t1 = new Thread(new Transaction(account, 3000, "Customer-1"), "Thread-1");
		Thread t2 = new Thread(new Transaction(account, 4000, "Customer-2"), "Thread-2");
		Thread t3 = new Thread(new Transaction(account, 2000, "Customer-3"), "Thread-3");
		Thread t4 = new Thread(new Transaction(account, 5000, "Customer-4"), "Thread-4");
		Thread t5 = new Thread(new Transaction(account, 1500, "Customer-5"), "Thread-5");

		// Start all transactions
		t1.start();
		t2.start();
		t3.start();
		t4.start();
		t5.start();

		// Wait for all threads to complete
		t1.join();
		t2.join();
		t3.join();
		t4.join();
		t5.join();

		System.out.println("Final Account Balance: " + account.getBalance());
	}

}
