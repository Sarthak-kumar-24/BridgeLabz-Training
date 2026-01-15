package com.examcell;

import java.util.Scanner;

public class ExamCell {
	/**
	 * Merge Sort method to sort students based on score in descending order.
	 */
	static void mergeSort(Student[] arr, int left, int right) {
		if (left < right) {
			int mid = (left + right) / 2;

			mergeSort(arr, left, mid);
			mergeSort(arr, mid + 1, right);

			merge(arr, left, mid, right);
		}
	}

	/**
	 * Merge two sorted subarrays while maintaining stability.
	 */
	static void merge(Student[] arr, int left, int mid, int right) {

		int n1 = mid - left + 1;
		int n2 = right - mid;

		Student[] L = new Student[n1];
		Student[] R = new Student[n2];

		for (int i = 0; i < n1; i++)
			L[i] = arr[left + i];

		for (int j = 0; j < n2; j++)
			R[j] = arr[mid + 1 + j];

		int i = 0, j = 0, k = left;

		// Merge by descending score
		while (i < n1 && j < n2) {
			if (L[i].score > R[j].score || (L[i].score == R[j].score)) {
				arr[k++] = L[i++];
			} else {
				arr[k++] = R[j++];
			}
		}

		while (i < n1)
			arr[k++] = L[i++];

		while (j < n2)
			arr[k++] = R[j++];
	}

	/**
	 * Main method – simulates rank generation
	 */
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("Enter number of students: ");
		int n = sc.nextInt();

		Student[] students = new Student[n];

		System.out.println("\nEnter student details:");
		System.out.println("Roll No Score");

		for (int i = 0; i < n; i++) {
			int roll = sc.nextInt();
			int score = sc.nextInt();
			students[i] = new Student(roll, score);
		}

		// Sort students using Merge Sort
		mergeSort(students, 0, n - 1);

		// Display rank list
		System.out.println("\n---- State Level Rank List ----");
		for (int i = 0; i < n; i++) {
			System.out.println(
					"Rank " + (i + 1) + " -> Roll No: " + students[i].rollNo + " | Score: " + students[i].score);
		}

		sc.close();
	}

}
