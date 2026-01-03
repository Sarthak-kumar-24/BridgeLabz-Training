package com.linkedlist.doublylinkedlist;

/**
 * Library Management System implemented using a Doubly Linked List.
 */
public class LibraryDoublyLinkedList {

    private BookNode head;
    private BookNode tail;

    
    /**
     * Adds a book at the beginning of the library.
     */
    public void addAtBeginning(int id, String title, String author,
                               String genre, boolean isAvailable) {

        BookNode newBook = new BookNode(id, title, author, genre, isAvailable);

        if (head == null) {
            head = tail = newBook;
            return;
        }

        newBook.next = head;
        head.prev = newBook;
        head = newBook;
    }

    /**
     * Adds a book at the end of the library.
     */
    public void addAtEnd(int id, String title, String author, String genre, boolean isAvailable) {

        BookNode newBook = new BookNode(id, title, author, genre, isAvailable);

        if (tail == null) {
            head = tail = newBook;
            return;
        }

        tail.next = newBook;
        newBook.prev = tail;
        tail = newBook;
    }

    /**
     * Adds a book at a specific position (1-based index).
     */
    public void addAtPosition(int position, int id, String title, String author, String genre, boolean isAvailable) {

        if (position == 1) {
            addAtBeginning(id, title, author, genre, isAvailable);
            return;
        }

        BookNode current = head;
        for (int i = 1; i < position - 1 && current != null; i++) {
            current = current.next;
        }

        if (current == null || current.next == null) {
            addAtEnd(id, title, author, genre, isAvailable);
            return;
        }

        BookNode newBook = new BookNode(id, title, author, genre, isAvailable);

        newBook.next = current.next;
        newBook.prev = current;
        current.next.prev = newBook;
        current.next = newBook;
    }

    

    /**
     * Removes a book using Book ID.
     */
    public void removeByBookId(int bookId) {
        BookNode current = head;

        while (current != null) {
            if (current.bookId == bookId) {

                if (current == head) {
                    head = head.next;
                    if (head != null) head.prev = null;
                }
                else if (current == tail) {
                    tail = tail.prev;
                    tail.next = null;
                }
                else {
                    current.prev.next = current.next;
                    current.next.prev = current.prev;
                }

                System.out.println(" Book removed");
                return;
            }
            current = current.next;
        }

        System.out.println(" Book not found");
    }

   

    /**
     * Searches books by title.
     */
    public void searchByTitle(String title) {
        BookNode current = head;
        boolean found = false;

        while (current != null) {
            if (current.title.equalsIgnoreCase(title)) {
                displayBook(current);
                found = true;
            }
            current = current.next;
        }

        if (!found) {
            System.out.println(" No book found with this title");
        }
    }

    /**
     * Searches books by author.
     */
    public void searchByAuthor(String author) {
        BookNode current = head;
        boolean found = false;

        while (current != null) {
            if (current.author.equalsIgnoreCase(author)) {
                displayBook(current);
                found = true;
            }
            current = current.next;
        }

        if (!found) {
            System.out.println(" No books found by this author");
        }
    }

    

    /**
     * Updates availability status using Book ID.
     */
    public void updateAvailability(int bookId, boolean status) {
        BookNode current = head;

        while (current != null) {
            if (current.bookId == bookId) {
                current.isAvailable = status;
                System.out.println(" Availability status updated");
                return;
            }
            current = current.next;
        }

        System.out.println(" Book not found");
    }

    
    /**
     * Displays books in forward order.
     */
    public void displayForward() {
        if (head == null) {
            System.out.println(" Library is empty");
            return;
        }

        BookNode current = head;
        while (current != null) {
            displayBook(current);
            current = current.next;
        }
    }

    /**
     * Displays books in reverse order.
     */
    public void displayReverse() {
        if (tail == null) {
            System.out.println(" Library is empty");
            return;
        }

        BookNode current = tail;
        while (current != null) {
            displayBook(current);
            current = current.prev;
        }
    }

  
    /**
     * Counts total number of books in the library.
     */
    public int countBooks() {
        int count = 0;
        BookNode current = head;

        while (current != null) {
            count++;
            current = current.next;
        }
        return count;
    }

  

    private void displayBook(BookNode book) {
        System.out.println(
            "ID: " + book.bookId +
            ", Title: " + book.title +
            ", Author: " + book.author +
            ", Genre: " + book.genre +
            ", Available: " + (book.isAvailable ? "Yes" : "No")
        );
    }

    

    public static void main(String[] args) {

        LibraryDoublyLinkedList library = new LibraryDoublyLinkedList();

        library.addAtEnd(101, "1984", "George Orwell", "Dystopian", true);
        library.addAtEnd(102, "The Hobbit", "J.R.R. Tolkien", "Fantasy", true);
        library.addAtBeginning(103, "Clean Code", "Robert Martin", "Programming", false);

        System.out.println(" Library (Forward):");
        library.displayForward();

        System.out.println("\n Library (Reverse):");
        library.displayReverse();

        library.searchByAuthor("George Orwell");
        library.updateAvailability(103, true);

        library.removeByBookId(102);

        System.out.println("\n After Removal:");
        library.displayForward();

        System.out.println("\nTotal books: " + library.countBooks());
    }
}

