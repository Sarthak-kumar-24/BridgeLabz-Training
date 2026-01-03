package com.linkedlist.doublylinkedlist;

/**
 * Represents a single movie in the doubly linked list.
 */
class MovieNode {

    String title;
    String director;
    int releaseYear;
    double rating;

    MovieNode prev;   // Pointer to previous node
    MovieNode next;   // Pointer to next node

    MovieNode(String title, String director, int releaseYear, double rating) {
        this.title = title;
        this.director = director;
        this.releaseYear = releaseYear;
        this.rating = rating;
        this.prev = null;
        this.next = null;
    }
}
