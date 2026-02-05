package com.multithreading.printshopjobscheduler;

/*
 * Main class
 * ----------
 * Acts as the print shop scheduler.
 * Creates multiple print jobs with different priorities
 * and measures total execution time.
 */
public class PrintShopScheduler {

	public static void main(String[] args) throws InterruptedException {

		System.out.println("Starting print jobs...");

		long startTime = System.currentTimeMillis();

		// Create print jobs
		Thread job1 = new Thread(new PrintJob("Job1", 10, "Medium Priority"));
		Thread job2 = new Thread(new PrintJob("Job2", 5, "High Priority"));
		Thread job3 = new Thread(new PrintJob("Job3", 15, "Low Priority"));
		Thread job4 = new Thread(new PrintJob("Job4", 8, "Medium Priority"));
		Thread job5 = new Thread(new PrintJob("Job5", 12, "High Priority"));

		// Set thread priorities
		job1.setPriority(Thread.NORM_PRIORITY); // 5
		job2.setPriority(Thread.MAX_PRIORITY); // 10
		job3.setPriority(Thread.MIN_PRIORITY); // 1
		job4.setPriority(6);
		job5.setPriority(7);

		// Start jobs
		job1.start();
		job2.start();
		job3.start();
		job4.start();
		job5.start();

		// Wait for all jobs to complete
		job1.join();
		job2.join();
		job3.join();
		job4.join();
		job5.join();

		long endTime = System.currentTimeMillis();

		System.out.println("All jobs completed in " + (endTime - startTime) + " ms");
	}
}
