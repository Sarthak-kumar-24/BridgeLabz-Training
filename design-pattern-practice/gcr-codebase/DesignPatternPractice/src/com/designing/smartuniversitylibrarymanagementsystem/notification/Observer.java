package com.designing.smartuniversitylibrarymanagementsystem.notification;

/**
 * Observer interface Any user who wants notifications must implement this
 */
public interface Observer {
	void update(String message);
}