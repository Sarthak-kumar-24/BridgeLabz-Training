package com.linearandbinearsearch;

/*
 * Find the First and Last Occurrence of an Element in a Sorted Array
 * 
 * Given a sorted array and a target element, write a program that uses Binary Search to find the first and last occurrence of the target element in the array. 
 * If the element is not found, return -1.
 * 
 */
public class FirstLastOccurrence {

	public static int findFirst(int[] arr, int target) {
		int left = 0, right = arr.length - 1;
		int result = -1;

		while (left <= right) {
			int mid = left + (right - left) / 2;

			if (arr[mid] == target) {
				result = mid;
				right = mid - 1; // move left
			} else if (arr[mid] < target) {
				left = mid + 1;
			} else {
				right = mid - 1;
			}
		}
		return result;
	}

	public static int findLast(int[] arr, int target) {
		int left = 0, right = arr.length - 1;
		int result = -1;

		while (left <= right) {
			int mid = left + (right - left) / 2;

			if (arr[mid] == target) {
				result = mid;
				left = mid + 1; // move right
			} else if (arr[mid] < target) {
				left = mid + 1;
			} else {
				right = mid - 1;
			}
		}
		return result;
	}

	public static void main(String[] args) {

		int[] arr = { 2, 4, 4, 4, 6, 7, 8 };
		int target = 4;

		int first = findFirst(arr, target);
		int last = findLast(arr, target);

		System.out.println("First Occurrence: " + first);
		System.out.println("Last Occurrence : " + last);

	}

}
