package com.designing.smartuniversitylibrarymanagementsystem.observer;

/**
 * Factory class Creates users dynamically at runtime
 */
public class UserFactory {

	public static User createUser(String role, String name) {

		switch (role.toLowerCase()) {
		case "student":
			return new Student(name);

		case "faculty":
			return new Faculty(name);

		case "librarian":
			return new Librarian(name);

		default:
			throw new IllegalArgumentException("Invalid user role!");
		}
	}
}
