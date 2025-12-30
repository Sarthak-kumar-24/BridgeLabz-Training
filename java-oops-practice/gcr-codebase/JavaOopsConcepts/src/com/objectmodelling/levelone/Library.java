package com.objectmodelling.levelone;
import java.util.ArrayList;

/*
 * a Library class with an ArrayList of Book objects.
 * 
 */

public class Library {
	
    private String libraryName;
    private ArrayList<Book> books;

	
	
    public Library(String libraryName) {
        this.libraryName = libraryName;
        this.books = new ArrayList<>();
    }
    
    public void addBook( Book book) {
    	books.add(book);
    }
    
    public void displayBooks() {
    	System.out.println("\n Books in "+ libraryName + ":");
    	
    	for( Book book : books) {
    		book.displayBook();
    	}
    }
    public static void main(String[] args) {

        // Independent Book objects
        Book book1 = new Book("Clean Code", "RRR.");
        Book book2 = new Book("Effective Java", "SSS");
        Book book3 = new Book("Design Patterns", "GoF");

        // Two different libraries
        Library centralLibrary = new Library("Central Library");
        Library collegeLibrary = new Library("College Library");

        // Same books added to different libraries
        centralLibrary.addBook(book1);
        centralLibrary.addBook(book2);

        collegeLibrary.addBook(book2); // same book, different library
        collegeLibrary.addBook(book3);

        // Display
        centralLibrary.displayBooks();
        collegeLibrary.displayBooks();
    }

}
