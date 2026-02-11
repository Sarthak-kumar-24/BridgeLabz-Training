package com.jdbc.librarymanagementsystem;

import java.util.Scanner;

/*
 * Main application class
 */
public class LibraryApp {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        LibraryDAO dao = new LibraryDAO();

        while (true) {

            System.out.println("\n--- Library Management System ---");
            System.out.println("1. Add Book");
            System.out.println("2. Borrow Book");
            System.out.println("3. Return Book");
            System.out.println("4. Search Books");
            System.out.println("5. Exit");
            System.out.print("Choose option: ");

            int choice = sc.nextInt();

            switch (choice) {

                case 1:
                    sc.nextLine();
                    System.out.print("Title: ");
                    String title = sc.nextLine();

                    System.out.print("Author: ");
                    String author = sc.nextLine();

                    System.out.print("Category: ");
                    String category = sc.nextLine();

                    System.out.print("Copies: ");
                    int copies = sc.nextInt();

                    dao.addBook(title, author, category, copies);
                    break;

                case 2:
                    System.out.print("Student ID: ");
                    int sid = sc.nextInt();

                    System.out.print("Book ID: ");
                    int bid = sc.nextInt();

                    dao.borrowBook(sid, bid);
                    break;

                case 3:
                    System.out.print("Borrow ID: ");
                    int borrowId = sc.nextInt();

                    dao.returnBook(borrowId);
                    break;

                case 4:
                    sc.nextLine();
                    System.out.print("Title filter: ");
                    String t = sc.nextLine();

                    System.out.print("Author filter: ");
                    String a = sc.nextLine();

                    System.out.print("Category filter: ");
                    String c = sc.nextLine();

                    dao.searchBooks(t, a, c);
                    break;

                case 5:
                    System.out.println("Exiting system...");
                    sc.close();
                    System.exit(0);

                default:
                    System.out.println("Invalid option!");
            }
        }
    }
}
