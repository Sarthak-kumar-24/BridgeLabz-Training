package com.inheritance.singleinheritance.librarymanagementwithbooksandauthors;

/*
 * Library Management with Books and Authors
 * 
 * Description: Model a Book system where Book is the superclass, and Author is a subclass.
 * 
 * Define a superclass Book with attributes like title and publicationYear.
 * Define a subclass Author with additional attributes like name and bio.
 * Create a method displayInfo() to show details of the book and its author.
 */
public class Book {

    private String title;
    private int publicationYear;

    public Book(String title, int publicationYear) {
        this.title = title;
        this.publicationYear = publicationYear;
    }

    // Getters
    public String getTitle() {
        return title;
    }

    public int getPublicationYear() {
        return publicationYear;
    }

    public void displayInfo() {
        System.out.println("Title: " + title);
        System.out.println("Publication Year: " + publicationYear);
    }
    public static void main(String[] args) {

        Book book = new Author(
                "Clean Code",
                 2008,
                "Sarthak kr",
                "Software engineer and author"
        );

        book.displayInfo();
    }

}
