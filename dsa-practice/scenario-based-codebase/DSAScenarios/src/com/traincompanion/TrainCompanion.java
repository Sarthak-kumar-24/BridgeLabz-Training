package com.traincompanion;

import java.util.Scanner;

/*
 *  TrainCompanion – Compartment Navigation System (Doubly Linked List)
 * 
 *  In a long-distance train app, passengers can walk to the next or previous compartment,
 * or search for services (like pantry, WiFi). Each compartment is a node in a Doubly Linked List.
 */
public class TrainCompanion {
	
    private Compartment head, tail, current;

    // Adds compartment at end
    private void addCompartment(int number, String services) {
        Compartment newNode = new Compartment(number, services);

        if (head == null) {
            head = tail = current = newNode;
        } else {
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
        }
        System.out.println(" Compartment added");
    }

    // Removes current compartment
    private void removeCurrent() {
        if (current == null) {
            System.out.println(" No compartment to remove");
            return;
        }

        System.out.println(" Removing Compartment: " + current.number);

        if (current.prev != null)
            current.prev.next = current.next;
        else
            head = current.next;

        if (current.next != null)
            current.next.prev = current.prev;
        else
            tail = current.prev;

        current = (current.next != null) ? current.next : current.prev;
    }

    // Move forward
    private void moveNext() {
        if (current != null && current.next != null) {
            current = current.next;
            showCurrent();
        } else {
            System.out.println(" You are at the last compartment");
        }
    }

    // Move backward
    private void movePrev() {
        if (current != null && current.prev != null) {
            current = current.prev;
            showCurrent();
        } else {
            System.out.println(" You are at the first compartment");
        }
    }

    // Show current + adjacent compartments
    private void showCurrent() {
        System.out.println("\n Current Compartment: " + current.number);
        System.out.println("Services: " + current.services);

        if (current.prev != null)
            System.out.println(" Previous: " + current.prev.number);
        else
            System.out.println(" Previous: None");

        if (current.next != null)
            System.out.println(" Next: " + current.next.number);
        else
            System.out.println(" Next: None");
    }

    // Search service
    private void searchService(String service) {
        Compartment temp = head;
        boolean found = false;

        while (temp != null) {
            if (temp.services.toLowerCase().contains(service.toLowerCase())) {
                System.out.println(" Service found in Compartment " + temp.number);
                found = true;
            }
            temp = temp.next;
        }

        if (!found)
            System.out.println(" Service not available in train");
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        TrainCompanion train = new TrainCompanion();

        while (true) {
            System.out.println("\n======  TRAIN COMPANION MENU ======");
            System.out.println("1. Add Compartment");
            System.out.println("2. Move to Next Compartment");
            System.out.println("3. Move to Previous Compartment");
            System.out.println("4. Show Current & Adjacent Compartments");
            System.out.println("5. Remove Current Compartment");
            System.out.println("6. Search Service");
            System.out.println("7. Exit");
            System.out.print("Enter choice: ");

            int choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("Enter Compartment Number: ");
                    int num = sc.nextInt();
                    sc.nextLine();

                    System.out.print("Enter Services (comma separated): ");
                    String services = sc.nextLine();

                    train.addCompartment(num, services);
                    break;

                case 2:
                    train.moveNext();
                    break;

                case 3:
                    train.movePrev();
                    break;

                case 4:
                    train.showCurrent();
                    break;

                case 5:
                    train.removeCurrent();
                    break;

                case 6:
                    System.out.print("Enter service to search: ");
                    String service = sc.nextLine();
                    train.searchService(service);
                    break;

                case 7:
                    System.out.println(" Exiting Train Companion");
                    sc.close();
                    return;

                default:
                    System.out.println(" Invalid choice");
            }
        }
    }

}
