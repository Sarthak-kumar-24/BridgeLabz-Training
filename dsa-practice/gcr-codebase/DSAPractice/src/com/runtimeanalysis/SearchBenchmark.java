package com.runtimeanalysis;

import java.util.Arrays;
import java.util.Random;

public class SearchBenchmark {

    // ---------- Linear Search ----------
    private static int linearSearch(int[] data, int target) {
        for (int i = 0; i < data.length; i++) {
            if (data[i] == target) {
                return i;
            }
        }
        return -1;
    }

    // ----------  Binary Search ----------
    private static int binarySearch(int[] sortedData, int target) {
        return Arrays.binarySearch(sortedData, target);
    }

    // ----------  Dataset Generator ----------
    private static int[] generateDataset(int size) {
        Random random = new Random();
        int[] data = new int[size];

        for (int i = 0; i < size; i++) {
            data[i] = random.nextInt(size * 10);
        }
        return data;
    }


    public static void main(String[] args) {

        int[] datasetSizes = {1_000, 10_000, 1_000_000};
        int target = -1; // worst case (not present)

        System.out.println("=== Search Performance Benchmark ===\n");

        for (int size : datasetSizes) {

            int[] data = generateDataset(size);

            // ----- Linear Search -----
            long startLinear = System.nanoTime();
            linearSearch(data, target);
            long endLinear = System.nanoTime();

            long linearTime = endLinear - startLinear;

            // ----- Sorting -----
            long startSort = System.nanoTime();
            Arrays.sort(data);
            long endSort = System.nanoTime();

            long sortTime = endSort - startSort;

            // ----- Binary Search -----
            long startBinary = System.nanoTime();
            binarySearch(data, target);
            long endBinary = System.nanoTime();

            long binaryTime = endBinary - startBinary;

            // ----- Output -----
            System.out.println("Dataset Size       : " + size);
            System.out.printf("Linear Search Time : %.4f ms%n", linearTime / 1_000_000.0);
            System.out.printf("Sorting Time       : %.4f ms%n", sortTime / 1_000_000.0);
            System.out.printf("Binary Search Time : %.4f ms%n", binaryTime / 1_000_000.0);
            System.out.printf("Total Binary Cost  : %.4f ms%n",
                    (sortTime + binaryTime) / 1_000_000.0);
            System.out.println("-----------------------------------");
        }
    }
}

