package com.robowarehouse;

import java.util.Scanner;

/*
=========================================================
Class: RoboWarehouse

- Simulates a shelf-loading robot
- Packages are added one by one based on weight
- Maintains ascending order using Insertion Sort logic
- Ideal for streaming insertions with low memory usage
=========================================================
*/
public class RoboWarehouse {

	private static int[] shelf = new int[50];
	private static int size = 0;

	// Insert package weight using insertion sort technique
	private static void insertPackage(int weight) {
		int i = size - 1;

		// Shift heavier packages to the right
		while (i >= 0 && shelf[i] > weight) {
			shelf[i + 1] = shelf[i];
			i--;
		}

		shelf[i + 1] = weight;
		size++;

		System.out.println(" Package inserted with weight: " + weight);
	}

	// Display shelf state
	private static void displayShelf() {
		if (size == 0) {
			System.out.println(" Shelf is empty");
			return;
		}

		System.out.print(" Shelf Weights (Ascending): ");
		for (int i = 0; i < size; i++) {
			System.out.print(shelf[i] + " ");
		}
		System.out.println();
	}

	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		while (true) {
			System.out.println("\n======  ROBO WAREHOUSE MENU ======");
			System.out.println("1. Add Package");
			System.out.println("2. Display Shelf");
			System.out.println("3. Exit");
			System.out.print("Enter choice: ");

			int choice = sc.nextInt();

			switch (choice) {
			case 1:
				System.out.print("Enter package weight: ");
				int weight = sc.nextInt();
				insertPackage(weight);
				break;

			case 2:
				displayShelf();
				break;

			case 3:
				System.out.println(" RoboWarehouse shutting down");
				sc.close();
				return;

			default:
				System.out.println(" Invalid choice");
			}
		}
	}

}
