package com.foodfest;

public class FoodFestMergeSort {

	// Merge two sorted subarrays into one sorted array
	static void merge(int[] arr, int left, int mid, int right) {

		// Sizes of subarrays
		int n1 = mid - left + 1;
		int n2 = right - mid;

		// Temporary arrays
		int[] L = new int[n1];
		int[] R = new int[n2];

		// Copy data into temp arrays
		for (int i = 0; i < n1; i++)
			L[i] = arr[left + i];

		for (int j = 0; j < n2; j++)
			R[j] = arr[mid + 1 + j];

		int i = 0, j = 0, k = left;

		// Merge while maintaining stability
		while (i < n1 && j < n2) {
			if (L[i] <= R[j]) { // <= keeps stability
				arr[k] = L[i];
				i++;
			} else {
				arr[k] = R[j];
				j++;
			}
			k++;
		}

		// Copy remaining elements
		while (i < n1) {
			arr[k] = L[i];
			i++;
			k++;
		}

		while (j < n2) {
			arr[k] = R[j];
			j++;
			k++;
		}
	}

	// Recursive Merge Sort function
	static void mergeSort(int[] arr, int left, int right) {

		if (left < right) {
			int mid = (left + right) / 2;

			// Sort first half
			mergeSort(arr, left, mid);

			// Sort second half
			mergeSort(arr, mid + 1, right);

			// Merge both halves
			merge(arr, left, mid, right);
		}
	}

	// Display array
	static void display(int[] arr) {
		for (int val : arr) {
			System.out.print(val + "  ");
		}
		System.out.println();
	}

	// Main method
	public static void main(String[] args) {

		// Combined zone-wise footfall logs (already sorted zone-wise)
		int[] footfallData = { 120, 150, 200, 130, 170, 220 };

		System.out.println(" Zone-wise Footfall Data:");
		display(footfallData);

		// Applying Merge Sort
		mergeSort(footfallData, 0, footfallData.length - 1);

		System.out.println("\n Master Footfall List (After Merge Sort):");
		display(footfallData);
	}

}
