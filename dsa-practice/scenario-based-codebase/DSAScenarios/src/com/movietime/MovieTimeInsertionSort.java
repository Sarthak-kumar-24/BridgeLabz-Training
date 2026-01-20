package com.movietime;

import java.util.Scanner;

public class MovieTimeInsertionSort {
	
    static void insertionSort(int[] shows) {

        // Loop starts from second element
        for (int i = 1; i < shows.length; i++) {

            int currentShow = shows[i]; // New show to insert
            int j = i - 1;

            // Shift shows that are later than currentShow
            while (j >= 0 && shows[j] > currentShow) {
                shows[j + 1] = shows[j];
                j--;
            }

            // Insert show at correct position
            shows[j + 1] = currentShow;
        }
    }

    // Method to display show timings
    static void displayShows(int[] shows) {
        for (int time : shows) {
            System.out.print(convertToTime(time) + "  ");
        }
        System.out.println();
    }

    // Converts minutes to HH:MM format
    static String convertToTime(int minutes) {
        int hrs = minutes / 60;
        int mins = minutes % 60;
        return String.format("%02d:%02d", hrs, mins);
    }

    // Main method
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Almost sorted show timings (in minutes)
        int[] showTimes = {600, 660, 720, 780, 900}; 
        // 10:00, 11:00, 12:00, 13:00, 15:00

        System.out.println(" Current Show Timings:");
        displayShows(showTimes);

        // Taking new show timing input
        System.out.print("Enter new show time (in minutes): ");
        int newShow = sc.nextInt();

        // Creating new array with extra space
        int[] updatedShows = new int[showTimes.length + 1];

        // Copying old shows
        for (int i = 0; i < showTimes.length; i++) {
            updatedShows[i] = showTimes[i];
        }

        // Adding new show at the end
        updatedShows[updatedShows.length - 1] = newShow;

        // Applying insertion sort
        insertionSort(updatedShows);

        System.out.println("\n Updated Show Timings (After Insertion Sort):");
        displayShows(updatedShows);

        sc.close();
    }

}
