package com.designing.smartuniversitylibrarymanagementsystem.notification;

/**
 * Subject interface LibraryCatalog will implement this to notify users
 */
public interface Subject {
	void registerObserver(Observer observer);

	void removeObserver(Observer observer);

	void notifyObservers(String message);
}
