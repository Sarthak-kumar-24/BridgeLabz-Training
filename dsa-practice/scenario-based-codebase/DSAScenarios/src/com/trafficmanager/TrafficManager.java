package com.trafficmanager;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

/*
 *  TrafficManager – Roundabout Vehicle Flow (Circular Linked List +Queue)
 * 
 * A smart city roundabout allows vehicles to enter and exit dynamically.
 * Each vehicle is a node in a Circular Linked List. A Queue manages vehicles waiting to enter.
 */
public class TrafficManager {
	
    private Vehicle head = null;
    private Queue<String> waitingQueue = new LinkedList<>();
    private final int MAX_CAPACITY = 5; 

    // Counts vehicles in roundabout
    private int countVehicles() {
        if (head == null) return 0;

        int count = 1;
        Vehicle temp = head.next;

        while (temp != head) {
            count++;
            temp = temp.next;
        }
        return count;
    }

    // Adds vehicle to waiting queue
    private void addToQueue(String number) {
        waitingQueue.offer(number);
        System.out.println(" Vehicle added to waiting queue");
    }

    // Move vehicle from queue to roundabout
    private void enterRoundabout() {
        if (waitingQueue.isEmpty()) {
            System.out.println(" No vehicles waiting");
            return;
        }

        if (countVehicles() >= MAX_CAPACITY) {
            System.out.println(" Roundabout full, cannot add vehicle");
            return;
        }

        String num = waitingQueue.poll();
        Vehicle newVehicle = new Vehicle(num);

        if (head == null) {
            head = newVehicle;
            newVehicle.next = head;
        } else {
            Vehicle temp = head;
            while (temp.next != head)
                temp = temp.next;

            temp.next = newVehicle;
            newVehicle.next = head;
        }

        System.out.println(" Vehicle entered roundabout: " + num);
    }

    // Removes vehicle from roundabout
    private void exitRoundabout(String number) {
        if (head == null) {
            System.out.println(" Roundabout is empty");
            return;
        }

        Vehicle curr = head, prev = null;

        do {
            if (curr.number.equals(number)) {

                if (prev != null)
                    prev.next = curr.next;
                else {
                    Vehicle temp = head;
                    while (temp.next != head)
                        temp = temp.next;

                    if (temp == head) {
                        head = null;
                    } else {
                        temp.next = head.next;
                        head = head.next;
                    }
                }

                System.out.println(" Vehicle exited: " + number);
                return;
            }

            prev = curr;
            curr = curr.next;

        } while (curr != head);

        System.out.println(" Vehicle not found in roundabout");
    }

    // Print roundabout state
    private void printRoundabout() {
        if (head == null) {
            System.out.println(" Roundabout is empty");
            return;
        }

        System.out.print(" Roundabout State: ");
        Vehicle temp = head;

        do {
            System.out.print(temp.number + " -> ");
            temp = temp.next;
        } while (temp != head);

        System.out.println("(back to start)");
    }

    // Print waiting queue
    private void printQueue() {
        System.out.println(" Waiting Queue: " + waitingQueue);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        TrafficManager tm = new TrafficManager();

        while (true) {
            System.out.println("\n======  TRAFFIC MANAGER MENU ======");
            System.out.println("1. Add Vehicle to Waiting Queue");
            System.out.println("2. Allow Vehicle into Roundabout");
            System.out.println("3. Remove Vehicle from Roundabout");
            System.out.println("4. Show Roundabout State");
            System.out.println("5. Show Waiting Queue");
            System.out.println("6. Exit");
            System.out.print("Enter choice: ");

            int choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {

                case 1:
                    System.out.print("Enter Vehicle Number: ");
                    String num = sc.nextLine();
                    tm.addToQueue(num);
                    break;

                case 2:
                    tm.enterRoundabout();
                    break;

                case 3:
                    System.out.print("Enter Vehicle Number to Exit: ");
                    String exitNum = sc.nextLine();
                    tm.exitRoundabout(exitNum);
                    break;

                case 4:
                    tm.printRoundabout();
                    break;

                case 5:
                    tm.printQueue();
                    break;

                case 6:
                    System.out.println(" Traffic system closed");
                    sc.close();
                    return;

                default:
                    System.out.println(" Invalid choice");
            }
        }
    }

}
