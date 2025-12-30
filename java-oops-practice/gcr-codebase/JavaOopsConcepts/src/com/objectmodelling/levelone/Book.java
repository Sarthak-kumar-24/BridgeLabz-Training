package com.objectmodelling.levelone;
/*
 * 
 * a Book class with attributes such as title and author
 * 
 */
public class Book {

    private String title;
    private String author;

    // Constructor
    public Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    // Getters
    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    // Display book info
    public void displayBook() {
        System.out.println(title + " by " + author);
    }
}

