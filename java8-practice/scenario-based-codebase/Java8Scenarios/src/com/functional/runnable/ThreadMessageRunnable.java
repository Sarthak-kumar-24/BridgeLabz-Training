package com.functional.runnable;

/*
 * ThreadMessageRunnable
 * -------------------------
 * Demonstrates Runnable lambda to print
 * messages in a separate thread.
 */
public class ThreadMessageRunnable {

	public static void main(String[] args) {

		Runnable messageTask = () -> System.out.println(" Hello from separate thread — nishita says hi!");

		Thread t = new Thread(messageTask);
		t.start();

		System.out.println("Main thread message — shubham here");
	}

}
