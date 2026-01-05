package com.sorting;

public class HeapSort {

	static void heapify(int[] arr, int n, int i) {

		int largest = i;
		int left = 2 * i + 1;
		int right = 2 * i + 2;

		if (left < n && arr[left] > arr[largest]) {
			largest = left;
		}

		if (right < n && arr[right] > arr[largest]) {
			largest = right;
		}

		if (largest != i) {
			int temp = arr[i];
			arr[i] = arr[largest];
			arr[largest] = temp;

			heapify(arr, n, largest);
		}
	}

	// Heap Sort
	static void heapSort(int[] arr) {

		int n = arr.length;

		// Build max heap
		for (int i = n / 2 - 1; i >= 0; i--) {
			heapify(arr, n, i);
		}

		// Extract elements one by one
		for (int i = n - 1; i > 0; i--) {

			// Move current root to end
			int temp = arr[0];
			arr[0] = arr[i];
			arr[i] = temp;

			// Heapify reduced heap
			heapify(arr, i, 0);
		}
	}

	public static void main(String[] args) {

		int[] salaries = { 60000, 45000, 90000, 50000, 75000 };

		System.out.println("Before Sorting:");
		for (int s : salaries) {
			System.out.print(s + " ");
		}

		heapSort(salaries);

		System.out.println("\n\nAfter Sorting (Ascending):");
		for (int s : salaries) {
			System.out.print(s + " ");
		}

	}

}
