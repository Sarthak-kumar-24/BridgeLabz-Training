package com.sorting;

public class CountingSort {

	public static void countingSort(int[] ages) {

		int minAge = 10;
		int maxAge = 18;

		// Count array size = range of ages
		int[] count = new int[maxAge - minAge + 1];

		// Stores frequency of each age
		for (int age : ages) {
			count[age - minAge]++;
		}

		// Rebuilds sorted array
		int index = 0;
		for (int i = 0; i < count.length; i++) {
			while (count[i] > 0) {
				ages[index++] = i + minAge;
				count[i]--;
			}
		}
	}

	public static void main(String[] args) {

		int[] studentAges = { 15, 12, 18, 14, 10, 16, 12 };

		System.out.println("Before Sorting:");
		for (int age : studentAges) {
			System.out.print(age + " ");
		}

		countingSort(studentAges);

		System.out.println("\n\nAfter Sorting:");
		for (int age : studentAges) {
			System.out.print(age + " ");
		}

	}

}
