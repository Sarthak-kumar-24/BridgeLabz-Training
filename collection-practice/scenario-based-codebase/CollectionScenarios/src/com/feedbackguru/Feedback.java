package com.feedbackguru;

/**
 * Feedback<T> ------------ Generic model class that represents a single
 * feedback entry for any domain (Service, Product, etc.).
 */
public class Feedback<T> {

	private T type;
	private String message;
	private int rating; // -1 if rating not found

	public Feedback(T type, String message, int rating) {
		this.type = type;
		this.message = message;
		this.rating = rating;
	}

	public int getRating() {
		return rating;
	}

	public String getMessage() {
		return message;
	}

	@Override
	public String toString() {
		return "[" + rating + "/10] " + message;
	}
}
