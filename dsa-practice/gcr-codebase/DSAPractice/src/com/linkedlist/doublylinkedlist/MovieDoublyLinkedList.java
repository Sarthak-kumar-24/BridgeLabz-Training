package com.linkedlist.doublylinkedlist;

/**
 * Implements a Movie Management System using a Doubly Linked List.
 */
public class MovieDoublyLinkedList {

    private MovieNode head;
    private MovieNode tail;

   
    /**
     * Adds a movie at the beginning of the list.
     */
    public void addAtBeginning(String title, String director, int year, double rating) {
        MovieNode newNode = new MovieNode(title, director, year, rating);

        if (head == null) {
            head = tail = newNode;
            return;
        }

        newNode.next = head;
        head.prev = newNode;
        head = newNode;
    }

    /**
     * Adds a movie at the end of the list.
     */
    public void addAtEnd(String title, String director, int year, double rating) {
        MovieNode newNode = new MovieNode(title, director, year, rating);

        if (tail == null) {
            head = tail = newNode;
            return;
        }

        tail.next = newNode;
        newNode.prev = tail;
        tail = newNode;
    }

    /**
     * Adds a movie at a specific position (1-based index).
     */
    public void addAtPosition(int position, String title, String director, int year, double rating) {

        if (position == 1) {
            addAtBeginning(title, director, year, rating);
            return;
        }

        MovieNode current = head;
        for (int i = 1; i < position - 1 && current != null; i++) {
            current = current.next;
        }

        if (current == null || current.next == null) {
            addAtEnd(title, director, year, rating);
            return;
        }

        MovieNode newNode = new MovieNode(title, director, year, rating);

        newNode.next = current.next;
        newNode.prev = current;
        current.next.prev = newNode;
        current.next = newNode;
    }

    
    /**
     * Removes a movie using its title.
     */
    public void removeByTitle(String title) {
        MovieNode current = head;

        while (current != null) {
            if (current.title.equalsIgnoreCase(title)) {

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

                System.out.println(" Movie removed");
                return;
            }
            current = current.next;
        }

        System.out.println(" Movie not found");
    }

    

    /**
     * Searches movies by director.
     */
    public void searchByDirector(String director) {
        MovieNode current = head;
        boolean found = false;

        while (current != null) {
            if (current.director.equalsIgnoreCase(director)) {
                displayMovie(current);
                found = true;
            }
            current = current.next;
        }

        if (!found) {
            System.out.println(" No movies found for this director");
        }
    }

    /**
     * Searches movies by rating.
     */
    public void searchByRating(double rating) {
        MovieNode current = head;
        boolean found = false;

        while (current != null) {
            if (current.rating == rating) {
                displayMovie(current);
                found = true;
            }
            current = current.next;
        }

        if (!found) {
            System.out.println(" No movies found with this rating");
        }
    }

    
    /**
     * Displays movies in forward direction.
     */
    public void displayForward() {
        MovieNode current = head;

        if (current == null) {
            System.out.println(" No movies available");
            return;
        }

        while (current != null) {
            displayMovie(current);
            current = current.next;
        }
    }

    /**
     * Displays movies in reverse direction.
     */
    public void displayReverse() {
        MovieNode current = tail;

        if (current == null) {
            System.out.println(" No movies available");
            return;
        }

        while (current != null) {
            displayMovie(current);
            current = current.prev;
        }
    }

    

    /**
     * Updates rating using movie title.
     */
    public void updateRating(String title, double newRating) {
        MovieNode current = head;

        while (current != null) {
            if (current.title.equalsIgnoreCase(title)) {
                current.rating = newRating;
                System.out.println(" Rating updated");
                return;
            }
            current = current.next;
        }

        System.out.println(" Movie not found");
    }

    
    private void displayMovie(MovieNode movie) {
        System.out.println(
            "Title: " + movie.title +
            ", Director: " + movie.director +
            ", Year: " + movie.releaseYear +
            ", Rating: " + movie.rating
        );
    }

    

    public static void main(String[] args) {

        MovieDoublyLinkedList movies = new MovieDoublyLinkedList();

        movies.addAtEnd("Inception", "Christopher Nolan", 2010, 8.8);
        movies.addAtEnd("Interstellar", "Christopher Nolan", 2014, 8.6);
        movies.addAtBeginning("Titanic", "James Cameron", 1997, 7.8);

        System.out.println(" Forward Display:");
        movies.displayForward();

        System.out.println("\n Reverse Display:");
        movies.displayReverse();

        movies.searchByDirector("Christopher Nolan");
        movies.updateRating("Titanic", 8.0);

        movies.removeByTitle("Inception");

        System.out.println("\n After Removal:");
        movies.displayForward();
    }
}
