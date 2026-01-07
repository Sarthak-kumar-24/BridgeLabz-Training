package com.runtimeanalysis;

public class FibonacciBenchmark {

    // ---------- Recursive Fibonacci  ----------
    private static long fibonacciRecursive(int n) {
        if (n <= 1) return n;
        return fibonacciRecursive(n - 1) + fibonacciRecursive(n - 2);
    }

    // ---------- Iterative Fibonacci ----------
    private static long fibonacciIterative(int n) {
        if (n <= 1) return n;
        long a = 0, b = 1;
        for (int i = 2; i <= n; i++) {
            long sum = a + b;
            a = b;
            b = sum;
        }
        return b;
    }

  
    public static void main(String[] args) {

        int[] testValues = {10, 30, 50};

        System.out.println("=== Fibonacci: Recursive vs Iterative Benchmark ===\n");

        for (int n : testValues) {

            System.out.println("Fibonacci N = " + n);

            // Recursive (skip very large N to avoid freeze)
            if (n <= 40) {
                long startRec = System.nanoTime();
                long recResult = fibonacciRecursive(n);
                long endRec = System.nanoTime();

                System.out.printf("Recursive Result : %d%n", recResult);
                System.out.printf("Recursive Time   : %.4f ms%n",
                        (endRec - startRec) / 1_000_000.0);
            } else {
                System.out.println("Recursive Result : Skipped (Too Slow)");
            }

            // Iterative
            long startItr = System.nanoTime();
            long itrResult = fibonacciIterative(n);
            long endItr = System.nanoTime();

            System.out.printf("Iterative Result : %d%n", itrResult);
            System.out.printf("Iterative Time   : %.4f ms%n",
                    (endItr - startItr) / 1_000_000.0);

            System.out.println("-----------------------------------------------");
        }
    }
}

