package com.gamerzone;

import java.util.Scanner;

public class GamerZoneQuickSort {
	
    // Partition method for Quick Sort
    static int partition(int[] scores, int low, int high) {

        // Choosing last element as pivot
        int pivot = scores[high];
        int i = low - 1;

        // Rearranging elements around pivot
        for (int j = low; j < high; j++) {
            if (scores[j] > pivot) {  
                // '>' used to sort in descending order (high scores first)
                i++;
                int temp = scores[i];
                scores[i] = scores[j];
                scores[j] = temp;
            }
        }

        // Placing pivot in correct position
        int temp = scores[i + 1];
        scores[i + 1] = scores[high];
        scores[high] = temp;

        return i + 1;
    }

    // Quick Sort algorithm
    static void quickSort(int[] scores, int low, int high) {

        if (low < high) {

            // Partition index
            int pi = partition(scores, low, high);

            // Sorting left side
            quickSort(scores, low, pi - 1);

            // Sorting right side
            quickSort(scores, pi + 1, high);
        }
    }

    // Display leaderboard
    static void displayScores(int[] scores) {
        for (int score : scores) {
            System.out.print(score + "  ");
        }
        System.out.println();
    }

    // Main method
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Dynamic and unsorted player scores
        int[] scores = {450, 1200, 800, 300, 950, 600};

        System.out.println(" Scores After Match:");
        displayScores(scores);

        // Applying Quick Sort for leaderboard ranking
        quickSort(scores, 0, scores.length - 1);

        System.out.println("\n Leaderboard (High to Low):");
        displayScores(scores);

        sc.close();
    }

}
