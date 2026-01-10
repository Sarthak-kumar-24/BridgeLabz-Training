package com.bookshelf;

import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

/*
 * BookShelf – Library Organizer (HashMap + Linked List)
 * 
 * n a library system, books are arranged based on genre and author. 
 * A HashMap maps genre → list of books (LinkedList). 
 * Each list is dynamically updated when books are borrowed or returned.
 * Avoid duplication using HashSet (optional).
 */
public class BookShelf {

	private Map<String, LinkedList<Book>> catalog = new HashMap<>();
	private Set<String> uniqueBooks = new HashSet<>();

	public void addBook(String genre, Book book) {
		if (uniqueBooks.contains(book.getIsbn())) {
			System.out.println("Duplicate book: " + book);
			return;
		}
		if (catalog.containsKey(genre) == false) {
			LinkedList<Book> list = new LinkedList<>();
			list.add(book);
			catalog.put(genre, list);
		} else {
			catalog.get(genre).add(book);
		}
		uniqueBooks.add(book.getIsbn());   // stores to check uniqueness further
		System.out.println("\n Book added successfully!");
	}

	public void removeBook(String genre, String isbn) {
		if (catalog.containsKey(genre) == false) {
			System.out.println("Genre not found");
			return;
		}

		LinkedList<Book> list = catalog.get(genre);

		for (int i = 0; i < list.size(); i++) {
			if (list.get(i).getIsbn().equals(isbn)) {
				list.remove(i);
				System.out.println("Book borrowed");
				return;
			}
		}
		System.out.println("Book not Found!");

	}

	public void display() {
        if (catalog.isEmpty()) {
            System.out.println("\n Library is empty!");
            return;
        }

        System.out.println("\n LIBRARY CATALOG");
        System.out.println("------------------------------");

        for (String genre : catalog.keySet()) {
            System.out.println("\nGenre: " + genre);
            System.out.println("--------------------------------------");

            LinkedList<Book> list = catalog.get(genre);

            for (int i = 0; i < list.size(); i++) {
                Book b = list.get(i);
                System.out.println((i + 1) + ". " + b.getTitle() + " | " + b.getAuthor() + " | ISBN: " + b.getIsbn() );
            }
        }
        System.out.println("---------------------------------------");
    }

	public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        BookShelf shelf = new BookShelf();

        int choice;

        do {
            System.out.println("\n==============================");
            System.out.println(" LIBRARY MANAGEMENT SYSTEM");
            System.out.println("==============================");
            System.out.println("1. Add Book");
            System.out.println("2. Borrow Book");
            System.out.println("3. Display Collection");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");

            choice = sc.nextInt();
            sc.nextLine(); 

            switch (choice) {

                case 1:
                    System.out.print("Enter Genre: ");
                    String genre = sc.nextLine();

                    System.out.print("Enter Book Title: ");
                    String title = sc.nextLine();

                    System.out.print("Enter Author Name: ");
                    String author = sc.nextLine();

                    System.out.print("Enter ISBN: ");
                    String isbn = sc.nextLine();

                    shelf.addBook(genre, new Book(title, author, isbn));
                    break;

                case 2:
                    System.out.print("Enter Genre: ");
                    String g = sc.nextLine().toLowerCase();

                    System.out.print("Enter ISBN to borrow: ");
                    String id = sc.nextLine();

                    shelf.removeBook(g, id);
                    break;

                case 3:
                    shelf.display();
                    break;

                case 4:
                    System.out.println("\n Exiting Library System. Bye!");
                    break;

                default:
                    System.out.println("\n Invalid choice. Try again.");
            }

        } while (choice != 4);

        sc.close();
    }

}
