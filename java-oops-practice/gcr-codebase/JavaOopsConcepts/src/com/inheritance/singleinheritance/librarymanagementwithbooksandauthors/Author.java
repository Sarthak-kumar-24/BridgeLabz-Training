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
public class Author extends Book {

    private String name;
    private String bio;

    public Author(String title, int publicationYear, String name, String bio) {
        super(title, publicationYear);
        this.name = name;
        this.bio = bio;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Author Name: " + name);
        System.out.println("Author Bio: " + bio);
    }


}
