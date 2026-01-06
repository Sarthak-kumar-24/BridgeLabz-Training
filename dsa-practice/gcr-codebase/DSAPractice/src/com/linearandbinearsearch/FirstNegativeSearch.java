package com.linearandbinearsearch;

/*
 * Search for the First Negative Number
 * 
 * You are given an integer array. 
 * A program that performs Linear Search to find the first negative number in the array. 
 * If a negative number is found, return its index. 
 * If no negative number is found, return -1.
 */
public class FirstNegativeSearch {

    public static int findFirstNegative(int[] arr) {

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 0) {
                return i;   // first negative found
            }
        }

        return -1;  // no negative number
    }

    public static void main(String[] args) {

        int[] arr = {5, 3, 0, -2, 8, -7};

        int result = findFirstNegative(arr);

        System.out.println("Index of first negative number: " + result);
    }

}
