package com.parceltracker;

import java.util.Scanner;

/* ParcelTracker – Delivery Chain Management (Singly Linked List)
 * 
 * A courier company tracks parcels through stages like Packed → Shipped → In Transit → Delivered. Each stage is a node in a Singly Linked List.
 * 
 * Forward tracking through stages.
 * Add custom intermediate checkpoints.
 * Handle lost/missing parcels (null pointers).
 */
public class ParcelTracker {
	
    private static Stage head = null;

    // Initializes default delivery stages
    private static void initializeStages() {
        addStage("Packed");
        addStage("Shipped");
        addStage("In Transit");
        addStage("Delivered");
    }
    
    
    private static void addStage(String name) {
        Stage newStage = new Stage(name);

        if (head == null) {
            head = newStage;
            return;
        }

        Stage temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = newStage;
    }
    
    // Inserts a stage after a given stage 
    private static void insertAfter(String target, String newStageName) {
        Stage temp = head;

        while (temp != null) {
            if (temp.name.equalsIgnoreCase(target)) {
                Stage newStage = new Stage(newStageName);
                newStage.next = temp.next;
                temp.next = newStage;
                System.out.println(" Checkpoint added");
                return;
            }
            temp = temp.next;
        }
        System.out.println(" Stage not found");
    }
    
    private static void trackParcel() {
        if (head == null) {
            System.out.println(" No tracking data available");
            return;
        }

        System.out.print(" Parcel Status: ");
        Stage temp = head;

        while (temp != null) {
            System.out.print(temp.name + " -> ");
            temp = temp.next;
        }
        System.out.println("END");
    }
    
    private static void handleMissingParcel() {
        if (head == null) {
            System.out.println(" Parcel lost or tracking unavailable");
        } else {
            System.out.println(" Parcel tracking active");
        }
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        initializeStages();

        while (true) {
            System.out.println("\n======  PARCEL TRACKER MENU ======");
            System.out.println("1. Track Parcel");
            System.out.println("2. Add Custom Checkpoint");
            System.out.println("3. Check Parcel Status");
            System.out.println("4. Exit");
            System.out.print("Enter choice: ");

            int choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1:
                    trackParcel();
                    break;

                case 2:
                    System.out.print("Insert after stage: ");
                    String after = sc.nextLine();
                    System.out.print("New checkpoint name: ");
                    String name = sc.nextLine();
                    insertAfter(after, name);
                    break;

                case 3:
                    handleMissingParcel();
                    break;

                case 4:
                    System.out.println(" Exiting Parcel Tracker");
                    sc.close();
                    return;

                default:
                    System.out.println(" Invalid choice");
            }
        }
    }


}
