package com.flashdealz;

import java.util.Scanner;

/**
 * FlashDealz – Product Sorting by Discount
 *
 * Demonstrates:
 * - Quick Sort algorithm
 * - Sorting large unsorted datasets
 * - Performance-optimized average case
 * - Real-world e-commerce use case
 */
public class FlashDealzQuickSort {
	
    // Quick Sort function
    public static void quickSort(int[] discounts, int low, int high) {

        // Base condition
        if (low < high) {

            // Partition the array and get pivot index
            int pivotIndex = partition(discounts, low, high);

            // Recursively sort left side
            quickSort(discounts, low, pivotIndex - 1);

            // Recursively sort right side
            quickSort(discounts, pivotIndex + 1, high);
        }
    }
    
    // Partition logic (Descending Order)
    private static int partition(int[] discounts, int low, int high) {

        // Choosing last element as pivot
        int pivot = discounts[high];
        int i = low - 1;

        for (int j = low; j < high; j++) {

            // Place higher discounts on left
            if (discounts[j] >= pivot) {
                i++;

                // Swap discounts[i] and discounts[j]
                int temp = discounts[i];
                discounts[i] = discounts[j];
                discounts[j] = temp;
            }
        }

        // Place pivot at correct position
        int temp = discounts[i + 1];
        discounts[i + 1] = discounts[high];
        discounts[high] = temp;

        return i + 1;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("===== FlashDealz : Product Discount Sorter =====\n");

        // User input
        System.out.print("Enter number of products in flash sale: ");
        int n = sc.nextInt();

        int[] discounts = new int[n];

        System.out.println("\nEnter discount percentages for each product:");
        for (int i = 0; i < n; i++) {
            discounts[i] = sc.nextInt();
        }

        // Apply Quick Sort
        quickSort(discounts, 0, discounts.length - 1);

        // Display sorted discounts
        System.out.println("\n===== Top Discounted Products =====");
        for (int i = 0; i < discounts.length; i++) {
            System.out.println("Rank " + (i + 1) + " → Discount : " + discounts[i] + "%");
        }

        sc.close();
    }

}
