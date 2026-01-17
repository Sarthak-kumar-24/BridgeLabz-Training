package com.fleetmanager;

import java.util.Scanner;

public class FleetManagerMergeSort {

	/*
	 * Merge Sort function Divides the array and merges sorted halves
	 */
	public static void mergeSort(Vehicle[] vehicles, int left, int right) {
		if (left < right) {

			int mid = (left + right) / 2;

			// Sort left half
			mergeSort(vehicles, left, mid);

			// Sort right half
			mergeSort(vehicles, mid + 1, right);

			// Merge both halves
			merge(vehicles, left, mid, right);
		}
	}

	/*
	 * Merge two sorted subarrays
	 */
	public static void merge(Vehicle[] vehicles, int left, int mid, int right) {

		int n1 = mid - left + 1;
		int n2 = right - mid;

		Vehicle[] L = new Vehicle[n1];
		Vehicle[] R = new Vehicle[n2];

		// Copy data into temp arrays
		for (int i = 0; i < n1; i++)
			L[i] = vehicles[left + i];

		for (int j = 0; j < n2; j++)
			R[j] = vehicles[mid + 1 + j];

		int i = 0, j = 0, k = left;

		// Merge based on mileage
		while (i < n1 && j < n2) {
			if (L[i].mileage <= R[j].mileage) {
				vehicles[k] = L[i];
				i++;
			} else {
				vehicles[k] = R[j];
				j++;
			}
			k++;
		}

		
		while (i < n1) {
			vehicles[k] = L[i];
			i++;
			k++;
		}

		while (j < n2) {
			vehicles[k] = R[j];
			j++;
			k++;
		}
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println(" Fleet Manager – Vehicle Maintenance Scheduler");
		System.out.println("----------------------------------------------");

		System.out.print("Enter total number of vehicles: ");
		int n = sc.nextInt();

		Vehicle[] vehicles = new Vehicle[n];

		// User input
		for (int i = 0; i < n; i++) {
			System.out.println("\nEnter details for Vehicle " + (i + 1));

			System.out.print("Vehicle ID: ");
			int id = sc.nextInt();

			System.out.print("Mileage (km): ");
			int mileage = sc.nextInt();

			vehicles[i] = new Vehicle(id, mileage);
		}

		// Display before sorting
		System.out.println("\n Vehicles BEFORE Scheduling:");
		displayVehicles(vehicles);

		// Apply Merge Sort
		mergeSort(vehicles, 0, n - 1);

		// Display after sorting
		System.out.println("\n Master Maintenance Schedule (Sorted by Mileage):");
		displayVehicles(vehicles);

		sc.close();
	}

	/*
	 * Utility method to display vehicles
	 */
	public static void displayVehicles(Vehicle[] vehicles) {
		System.out.println("---------------------------------");
		System.out.println("Vehicle ID\tMileage");
		System.out.println("---------------------------------");

		for (Vehicle v : vehicles) {
			System.out.println(v.vehicleId + "\t\t" + v.mileage);
		}
	}

}
