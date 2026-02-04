package com.designing.smartuniversitylibrarymanagementsystem.observer;

/**
 * Librarian user Manages inventory
 */
public class Librarian extends User {

	public Librarian(String name) {
		super(name);
	}

	@Override
	public int getBorrowLimit() {
		return 0; // Librarian doesn't borrow
	}
}
