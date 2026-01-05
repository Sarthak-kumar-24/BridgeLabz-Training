package com.sorting;

import java.util.Collections;

public class QuickSort {

	static void quickSort(int[] arr, int low, int high) {
		if (low < high) {

			int p = partition(arr, low, high);
			quickSort(arr, low, p-1);
			quickSort(arr, p + 1, high);
		}
	}
	  public static void swap(int[] arr, int i, int j) {
	        int temp = arr[i];   
	        arr[i] = arr[j];   
	        arr[j] = temp;     
	    }

	static int partition(int[] arr, int low, int high) {

		int pivot = arr[low];
		int cnt = 0;
		for (int i = low + 1; i <= high; i++) {
			if (arr[i] <= pivot) {
				cnt++;
			}
		}
		int pivotIndex = low + cnt;
		// Swap arr[i] and arr[j]
		int temp = arr[pivotIndex];
		arr[pivotIndex] = arr[low];
		arr[low] = temp;
		
		
		int i= low, j = high;
		
		
		while( i < pivotIndex && j > pivotIndex) {
			while(arr[i] <= pivot) {
				i++;
			}
			
			while( arr[j] > pivot) {
				j--;
			}
			
			if( i< pivotIndex && j> pivotIndex) {
				swap( arr, i++, j--);
			}
		}
		return pivotIndex;
	}

	

	public static void main(String[] args) {
		int[] arr = { 45, 12, 89, 33, 67 };
		quickSort(arr, 0, arr.length - 1);

		for (int x : arr) {
			System.out.print(x + " ");
		}
	}
}
