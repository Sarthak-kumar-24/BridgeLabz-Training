package com.linkedlist.circularlinkedlist;

/**
 * Online Ticket Reservation System
 * implemented using a Circular Linked List.
 */
public class TicketReservationSystem {

    private TicketNode head;

    

    /**
     * Adds a new ticket at the end of the circular list.
     */
    public void addTicket(int id, String customer, String movie,
                          String seat, String time) {

        TicketNode newTicket =
                new TicketNode(id, customer, movie, seat, time);

        if (head == null) {
            head = newTicket;
            newTicket.next = newTicket;
            return;
        }

        TicketNode tail = head;
        while (tail.next != head) {
            tail = tail.next;
        }

        tail.next = newTicket;
        newTicket.next = head;
    }

    

    /**
     * Removes a ticket using Ticket ID.
     */
    public void removeTicketById(int ticketId) {

        if (head == null) {
            System.out.println("❌ No tickets booked");
            return;
        }

        TicketNode current = head;
        TicketNode prev = null;

        do {
            if (current.ticketId == ticketId) {

                // Only one ticket
                if (current == head && current.next == head) {
                    head = null;
                }
                // Removing head
                else if (current == head) {
                    TicketNode tail = head;
                    while (tail.next != head) {
                        tail = tail.next;
                    }
                    head = head.next;
                    tail.next = head;
                }
                // Removing middle / last
                else {
                    prev.next = current.next;
                }

                System.out.println(" Ticket removed");
                return;
            }

            prev = current;
            current = current.next;

        } while (current != head);

        System.out.println(" Ticket not found");
    }

    
    /**
     * Displays all booked tickets.
     */
    public void displayTickets() {

        if (head == null) {
            System.out.println(" No tickets booked");
            return;
        }

        TicketNode temp = head;
        do {
            System.out.println(
                "Ticket ID: " + temp.ticketId +
                ", Customer: " + temp.customerName +
                ", Movie: " + temp.movieName +
                ", Seat: " + temp.seatNumber +
                ", Time: " + temp.bookingTime
            );
            temp = temp.next;
        } while (temp != head);
    }

    
    /**
     * Searches tickets by customer name.
     */
    public void searchByCustomerName(String name) {

        if (head == null) {
            System.out.println("⚠️ No tickets booked");
            return;
        }

        TicketNode temp = head;
        boolean found = false;

        do {
            if (temp.customerName.equalsIgnoreCase(name)) {
                displayTicket(temp);
                found = true;
            }
            temp = temp.next;
        } while (temp != head);

        if (!found) {
            System.out.println(" No tickets found for customer " + name);
        }
    }

    /**
     * Searches tickets by movie name.
     */
    public void searchByMovieName(String movie) {

        if (head == null) {
            System.out.println("⚠️ No tickets booked");
            return;
        }

        TicketNode temp = head;
        boolean found = false;

        do {
            if (temp.movieName.equalsIgnoreCase(movie)) {
                displayTicket(temp);
                found = true;
            }
            temp = temp.next;
        } while (temp != head);

        if (!found) {
            System.out.println(" No tickets found for movie " + movie);
        }
    }

    
    /**
     * Counts total booked tickets.
     */
    public int countTotalTickets() {

        if (head == null) return 0;

        int count = 0;
        TicketNode temp = head;

        do {
            count++;
            temp = temp.next;
        } while (temp != head);

        return count;
    }

    

    private void displayTicket(TicketNode ticket) {
        System.out.println(
            "Ticket ID: " + ticket.ticketId +
            ", Customer: " + ticket.customerName +
            ", Movie: " + ticket.movieName +
            ", Seat: " + ticket.seatNumber +
            ", Time: " + ticket.bookingTime
        );
    }

    

    public static void main(String[] args) {

        TicketReservationSystem system =
                new TicketReservationSystem();

        system.addTicket(101, "Aman", "Inception", "A1", "10:00 AM");
        system.addTicket(102, "Neha", "Inception", "A2", "10:00 AM");
        system.addTicket(103, "Ravi", "Interstellar", "B5", "01:00 PM");

        System.out.println(" All Tickets:");
        system.displayTickets();

        System.out.println("\n Search by Customer:");
        system.searchByCustomerName("Aman");

        System.out.println("\n Search by Movie:");
        system.searchByMovieName("Inception");

        system.removeTicketById(102);

        System.out.println("\n After Cancellation:");
        system.displayTickets();

        System.out.println("\nTotal Booked Tickets: " +
                system.countTotalTickets());
    }
}

