package com.smartshelf;

import java.util.Scanner;

/* -------------------------------------------
 * 
 * CLass: SmartShelf
 * 
 * Online/real-time sorting by title
 * Then displaying
 * 
 * --------------------------------------------
 */
public class SmartShelf {

	// Insertion Sort to arrange books alphabetically by title
	public static void insertionSort(Book[] books, int n) {
		for (int i = 1; i < n; i++) {
			Book key = books[i];
			int j = i - 1;

			// Shift books that come after key alphabetically
			while (j >= 0 && books[j].title.compareToIgnoreCase(key.title) > 0) {
				books[j + 1] = books[j];
				j--;
			}

			books[j + 1] = key;
		}
	}

	// Displays sorted books
	public static void displayBooks(Book[] books) {
		System.out.println("\nBooks arranged alphabetically by title:\n");
		for (Book b : books) {
			System.out.println("ID: " + b.id + " | Title: " + b.title);
		}
	}

	// Main method
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter number of books to add: ");
		int n = sc.nextInt();
		sc.nextLine(); 

		Book[] books = new Book[n];

		// Taking input from user
		for (int i = 0; i < n; i++) {
			System.out.println("\nEnter details of book " + (i + 1));

			System.out.print("Book ID: ");
			int id = sc.nextInt();
			sc.nextLine();

			System.out.print("Title: ");
			String title = sc.nextLine();

			books[i] = new Book(id, title);

			// Sorts immediately after each insertion( No waitjng for all at once )
			insertionSort(books, i + 1);
		}

		displayBooks(books);

		sc.close();
	}

}
