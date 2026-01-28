package com.functionalinterfaces.dataserializationforbackup;

/*
 * TempSession
 * -----------
 * Temporary session data
 * (not eligible for backup).
 */
public class TempSession {

	private String sessionId;

	public TempSession(String sessionId) {
		this.sessionId = sessionId;
	}
}
