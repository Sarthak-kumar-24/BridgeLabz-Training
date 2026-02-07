package com.functional.runnable;

/*
 * BackgroundTaskRunnable
 * --------------------------
 * Demonstrates Runnable using lambda to run
 * a background task in a separate thread.
 */
public class BackgroundTaskRunnable {

	public static void main(String[] args) {

		Runnable backgroundTask = () -> {
			System.out.println(" Background task started by sarthak");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println(" Background task completed");
		};

		new Thread(backgroundTask).start();

		System.out.println("Main thread continues...");
	}

}
