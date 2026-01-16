package com.queueinterface;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

/*
=========================================================
Program: Reverse a Queue
Purpose:
- Reverse the elements of a queue
- Uses ONLY queue operations: add, remove, isEmpty
- Does NOT use stack or extra data structures
- Uses recursion to reverse the queue
=========================================================
*/
public class ReverseQueue {
	
    // Recursive method to reverse queue
    private static void reverseQueue(Queue<Integer> queue) {
        // Base case: empty queue
        if (queue.isEmpty()) {
            return;
        }

        // Remove front element
        int front = queue.remove();

        // Reverse remaining queue
        reverseQueue(queue);

        // Add removed element back
        queue.add(front);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Queue<Integer> queue = new LinkedList<>();

        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();

        System.out.println("Enter elements:");
        for (int i = 0; i < n; i++) {
            queue.add(sc.nextInt());
        }

        // Reverse the queue
        reverseQueue(queue);

        
        System.out.println("Reversed Queue: " + queue);

        sc.close();
    }

}
