package com.constructor.levelone;

/**
 * Class Name: Book
 * Represents a Book in a library system.
 * Allows borrowing of a book based on availability.
 */
public class BookAvailability {

    // Attributes
    private String title;
    private String author;
    private double price;
    private boolean isAvailable;

    /**
     * Parameterized Constructor
     */
    public BookAvailability(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
        this.isAvailable = true; // Book is available by default
    }

    /**
     * Method to borrow the book.
     * Checks availability before borrowing.
     */
    public void borrowBook() {

        if (isAvailable) {
            isAvailable = false;
            System.out.println("Book borrowed successfully.");
        } else {
            System.out.println("Sorry! This book is currently not available.");
        }
    }

    /**
     * Displays book details.
     */
    public void displayBookDetails() {
        System.out.println("Title        : " + title);
        System.out.println("Author       : " + author);
        System.out.println("Price        : ₹" + price);
        System.out.println("Availability : " + (isAvailable ? "Available" : "Not Available"));
    }


    public static void main(String[] args) {

    	BookAvailability book = new BookAvailability("Clean Code", "Robert C. Martin", 599.99);

        book.displayBookDetails();

        System.out.println("\nBorrowing the book...");
        book.borrowBook();

        System.out.println("\nTrying to borrow again...");
        book.borrowBook();

        System.out.println("\nUpdated Book Status:");
        book.displayBookDetails();
    }
}

