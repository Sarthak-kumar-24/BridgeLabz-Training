package com.stacksandqueues;
import java.util.Stack;

/**
 * Sorts a stack using recursion only.
 */
public class SortStackUsingRecursion {

    /* ================= SORT STACK ================= */

    public static void sortStack(Stack<Integer> stack) {

        // Base case: empty stack
        if (stack.isEmpty()) {
            return;
        }

        // Remove top element
        int top = stack.pop();

        // Sort remaining stack
        sortStack(stack);

        // Insert top element at correct position
        insertInSortedOrder(stack, top);
    }

    /* ================= INSERT IN SORTED ORDER ================= */

    private static void insertInSortedOrder(Stack<Integer> stack, int element) {

        // correct position found
        if (stack.isEmpty() || stack.peek() <= element) {
            stack.push(element);
            return;
        }

        // Remove top and recurse
        int top = stack.pop();
        insertInSortedOrder(stack, element);

        // Put back removed element
        stack.push(top);
    }


    public static void main(String[] args) {

        Stack<Integer> stack = new Stack<>();

        stack.push(30);
        stack.push(10);
        stack.push(50);
        stack.push(20);

        System.out.println("Original Stack: " + stack);

        sortStack(stack);

        System.out.println("Sorted Stack: " + stack);
    }
}
