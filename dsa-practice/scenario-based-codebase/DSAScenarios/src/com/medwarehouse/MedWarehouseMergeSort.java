package com.medwarehouse;

import java.util.Scanner;

/* MedWarehouse – Sorting Medicines by Expiry (Merge Sort)
 * 
 * A pharmaceutical warehouse handles medicine records from multiple branches,each
 * sending a sorted list by expiry date. To ensure none are wasted, the system uses Merge
 */
public class MedWarehouseMergeSort {

	// Medicine class
	static class Medicine {
		String name;
		int expiryDays; // days left before expiry

		Medicine(String name, int expiryDays) {
			this.name = name;
			this.expiryDays = expiryDays;
		}
	}

	// Merge Sort function
	public static void mergeSort(Medicine[] meds, int left, int right) {

		// Base condition
		if (left < right) {

			int mid = (left + right) / 2;

			// Sort left half
			mergeSort(meds, left, mid);

			// Sort right half
			mergeSort(meds, mid + 1, right);

			// Merge both halves
			merge(meds, left, mid, right);
		}
	}

	// Merge two sorted subarrays
	public static void merge(Medicine[] meds, int left, int mid, int right) {

		int n1 = mid - left + 1;
		int n2 = right - mid;

		// Temporary arrays
		Medicine[] L = new Medicine[n1];
		Medicine[] R = new Medicine[n2];

		// Copy data
		for (int i = 0; i < n1; i++)
			L[i] = meds[left + i];

		for (int j = 0; j < n2; j++)
			R[j] = meds[mid + 1 + j];

		int i = 0, j = 0, k = left;

		// Merge logic
		while (i < n1 && j < n2) {

			if (L[i].expiryDays <= R[j].expiryDays) {
				meds[k++] = L[i++];
			} else {
				meds[k++] = R[j++];
			}
		}

		// Copy remaining elements
		while (i < n1)
			meds[k++] = L[i++];

		while (j < n2)
			meds[k++] = R[j++];
	}

	// Display sorted medicines
	public static void displayMedicines(Medicine[] meds) {

		System.out.println("\n Medicines sorted by expiry date:");
		for (Medicine med : meds) {
			System.out.println("Medicine: " + med.name + " | Expires in: " + med.expiryDays + " days");
		}
	}

	// Alert for near-expiry medicines
	public static void expiryAlert(Medicine[] meds) {

		System.out.println("\n Near Expiry Alerts (≤ 7 days):");
		boolean found = false;

		for (Medicine med : meds) {
			if (med.expiryDays <= 7) {
				System.out.println("ALERT: " + med.name + " expires in " + med.expiryDays + " days");
				found = true;
			}
		}

		if (!found) {
			System.out.println("No medicines nearing expiry ");
		}
	}

	// Main method
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		// Input number of medicines
		System.out.print("Enter number of medicines: ");
		int n = sc.nextInt();
		sc.nextLine();

		Medicine[] meds = new Medicine[n];

		// Input medicine details
		for (int i = 0; i < n; i++) {

			System.out.print("\nEnter medicine name: ");
			String name = sc.nextLine();

			System.out.print("Enter expiry days remaining: ");
			int days = sc.nextInt();
			sc.nextLine();

			meds[i] = new Medicine(name, days);
		}

		// Sort medicines using Merge Sort
		mergeSort(meds, 0, n - 1);

		// Display sorted list
		displayMedicines(meds);

		// Check for near expiry medicines
		expiryAlert(meds);

		sc.close();
	}

}
