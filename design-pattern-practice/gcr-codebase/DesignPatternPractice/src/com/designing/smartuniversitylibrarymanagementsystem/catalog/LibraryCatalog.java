package com.designing.smartuniversitylibrarymanagementsystem.catalog;

import java.util.ArrayList;
import java.util.List;

import com.designing.smartuniversitylibrarymanagementsystem.book.Book;
import com.designing.smartuniversitylibrarymanagementsystem.notification.Observer;
import com.designing.smartuniversitylibrarymanagementsystem.notification.Subject;



/**
 * Singleton class
 * Ensures only ONE catalog exists across campus
 * Also acts as Subject for notifications
 */
public class LibraryCatalog implements Subject {

    private static LibraryCatalog instance;

    private List<Book> books = new ArrayList<>();
    private List<Observer> observers = new ArrayList<>();

    // Private constructor
    private LibraryCatalog() {}

    // Thread-safe Singleton access
    public static synchronized LibraryCatalog getInstance() {
        if (instance == null) {
            instance = new LibraryCatalog();
        }
        return instance;
    }

    // Add new book and notify observers
    public void addBook(Book book) {
        books.add(book);
        notifyObservers("New book added: " + book);
    }

    // Observer methods
    @Override
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers(String message) {
        for (Observer obs : observers) {
            obs.update(message);
        }
    }
}
