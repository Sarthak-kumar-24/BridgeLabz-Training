package com.sorting;

public class SelectionSort {
	
	  public static void selectionSort(int[] scores) {

	        int n = scores.length;

	        for (int i = 0; i < n - 1; i++) {

	            int minIndex = i;

	            // Find minimum element in unsorted part
	            for (int j = i + 1; j < n; j++) {
	                if (scores[j] < scores[minIndex]) {
	                    minIndex = j;
	                }
	            }

	            // Swap minimum with first unsorted element
	            int temp = scores[minIndex];
	            scores[minIndex] = scores[i];
	            scores[i] = temp;
	        }
	    }

	public static void main(String[] args) {
		
	     int[] examScores = {78, 45, 89, 62, 91, 50};

	        System.out.println("Before Sorting:");
	        for (int s : examScores) {
	            System.out.print(s + " ");
	        }

	        selectionSort(examScores);

	        System.out.println("\n\nAfter Sorting (Ascending):");
	        for (int s : examScores) {
	            System.out.print(s + " ");
	        }

	}

}
