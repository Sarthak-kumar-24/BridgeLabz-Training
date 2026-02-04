package com.designing.smartuniversitylibrarymanagementsystem.observer;

/**
 * Student user Limited borrowing days
 */
public class Student extends User {

	public Student(String name) {
		super(name);
	}

	@Override
	public int getBorrowLimit() {
		return 14; // 14 days
	}
}
