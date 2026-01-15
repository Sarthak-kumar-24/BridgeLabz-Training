package com.eventmanager;

import java.util.Scanner;

public class EventManager {

	/**
	 * Partition method places pivot element at correct position and rearranges
	 * array.
	 */
	static int partition(int[] arr, int low, int high) {
		int pivot = arr[high]; // choosing last element as pivot
		int i = low - 1;

		for (int j = low; j < high; j++) {
			if (arr[j] < pivot) {
				i++;
				int temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
			}
		}

		// place pivot at correct position
		int temp = arr[i + 1];
		arr[i + 1] = arr[high];
		arr[high] = temp;

		return i + 1;
	}

	/**
	 * Quick Sort method (recursive)
	 */
	static void quickSort(int[] arr, int low, int high) {
		if (low < high) {
			int pi = partition(arr, low, high);

			quickSort(arr, low, pi - 1);
			quickSort(arr, pi + 1, high);
		}
	}

	/**
	 * Main method – simulates ticket price optimization
	 */
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("Enter number of tickets: ");
		int n = sc.nextInt();

		int[] prices = new int[n];

		System.out.println("Enter ticket prices:");
		for (int i = 0; i < n; i++) {
			prices[i] = sc.nextInt();
		}

		// Sorting ticket prices using Quick Sort
		quickSort(prices, 0, n - 1);

		System.out.println("\nTicket prices after sorting (Cheapest → Costliest):");
		for (int price : prices) {
			System.out.print(price + " ");
		}

		// Display top 3 cheapest tickets
		System.out.println("\n\nTop 3 Cheapest Tickets:");
		for (int i = 0; i < Math.min(3, n); i++) {
			System.out.print(prices[i] + " ");
		}

		// Display top 3 costliest tickets
		System.out.println("\n\nTop 3 Costliest Tickets:");
		for (int i = n - 1; i >= Math.max(n - 3, 0); i--) {
			System.out.print(prices[i] + " ");
		}

		sc.close();
	}

}
