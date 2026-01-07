package com.runtimeanalysis;

import java.util.Arrays;
import java.util.Random;

/*
 * Sorting Large Data Efficiently
 * 
 * Compare sorting algorithms Bubble Sort (O(N²)), Merge Sort (O(N log N)), and Quick Sort (O(N log N)).
 * 
 */
public class SortingBenchmark {

    // ---------- Bubble Sort ----------
    private static void bubbleSort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            boolean swapped = false;
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swapped = true;
                }
            }
            if (!swapped) break;
        }
    }

    // ---------- Merge Sort ----------
    private static void mergeSort(int[] arr) {
        if (arr.length <= 1) return;
        int mid = arr.length / 2;

        int[] left = Arrays.copyOfRange(arr, 0, mid);
        int[] right = Arrays.copyOfRange(arr, mid, arr.length);

        mergeSort(left);
        mergeSort(right);

        merge(arr, left, right);
    }

    private static void merge(int[] arr, int[] left, int[] right) {
        int i = 0, j = 0, k = 0;

        while (i < left.length && j < right.length) {
            arr[k++] = (left[i] <= right[j]) ? left[i++] : right[j++];
        }
        while (i < left.length) arr[k++] = left[i++];
        while (j < right.length) arr[k++] = right[j++];
    }

    // ---------- Quick Sort ----------
    private static void quickSort(int[] arr, int low, int high) {
        if (low < high) {
            int p = partition(arr, low, high);
            quickSort(arr, low, p - 1);
            quickSort(arr, p + 1, high);
        }
    }

    private static int partition(int[] arr, int low, int high) {
        int pivot = arr[high];
        int i = low - 1;

        for (int j = low; j < high; j++) {
            if (arr[j] < pivot) {
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        int temp = arr[i + 1];
        arr[i + 1] = arr[high];
        arr[high] = temp;

        return i + 1;
    }

    // ---------- Dataset Generator ----------
    private static int[] generateData(int size) {
        Random random = new Random();
        int[] data = new int[size];
        for (int i = 0; i < size; i++) {
            data[i] = random.nextInt(size * 10);
        }
        return data;
    }
    
 
    public static void main(String[] args) {

        int[] sizes = {1_000, 10_000, 1_000_000};

        System.out.println("=== Sorting Performance Benchmark ===\n");

        for (int size : sizes) {

            System.out.println("Dataset Size : " + size);

            int[] data1 = generateData(size);
            int[] data2 = data1.clone();
            int[] data3 = data1.clone();

            // Bubble Sort (skip for very large input)
            if (size <= 10_000) {
                long start = System.nanoTime();
                bubbleSort(data1);
                long end = System.nanoTime();
                System.out.printf("Bubble Sort : %.4f ms%n",
                        (end - start) / 1_000_000.0);
            } else {
                System.out.println("Bubble Sort : Skipped (Too Slow)");
            }

            // Merge Sort
            long startMerge = System.nanoTime();
            mergeSort(data2);
            long endMerge = System.nanoTime();
            System.out.printf("Merge Sort  : %.4f ms%n",
                    (endMerge - startMerge) / 1_000_000.0);

            // Quick Sort
            long startQuick = System.nanoTime();
            quickSort(data3, 0, data3.length - 1);
            long endQuick = System.nanoTime();
            System.out.printf("Quick Sort  : %.4f ms%n",
                    (endQuick - startQuick) / 1_000_000.0);

            System.out.println("------------------------------------");
        }
    }
}

