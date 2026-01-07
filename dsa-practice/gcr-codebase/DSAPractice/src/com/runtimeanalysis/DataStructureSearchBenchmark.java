package com.runtimeanalysis;

import java.util.*;
/*
 * Comparing Different Data Structures for Searching
 * 
 * Compare Array (O(N)), HashSet (O(1)), and TreeSet (O(log N)) for searching elements.
 * 
 */
public class DataStructureSearchBenchmark {

    private static int linearSearch(int[] arr, int target) {
        for (int x : arr) {
            if (x == target) return x;
        }
        return -1;
    }

    private static int[] generateArray(int size) {
        Random random = new Random();
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = random.nextInt(size * 10);
        }
        return arr;
    }

    public static void main(String[] args) {

        int[] sizes = {1_000, 100_000, 1_000_000};
        int target = -1; // worst-case (not present)

        System.out.println("=== Searching Data Structures Benchmark ===\n");

        for (int size : sizes) {

            System.out.println("Dataset Size : " + size);

            int[] array = generateArray(size);

            HashSet<Integer> hashSet = new HashSet<>();
            TreeSet<Integer> treeSet = new TreeSet<>();

            for (int x : array) {
                hashSet.add(x);
                treeSet.add(x);
            }

            // Array Search
            long startArray = System.nanoTime();
            linearSearch(array, target);
            long endArray = System.nanoTime();

            // HashSet Search
            long startHash = System.nanoTime();
            hashSet.contains(target);
            long endHash = System.nanoTime();

            // TreeSet Search
            long startTree = System.nanoTime();
            treeSet.contains(target);
            long endTree = System.nanoTime();

            System.out.printf("Array Search   : %.4f ms%n",
                    (endArray - startArray) / 1_000_000.0);
            System.out.printf("HashSet Search : %.4f ms%n",
                    (endHash - startHash) / 1_000_000.0);
            System.out.printf("TreeSet Search : %.4f ms%n",
                    (endTree - startTree) / 1_000_000.0);

            System.out.println("------------------------------------------");
        }
    }
}

