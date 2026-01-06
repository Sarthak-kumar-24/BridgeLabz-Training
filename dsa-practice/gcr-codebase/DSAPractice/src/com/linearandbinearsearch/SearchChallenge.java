package com.linearandbinearsearch;

import java.util.Arrays;
/*
 * You are given a list of integers. 
 * Write a program that uses Linear Search to find the 
 * first missing positive integer in the list and Binary Search to find the index of a given target number.
 * 
 * 
 */
public class SearchChallenge {
	
    public static int firstMissingPositive(int[] arr) {

        int n = arr.length;
        boolean[] present = new boolean[n + 1];

        // Marks positive numbers
        for (int num : arr) {
            if (num > 0 && num <= n) {
                present[num] = true;
            }
        }

        // Finds first missing positive
        for (int i = 1; i <= n; i++) {
            if (!present[i]) {
                return i;
            }
        }

        return n + 1;
    }
    
    public static int binarySearch(int[] arr, int target) {

        int left = 0;
        int right = arr.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (arr[mid] == target) {
                return mid;
            } else if (arr[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        return -1;
    }

	public static void main(String[] args) {


	       int[] numbers = {3, 4, -1, 1};
	        int target = 4;

	        // Linear Search result
	        int missing = firstMissingPositive(numbers);
	        System.out.println("First Missing Positive: " + missing);

	        // Binary Search requires sorting
	        Arrays.sort(numbers);
	        int index = binarySearch(numbers, target);

	        System.out.println("Index of Target (" + target + "): " + index);

	}

}
