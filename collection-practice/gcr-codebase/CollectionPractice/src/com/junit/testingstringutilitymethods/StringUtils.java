package com.junit.testingstringutilitymethods;

/*
 * StringUtils
 * -----------
 * Utility class for common string operations.
 */
public class StringUtils {

	// Returns the reverse of a string
	public String reverse(String str) {

		if (str == null) {
			return null;
		}

		return new StringBuilder(str).reverse().toString();
	}

	// Checks if a string is a palindrome
	public boolean isPalindrome(String str) {

		if (str == null) {
			return false;
		}

		String reversed = reverse(str);
		return str.equals(reversed);
	}

	// Converts string to uppercase
	public String toUpperCase(String str) {

		if (str == null) {
			return null;
		}

		return str.toUpperCase();
	}
}
