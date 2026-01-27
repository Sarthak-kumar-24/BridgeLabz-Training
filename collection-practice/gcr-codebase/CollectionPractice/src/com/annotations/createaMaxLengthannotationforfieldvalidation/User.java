package com.annotations.createaMaxLengthannotationforfieldvalidation;

import java.lang.reflect.Field;

public class User {

	// Applying MaxLength annotation to field
	@MaxLength(10)
	private String username;

	// Constructor
	public User(String username) {

		// Validate field using reflection
		validateMaxLength(username);

		// Assign only if validation passes
		this.username = username;
	}

	// Validation logic
	private void validateMaxLength(String value) {
		try {
			// Get Class object
			Class<?> clazz = this.getClass();

			// Get Field object for 'username'
			Field field = clazz.getDeclaredField("username");

			// Check if @MaxLength is present
			if (field.isAnnotationPresent(MaxLength.class)) {

				// Get annotation instance
				MaxLength maxLength = field.getAnnotation(MaxLength.class);

				int allowedLength = maxLength.value();

				// Validate length
				if (value.length() > allowedLength) {
					throw new IllegalArgumentException("Username length exceeds max limit of " + allowedLength);
				}
			}

		} catch (NoSuchFieldException e) {
			e.printStackTrace();
		}
	}

	public String getUsername() {
		return username;
	}

	public static void main(String[] args) {

		// Valid username
		User u1 = new User("Sarthak");
		System.out.println("User created: " + u1.getUsername());

		// Invalid username (length > 10)
		User u2 = new User("VeryLongUsername");
		System.out.println("User created: " + u2.getUsername());
	}
}
