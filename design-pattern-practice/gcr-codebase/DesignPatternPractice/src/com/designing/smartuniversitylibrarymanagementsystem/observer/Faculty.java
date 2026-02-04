package com.designing.smartuniversitylibrarymanagementsystem.observer;

/**
 * Faculty user Extended borrowing privileges
 */
public class Faculty extends User {

	public Faculty(String name) {
		super(name);
	}

	@Override
	public int getBorrowLimit() {
		return 30; // 30 days
	}
}