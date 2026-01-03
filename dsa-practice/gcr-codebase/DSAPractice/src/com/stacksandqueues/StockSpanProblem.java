package com.stacksandqueues;

import java.util.Stack;

/**
 * Solves the Stock Span Problem using Stack.
 */
public class StockSpanProblem {

    public static int[] calculateSpan(int[] prices) {

        int n = prices.length;
        int[] span = new int[n];

        Stack<Integer> stack = new Stack<>(); // stores indices

        // First day
        span[0] = 1;
        stack.push(0);

        // Process remaining days
        for (int i = 1; i < n; i++) {

            // Pop while current price is higher
            while (!stack.isEmpty() &&
                   prices[stack.peek()] <= prices[i]) {
                stack.pop();
            }

            // If stack empty, price is highest so far
            span[i] = stack.isEmpty() ? (i + 1) : (i - stack.peek());

            // Push current index
            stack.push(i);
        }

        return span;
    }

    /* ================= DEMO ================= */

    public static void main(String[] args) {

        int[] prices = {100, 80, 60, 70, 60, 75, 85};

        int[] span = calculateSpan(prices);

        System.out.println("Stock Spans:");
        for (int s : span) {
            System.out.print(s + " ");
        }
    }
}
