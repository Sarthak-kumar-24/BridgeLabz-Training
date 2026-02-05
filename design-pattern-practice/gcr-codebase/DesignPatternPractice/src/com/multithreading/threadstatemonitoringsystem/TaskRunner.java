package com.multithreading.threadstatemonitoringsystem;

/*
 * TaskRunner class
 * ----------------
 * Represents a worker thread that performs:
 * 1) Some computation (RUNNABLE)
 * 2) Sleeps for 2 seconds (TIMED_WAITING)
 * 3) Completes execution (TERMINATED)
 */
public class TaskRunner extends Thread {

	public TaskRunner(String name) {
		super(name);
	}

	@Override
	public void run() {
		try {
			// Simulate computation (RUNNABLE)
			for (int i = 0; i < 1_000_000; i++) {
				Math.sqrt(i);
			}

			// Sleep to enter TIMED_WAITING
			Thread.sleep(2000);

		} catch (InterruptedException e) {
			System.out.println(getName() + " interrupted");
		}
	}

}
