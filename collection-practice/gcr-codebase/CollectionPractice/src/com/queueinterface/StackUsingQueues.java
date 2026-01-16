package com.queueinterface;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

/*
=========================================================
Program: Implement a Stack Using Queues
Purpose:
- Implement stack operations using TWO queues
- Supports push, pop, and top operations
- Maintains LIFO behavior
=========================================================
*/
public class StackUsingQueues {
	
    private static Queue<Integer> q1 = new LinkedList<>();
    private static Queue<Integer> q2 = new LinkedList<>();

    // Push element onto stack
    private static void push(int x) {
        // Step 1: Add element to empty q2
        q2.add(x);

        // Step 2: Move all elements from q1 to q2
        while (!q1.isEmpty()) {
            q2.add(q1.remove());
        }

        // Step 3: Swap q1 and q2
        Queue<Integer> temp = q1;
        q1 = q2;
        q2 = temp;

        System.out.println(" Pushed: " + x);
    }

    // Pop element from stack
    private static void pop() {
        if (q1.isEmpty()) {
            System.out.println(" Stack is empty");
            return;
        }
        System.out.println(" Popped: " + q1.remove());
    }

    // Get top element of stack
    private static void top() {
        if (q1.isEmpty()) {
            System.out.println(" Stack is empty");
            return;
        }
        System.out.println(" Top element: " + q1.peek());
    }

    // Display stack (top to bottom)
    private static void display() {
        if (q1.isEmpty()) {
            System.out.println("Stack is empty");
            return;
        }
        System.out.println(" Stack (Top → Bottom): " + q1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("\n======  STACK USING QUEUES MENU ======");
            System.out.println("1. Push");
            System.out.println("2. Pop");
            System.out.println("3. Top");
            System.out.println("4. Display Stack");
            System.out.println("5. Exit");
            System.out.print("Enter choice: ");

            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter element to push: ");
                    int x = sc.nextInt();
                    push(x);
                    break;

                case 2:
                    pop();
                    break;

                case 3:
                    top();
                    break;

                case 4:
                    display();
                    break;

                case 5:
                    System.out.println(" Exiting program");
                    sc.close();
                    return;

                default:
                    System.out.println(" Invalid choice");
            }
        }
    }

}
