package com.functionalinterfaces.backgroundjobexecution;

/*
 * BackgroundJobExecution
 * ----------------------
 * Demonstrates asynchronous task execution
 * using the Runnable functional interface.
 */
public class BackgroundJobExecution {

	public static void main(String[] args) {

		// Runnable task using lambda expression
		Runnable backgroundTask = () -> {
			System.out.println(" Background task started...");

			try {
				// Simulating long-running task
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				System.out.println(" Background task interrupted");
			}

			System.out.println(" Background task completed");
		};

		// Creating a thread for asynchronous execution
		Thread workerThread = new Thread(backgroundTask);

		System.out.println(" Main thread continues execution");

		// Start background task
		workerThread.start();
	}
}
