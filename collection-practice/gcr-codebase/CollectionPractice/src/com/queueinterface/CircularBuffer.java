package com.queueinterface;

import java.util.Scanner;

/*
=========================================================
Program: Circular Buffer Simulation
Purpose:
- Implement a fixed-size circular buffer using array
- Acts like a queue with overwrite behavior
- When buffer is full, oldest element is overwritten
=========================================================
*/
public class CircularBuffer {
	
	   private static int[] buffer;
	    private static int capacity;
	    private static int front = 0;
	    private static int rear = 0;
	    private static int size = 0;

	    // Initialize circular buffer
	    private static void initBuffer(int cap) {
	        capacity = cap;
	        buffer = new int[capacity];
	        front = 0;
	        rear = 0;
	        size = 0;
	    }

	    // Insert element (overwrite if full)
	    private static void insert(int value) {
	        buffer[rear] = value;
	        rear = (rear + 1) % capacity;

	        if (size < capacity) {
	            size++;
	        } else {
	            // overwrite oldest → move front
	            front = (front + 1) % capacity;
	        }

	        System.out.println(" Inserted: " + value);
	    }

	    // Display buffer content from oldest to newest
	    private static void display() {
	        if (size == 0) {
	            System.out.println(" Buffer is empty");
	            return;
	        }

	        System.out.print(" Buffer State: ");
	        int index = front;
	        for (int i = 0; i < size; i++) {
	            System.out.print(buffer[index] + " ");
	            index = (index + 1) % capacity;
	        }
	        System.out.println();
	    }

	    // Program entry point
	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);

	        System.out.print("Enter buffer size: ");
	        int cap = sc.nextInt();
	        initBuffer(cap);

	        while (true) {
	            System.out.println("\n======  CIRCULAR BUFFER MENU ======");
	            System.out.println("1. Insert Element");
	            System.out.println("2. Display Buffer");
	            System.out.println("3. Exit");
	            System.out.print("Enter choice: ");

	            int choice = sc.nextInt();

	            switch (choice) {
	                case 1:
	                    System.out.print("Enter value to insert: ");
	                    int val = sc.nextInt();
	                    insert(val);
	                    break;

	                case 2:
	                    display();
	                    break;

	                case 3:
	                    System.out.println(" Exiting Circular Buffer");
	                    sc.close();
	                    return;

	                default:
	                    System.out.println(" Invalid choice");
	            }
	        }
	    }

}
