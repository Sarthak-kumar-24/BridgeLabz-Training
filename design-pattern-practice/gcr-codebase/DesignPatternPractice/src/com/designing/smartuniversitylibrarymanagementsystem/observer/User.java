package com.designing.smartuniversitylibrarymanagementsystem.observer;

import com.designing.smartuniversitylibrarymanagementsystem.notification.Observer;

/**
 * Abstract User class Acts as base class for Student, Faculty, Librarian Also
 * implements Observer for notifications
 */
public abstract class User implements Observer {

	protected String name;

	public User(String name) {
		this.name = name;
	}

	// Common notification behavior
	@Override
	public void update(String message) {
		System.out.println(" Notification for " + name + ": " + message);
	}

	// Each user has different borrowing rules
	public abstract int getBorrowLimit();
}
