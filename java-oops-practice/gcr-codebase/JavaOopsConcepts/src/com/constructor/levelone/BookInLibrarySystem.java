package com.constructor.levelone;

/**
 * Base Class Name: BookInLibrarySystem
 * Represents a book in a library system.
 * Demonstrates public, protected, and private access modifiers.
 */
public class BookInLibrarySystem
 {

    // Public variable (accessible everywhere)
    public String ISBN;

    // Protected variable (accessible in subclass)
    protected String title;

    // Private variable (encapsulated)
    private String author;

    /**
     * Parameterized constructor
     */
    public BookInLibrarySystem(String ISBN, String title, String author) {
        this.ISBN = ISBN;
        this.title = title;
        this.author = author;
    }

    /**
     * Getter for author (private variable)
     */
    public String getAuthor() {
        return author;
    }

    /**
     * Setter for author (private variable)
     */
    public void setAuthor(String author) {
        if (author == null || author.isEmpty()) {
            throw new IllegalArgumentException("Author name cannot be empty");
        }
        this.author = author;
    }

    /**
     * Displays basic book details
     */
    public void displayBookDetails() {
        System.out.println("ISBN   : " + ISBN);
        System.out.println("Title  : " + title);
        System.out.println("Author : " + author);
    }
}

