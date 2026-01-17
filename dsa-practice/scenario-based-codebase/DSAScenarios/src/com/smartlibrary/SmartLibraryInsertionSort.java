package com.smartlibrary;

import java.util.Scanner;

public class SmartLibraryInsertionSort {
	
    /*
     * Insertion Sort to keep books alphabetically sorted
     */
    public static void insertionSort(Book[] books, int n) {

        for (int i = 1; i < n; i++) {

            Book key = books[i];
            int j = i - 1;

            // Shift books that come after key alphabetically
            while (j >= 0 && books[j].title.compareToIgnoreCase(key.title) > 0) {
                books[j + 1] = books[j];
                j--;
            }

            // Insert book at correct position
            books[j + 1] = key;
        }
    }

    /*
     * Display borrowed books list
     */
    public static void displayBooks(Book[] books, int n) {

        System.out.println("----------------------------");
        System.out.println("Borrowed Books (Sorted)");
        System.out.println("----------------------------");

        for (int i = 0; i < n; i++) {
            System.out.println((i + 1) + ". " + books[i].title);
        }
    }

    /*
     * Main method – execution starts here
     */
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println(" SmartLibrary – Borrowed Books Manager");
        System.out.println("--------------------------------------");

        System.out.print("Enter number of borrowed books: ");
        int n = sc.nextInt();
        sc.nextLine(); // consume newline

        Book[] books = new Book[n];

        // User input
        for (int i = 0; i < n; i++) {
            System.out.print("Enter book title " + (i + 1) + ": ");
            String title = sc.nextLine();
            books[i] = new Book(title);
        }

        // Sort using Insertion Sort
        insertionSort(books, n);

        // Display sorted list
        System.out.println();
        displayBooks(books, n);

        sc.close();
    }

}
