package com.multithreading.threadstatemonitoringsystem;

/*
 * Main class
 * ----------
 * Creates TaskRunner threads and a StateMonitor thread.
 * Demonstrates complete thread life cycle.
 */
public class ThreadStateMonitoringSystem {

	public static void main(String[] args) {

		// Create task threads (NEW state)
		TaskRunner t1 = new TaskRunner("Task-1");
		TaskRunner t2 = new TaskRunner("Task-2");

		Thread[] tasks = { t1, t2 };

		// Create monitor
		StateMonitor monitor = new StateMonitor(tasks);

		// Start monitoring BEFORE starting tasks
		monitor.start();

		// Start task threads
		t1.start();
		t2.start();
	}
}
