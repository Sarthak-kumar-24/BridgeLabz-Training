package com.designing.smartuniversitylibrarymanagementsystem;

import java.util.Arrays;

import com.designing.smartuniversitylibrarymanagementsystem.book.Book;
import com.designing.smartuniversitylibrarymanagementsystem.catalog.LibraryCatalog;
import com.designing.smartuniversitylibrarymanagementsystem.observer.User;
import com.designing.smartuniversitylibrarymanagementsystem.observer.UserFactory;

public class Main {

	public static void main(String[] args) {

		// Singleton catalog
		LibraryCatalog catalog = LibraryCatalog.getInstance();

		// Factory-created users
		User student = UserFactory.createUser("student", "Aman");
		User faculty = UserFactory.createUser("faculty", "Dr. Sharma");

		// Users subscribe for notifications
		catalog.registerObserver(student);
		catalog.registerObserver(faculty);

		// Build a complex book using Builder
		Book book = new Book.BookBuilder("Data Structures by Cormen")
				.authors(Arrays.asList("Cormen", "Leiserson"))
				.edition("3rd")
				.genre("Computer Science")
				.publisher("MIT Press")
				.build();

		// Add book to catalog → triggers notifications
		catalog.addBook(book);
	}
}
