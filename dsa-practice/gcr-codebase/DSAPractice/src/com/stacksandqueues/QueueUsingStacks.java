package com.stacksandqueues;
import java.util.Stack;

/**
 * Queue implementation using two stacks.
 */
public class QueueUsingStacks {

    private Stack<Integer> stackEnqueue = new Stack<>();
    private Stack<Integer> stackDequeue = new Stack<>();

    /* ================= ENQUEUE ================= */

    /**
     * Adds an element to the queue.
     */
    public void enqueue(int value) {
        stackEnqueue.push(value);
        System.out.println("Enqueued: " + value);
    }

    /* ================= DEQUEUE ================= */

    /**
     * Removes and returns the front element of the queue.
     */
    public int dequeue() {

        // If both stacks are empty
        if (stackEnqueue.isEmpty() && stackDequeue.isEmpty()) {
            throw new RuntimeException(" Queue is empty");
        }

        // Transfer elements only if dequeue stack is empty
        if (stackDequeue.isEmpty()) {
            while (!stackEnqueue.isEmpty()) {
                stackDequeue.push(stackEnqueue.pop());
            }
        }

        return stackDequeue.pop();
    }

    /* ================= DISPLAY ================= */

    /**
     * Displays queue elements 
     */
    public void display() {

        if (stackEnqueue.isEmpty() && stackDequeue.isEmpty()) {
            System.out.println("Queue is empty");
            return;
        }

        System.out.print("Queue: ");

        // Print dequeue stack (top to bottom)
        for (int i = stackDequeue.size() - 1; i >= 0; i--) {
            System.out.print(stackDequeue.get(i) + " ");
        }

        // Print enqueue stack (bottom to top)
        for (int i = 0; i < stackEnqueue.size(); i++) {
            System.out.print(stackEnqueue.get(i) + " ");
        }

        System.out.println();
    }
    
    public static void main(String[] args) {

        QueueUsingStacks queue = new QueueUsingStacks();

        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);

        queue.display();

        System.out.println("Dequeued: " + queue.dequeue());
        queue.display();

        queue.enqueue(40);
        queue.display();

        System.out.println("Dequeued: " + queue.dequeue());
        queue.display();
    }
}

