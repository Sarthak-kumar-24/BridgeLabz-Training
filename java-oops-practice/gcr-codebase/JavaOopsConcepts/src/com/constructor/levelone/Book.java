package com.constructor.levelone;

/**
 * Created a Class named Book that has attributes
 * title, author, and price.
 * Includes both default and parameterized constructors.
 */
public class Book {

    // Instance variables
    private String title;
    private String author;
    private double price;

    /**
     * Default Constructor
     * Initializes the book with default values.
     */
    public Book() {
        this.title = "My Vision";
        this.author = "Sarthak Singh";
        this.price = 0.0;
    }

    /**
     * Parameterized Constructor
     * Initializes the book with given values.
     */
    public Book(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }

    /**
     * Displays book details.
     */
    public void displayBookDetails() {
        System.out.println("Title  : " + title);
        System.out.println("Author : " + author);
        System.out.println("Price  : ₹" + price);
    }

    /**
     * Main method (inside same file)
     */
    public static void main(String[] args) {

        // Creating object using default constructor
        Book book1 = new Book();
        book1.displayBookDetails();

        System.out.println("--------------------------");

        // Creating object using parameterized constructor
        Book book2 = new Book("My Life My Choice", "Robert", 599.99);
        book2.displayBookDetails();
    }
}

