package com.constructor.levelone;

/**
 * Sub-Class Name: EBook
 * Subclass of BookInLibrarySystem that demonstrates access to public and protected members.
 */

public class EBook extends BookInLibrarySystem {

    private double fileSizeMB;

    /**
     * Parameterized constructor
     */
    public EBook(String ISBN, String title, String author, double fileSizeMB) {
        super(ISBN, title, author);
        this.fileSizeMB = fileSizeMB;
    }

    /**
     * Displays ebook details
     * Demonstrates access to ISBN (public) and title (protected)
     */
    public void displayEBookDetails() {
        System.out.println("ISBN       : " + ISBN);     // public
        System.out.println("Title      : " + title);    // protected
        System.out.println("Author     : " + getAuthor()); // private via getter
        System.out.println("File Size  : " + fileSizeMB + " MB");
        System.out.println("----------------------------------");
    }
    public static void main(String[] args) {

        // Creating Book object
    	BookInLibrarySystem book = new BookInLibrarySystem("978-0134685991", "Effective Java", "Joshua Bloch");
    	book.displayBookDetails();

        System.out.println("----------------------------------");

        // Updating author using setter
        book.setAuthor("J. Bloch");
        System.out.println("Updated Author: " + book.getAuthor());

        System.out.println("----------------------------------");

        // Creating EBook object
        EBook ebook = new EBook(
                "978-1492078005",
                "Java Concurrency in Practice",
                "Brian Goetz", 5.8
        );

        ebook.displayEBookDetails();
    }
}
