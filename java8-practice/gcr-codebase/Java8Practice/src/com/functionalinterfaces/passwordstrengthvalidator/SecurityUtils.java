package com.functionalinterfaces.passwordstrengthvalidator;

/*
 * SecurityUtils Interface
 * -----------------------
 * Contains utility methods related to
 * application security.
 */
public interface SecurityUtils {

	/**
	 * Checks whether a password is strong.
	 */
	static boolean isStrongPassword(String password) {

		// Check minimum length
		if (password == null || password.length() < 8) {
			return false;
		}

		boolean hasUpperCase = false;
		boolean hasLowerCase = false;
		boolean hasDigit = false;
		boolean hasSpecialChar = false;

		// Validate each character
		for (char ch : password.toCharArray()) {

			if (Character.isUpperCase(ch)) {
				hasUpperCase = true;
			} else if (Character.isLowerCase(ch)) {
				hasLowerCase = true;
			} else if (Character.isDigit(ch)) {
				hasDigit = true;
			} else {
				hasSpecialChar = true;
			}
		}

		// Password is strong only if all conditions are met
		return hasUpperCase && hasLowerCase && hasDigit && hasSpecialChar;
	}
}
