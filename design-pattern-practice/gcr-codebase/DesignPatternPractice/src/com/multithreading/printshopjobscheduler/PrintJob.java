package com.multithreading.printshopjobscheduler;

/*
 * PrintJob class
 * --------------
 * Represents a print job submitted to the printer.
 * Implements Runnable so multiple jobs can be executed concurrently.
 */
public class PrintJob implements Runnable {

	private String jobName;
	private int pages;
	private String priorityLabel;

	// Constructor
	public PrintJob(String jobName, int pages, String priorityLabel) {
		this.jobName = jobName;
		this.pages = pages;
		this.priorityLabel = priorityLabel;
	}

	@Override
	public void run() {
		try {
			for (int page = 1; page <= pages; page++) {

				// Simulate printing time (100ms per page)
				Thread.sleep(100);

				System.out.println("[" + priorityLabel + "] Printing " + jobName + " - Page " + page + " of " + pages);
			}
		} catch (InterruptedException e) {
			System.out.println(jobName + " interrupted");
		}
	}
}
