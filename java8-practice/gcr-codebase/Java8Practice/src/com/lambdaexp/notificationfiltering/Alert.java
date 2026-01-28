package com.lambdaexp.notificationfiltering;

/**
 * Represents a notification alert in the hospital app.
 */
public class Alert {

	private String message;
	private String type; // EMERGENCY, MEDICATION, APPOINTMENT, INFO

	public Alert(String message, String type) {
		this.message = message;
		this.type = type;
	}

	public String getMessage() {
		return message;
	}

	public String getType() {
		return type;
	}

	@Override
	public String toString() {
		return "[" + type + "] " + message;
	}
}
