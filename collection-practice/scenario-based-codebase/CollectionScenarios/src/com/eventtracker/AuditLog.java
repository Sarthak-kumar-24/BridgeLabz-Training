package com.eventtracker;

/**
 * Represents a structured audit log entry that will be exported in JSON format.
 */
public class AuditLog {

	// Name of the class where event occurred
	public String className;

	// Method name
	public String methodName;

	// Action performed
	public String action;

	// Module name
	public String module;

	// Timestamp of the event
	public String timestamp;

	/**
	 * Constructor to initialize audit log
	 */
	public AuditLog(String className, String methodName, String action, String module, String timestamp) {
		this.className = className;
		this.methodName = methodName;
		this.action = action;
		this.module = module;
		this.timestamp = timestamp;
	}
}
