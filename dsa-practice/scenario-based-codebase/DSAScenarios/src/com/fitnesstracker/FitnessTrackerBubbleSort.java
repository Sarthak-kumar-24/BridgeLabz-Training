package com.fitnesstracker;

import java.util.Scanner;

/**
 * FitnessTracker - Daily Step Count Ranking
 *
 * Demonstrates: - Bubble Sort - Sorting small, frequently updated datasets -
 * Real-time leaderboard generation
 */
public class FitnessTrackerBubbleSort {

	// Bubble Sort based on step count (descending)
	private static void bubbleSort(String[] users, int[] steps, int n) {

		// Outer loop for passes
		for (int i = 0; i < n - 1; i++) {

			boolean swapped = false;

			System.out.println("\nPass " + (i + 1) + ":");

			// Inner loop for comparisons
			for (int j = 0; j < n - i - 1; j++) {

				// If next user has more steps, swap
				if (steps[j] < steps[j + 1]) {

					// Swap steps
					int tempSteps = steps[j];
					steps[j] = steps[j + 1];
					steps[j + 1] = tempSteps;

					// Swap corresponding user names
					String tempUser = users[j];
					users[j] = users[j + 1];
					users[j + 1] = tempUser;

					swapped = true;
				}
			}

			// Print leaderboard after each pass
			printLeaderboard(users, steps, n);

			// Optimization: stop if already sorted
			if (!swapped) {
				System.out.println("List already sorted. Stopping early.");
				break;
			}
		}
	}

	// Display leaderboard
	private static void printLeaderboard(String[] users, int[] steps, int n) {
		for (int i = 0; i < n; i++) {
			System.out.println((i + 1) + ". " + users[i] + " → " + steps[i] + " steps");
		}
	}

	// MAIN METHOD
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("===== FitnessTracker : Daily Step Ranking =====\n");

		System.out.print("Enter number of users: ");
		int n = sc.nextInt();
		sc.nextLine(); // consume newline

		String[] users = new String[n];
		int[] steps = new int[n];

		// Input user data
		for (int i = 0; i < n; i++) {
			System.out.print("\nEnter name of user " + (i + 1) + ": ");
			users[i] = sc.nextLine();

			System.out.print("Enter steps taken by " + users[i] + ": ");
			steps[i] = sc.nextInt();
			sc.nextLine();
		}

		System.out.println("\n===== Initial Step Data =====");
		printLeaderboard(users, steps, n);

		// Apply Bubble Sort
		bubbleSort(users, steps, n);

		System.out.println("\n===== Final Leaderboard =====");
		printLeaderboard(users, steps, n);

		sc.close();
	}

}
