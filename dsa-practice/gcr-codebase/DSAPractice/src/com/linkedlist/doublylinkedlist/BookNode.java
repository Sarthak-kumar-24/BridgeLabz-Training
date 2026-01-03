package com.linkedlist.doublylinkedlist;

/**
 * Represents a single book in the library.
 * Each book is a node in a doubly linked list.
 */
class BookNode {

    int bookId;
    String title;
    String author;
    String genre;
    boolean isAvailable;

    BookNode prev;   // Pointer to previous book
    BookNode next;   // Pointer to next book

    BookNode(int bookId, String title, String author, String genre, boolean isAvailable) {
        this.bookId = bookId;
        this.title = title;
        this.author = author;
        this.genre = genre;
        this.isAvailable = isAvailable;
        this.prev = null;
        this.next = null;
    }
}

