package com.eduresults;

import java.util.Scanner;

/**
 * EduResults – State Rank Sheet Generator
 *
 * Demonstrates: - Merge Sort algorithm - Merging sorted district-wise student
 * marks - Handling large datasets efficiently - Stable sorting for duplicate
 * scores
 */
public class EduResultsMergeSort {

    // Merge Sort function
    public static void mergeSort(int[] arr, int left, int right) {
        if (left < right) {

            // Find mid index
            int mid = left + (right - left) / 2;

            // Sort left half
            mergeSort(arr,left, mid);

            // Sort right half
            mergeSort(arr, mid + 1, right);

            // Merge both halves
            merge(arr, left, mid, right);
        }
    }
    
    // Merge two sorted halves
    private static void merge(int[] arr, int left, int mid, int right) {

        int n1 = mid - left + 1;
        int n2 = right - mid;

        int[] L = new int[n1];
        int[] R = new int[n2];

        // Copy data
        for (int i = 0; i < n1; i++)
            L[i] = arr[left + i];

        for (int j = 0; j < n2; j++)
            R[j] = arr[mid + 1 + j];

        int i = 0, j = 0, k = left;

        // Merge in sorted order (stable)
        while (i < n1 && j < n2) {
            if (L[i] >= R[j]) { // Descending for rank list
                arr[k++] = L[i++];
            } else {
                arr[k++] = R[j++];
            }
        }

        // Copy remaining elements
        while (i < n1)
            arr[k++] = L[i++];

        while (j < n2)
            arr[k++] = R[j++];
    }

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("===== EduResults : State Rank Sheet Generator =====\n");

		System.out.print("Enter number of districts: ");
		int districts = sc.nextInt();

		System.out.print("Enter number of students per district: ");
		int studentsPerDistrict = sc.nextInt();

		int totalStudents = districts * studentsPerDistrict;
		int[] allScores = new int[totalStudents];

		int index = 0;

		// Input district-wise sorted scores
		for (int i = 1; i <= districts; i++) {
			System.out.println("\nEnter sorted scores for District " + i + ":");
			for (int j = 0; j < studentsPerDistrict; j++) {
				allScores[index++] = sc.nextInt();
			}
		}

		// Apply Merge Sort
		mergeSort(allScores, 0, allScores.length - 1);

		// Display Rank Sheet
		System.out.println("\n===== Final State Rank List =====");
		for (int i = 0; i < allScores.length; i++) {
			System.out.println("Rank " + (i + 1) + " : Score = " + allScores[i]);
		}

		sc.close();
	}

}
