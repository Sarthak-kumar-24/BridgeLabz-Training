package com.sorting;

import java.io.*;
/*
 * Merge Sort - Sort an Array of Book Prices
 * 
 * A bookstore maintains a list of book prices in an array. 
 * Implement Merge Sort to sort the prices in ascending order.
 */
public class MergeSort {

	static void merge(int arr[], int l, int m, int r) {

		
		int n1 = m - l + 1;//1st half
		int n2 = r - m;    //2nd half

		
		int LeftPart[] = new int[n1];
		int RightPart[] = new int[n2];

		
		for (int i = 0; i < n1; ++i) {
			LeftPart[i] = arr[l + i];
		}
		
		for (int j = 0; j < n2; ++j) {
			RightPart[j] = arr[m + 1 + j];
		}

		

		
		int i = 0, j = 0;

		
		int k = l;
		while (i < n1 && j < n2) {
			if (LeftPart[i] <= RightPart[j]) {
				arr[k] = LeftPart[i];
				i++;
			} else {
				arr[k] = RightPart[j];
				j++;
			}
			k++;
		}

		// Copys remaining elements of L[] if any
		while (i < n1) {
			arr[k] = LeftPart[i];
			i++;
			k++;
		}

		// Copys remaining elements of R[] if any
		while (j < n2) {
			arr[k] = RightPart[j];
			j++;
			k++;
		}
	}

	
	static void mergeSort(int arr[], int l, int e) {

		if (l < e) {

			// Finds the middle point
			int m = l + (e - l) / 2;

			// Sort first and second halves
			mergeSort(arr, l, m);
			mergeSort(arr, m + 1, e);

			// Merge the sorted halves
			merge(arr, l, m, e);
		}
	}

	public static void main(String[] args) {

		int bookPrices[] = { 3800, 270, 430, 100, 500, 1000, 2500 };

		mergeSort(bookPrices, 0, bookPrices.length - 1);

		int n = bookPrices.length;
		for (int i = 0; i < n; ++i)
			System.out.print(bookPrices[i] + " ");
		System.out.println();

	}

}
