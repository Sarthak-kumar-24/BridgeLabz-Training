package com.multithreading.threadstatemonitoringsystem;

import java.time.LocalTime;
import java.util.HashSet;
import java.util.Set;

/*
 * StateMonitor class
 * ------------------
 * Continuously monitors the state of given threads.
 * Prints:
 * - Thread name
 * - Current state
 * - Timestamp
 * Stops once all threads reach TERMINATED state.
 */
public class StateMonitor extends Thread {

	private Thread[] threads;
	private Set<Thread.State> observedStates = new HashSet<>();

	public StateMonitor(Thread[] threads) {
		this.threads = threads;
	}

	@Override
	public void run() {

		boolean allTerminated;

		do {
			allTerminated = true;

			for (Thread t : threads) {
				Thread.State state = t.getState();
				observedStates.add(state);

				System.out.println("[Monitor] " + t.getName() + " is in " + state + " state at " + LocalTime.now());

				if (state != Thread.State.TERMINATED) {
					allTerminated = false;
				}
			}

			try {
				Thread.sleep(500); // monitor interval
			} catch (InterruptedException e) {
				System.out.println("Monitor interrupted");
			}

		} while (!allTerminated);

		System.out.println("Summary: Threads went through " + observedStates.size() + " states");
	}

}
