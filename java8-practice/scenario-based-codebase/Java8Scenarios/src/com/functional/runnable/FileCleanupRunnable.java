package com.functional.runnable;

/*
 * FileCleanupRunnable
 * -----------------------
 * Demonstrates Runnable for a simulated
 * file cleanup background job.
 */
public class FileCleanupRunnable {
	public static void main(String[] args) {

		Runnable cleanupTask = () -> {
			System.out.println(" Cleanup started by devijii");
			for (int i = 1; i <= 3; i++) {
				System.out.println("Deleting temp file " + i);
			}
			System.out.println(" Cleanup finished");
		};

		new Thread(cleanupTask).start();
	}

}
