package com.annotations.repeatableannotation;

import java.lang.reflect.Method;

public class BugTracker {

	@BugReport(description = "NullPointerException occurs on login")
	@BugReport(description = "UI breaks on small screens")
	public void processBug() {
		System.out.println("Processing bugs...");
	}

	public static void main(String[] args) {

		try {
			// Create object
			BugTracker tracker = new BugTracker();

			// Get Class object
			Class<?> clazz = tracker.getClass();

			// Get method object
			Method method = clazz.getMethod("processBug");

			// Retrieve all BugReport annotations
			BugReport[] bugReports = method.getAnnotationsByType(BugReport.class);

			// Print all bug descriptions
			for (BugReport bug : bugReports) {
				System.out.println("Bug: " + bug.description());
			}

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
