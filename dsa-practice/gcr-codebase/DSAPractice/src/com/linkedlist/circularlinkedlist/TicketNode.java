package com.linkedlist.circularlinkedlist;

/**
 * Represents a single ticket reservation in the circular linked list.
 */
public class TicketNode {

    int ticketId;
    String customerName;
    String movieName;
    String seatNumber;
    String bookingTime;

    TicketNode next;   // Circular link

    TicketNode(int ticketId, String customerName,
               String movieName, String seatNumber,
               String bookingTime) {

        this.ticketId = ticketId;
        this.customerName = customerName;
        this.movieName = movieName;
        this.seatNumber = seatNumber;
        this.bookingTime = bookingTime;
        this.next = null;
    }
}

