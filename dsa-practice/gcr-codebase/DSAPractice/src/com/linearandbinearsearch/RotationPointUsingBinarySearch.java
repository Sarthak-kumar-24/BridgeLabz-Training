package com.linearandbinearsearch;

/*
 *  Find the Rotation Point in a Rotated Sorted Array
 * 
 * You are given a rotated sorted array. 
 * A program that performs Binary Search to find the index of the smallest element in the array (the rotation point).
 */
public class RotationPointUsingBinarySearch {
	
    public static int findRotationPoint(int[] arr) {

        int left = 0;
        int right = arr.length - 1;

        while (left < right) {
            int mid = left + (right - left) / 2;

            if (arr[mid] > arr[right]) {
                // minimum is in right half
                left = mid + 1;
            } else {
                // minimum is in left half or at mid
                right = mid;
            }
        }

        // left == right → smallest element index
        return left;
    }

	public static void main(String[] args) {

	      int[] arr = {4, 5, 6, 7, 1, 2, 3};

	        int index = findRotationPoint(arr);

	        System.out.println("Rotation Point Index: " + index);
	        System.out.println("Smallest Element: " + arr[index]);

	}

}
