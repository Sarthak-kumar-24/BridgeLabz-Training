package com.cinemahouse;

import java.util.Scanner;

/*
=========================================================
Class: CinemaHouse

- Manages daily movie showtimes for a small cinema
- Accepts manual time entry from the screen manager
- Sorts showtimes using Bubble Sort
- Designed for small datasets (~10 shows)
- Keeps logic simple and code minimal
=========================================================
*/
public class CinemaHouse {
	
    private static int[] showTimes = new int[10];
    private static int count = 0;

    // Adds a new showtime (in minutes or HHMM format)
    private static void addShowTime(int time) {
        if (count >= showTimes.length) {
            System.out.println(" Maximum show limit reached");
            return;
        }
        showTimes[count++] = time;
        System.out.println(" Showtime added: " + time);
    }

    // Bubble Sort to arrange showtimes in ascending order
    private static void sortShowTimes() {
        for (int i = 0; i < count - 1; i++) {
            for (int j = 0; j < count - i - 1; j++) {
                if (showTimes[j] > showTimes[j + 1]) {
                    int temp = showTimes[j];
                    showTimes[j] = showTimes[j + 1];
                    showTimes[j + 1] = temp;
                }
            }
        }
        System.out.println(" Showtimes sorted using Bubble Sort");
    }

    // Display current showtimes
    private static void displayShowTimes() {
        if (count == 0) {
            System.out.println(" No showtimes available");
            return;
        }

        System.out.print(" Daily Showtimes: ");
        for (int i = 0; i < count; i++) {
            System.out.print(showTimes[i] + " ");
        }
        System.out.println();
    }

    // Program entry point
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("\n======  CINEMA HOUSE MENU ======");
            System.out.println("1. Add Showtime");
            System.out.println("2. Sort Showtimes");
            System.out.println("3. Display Showtimes");
            System.out.println("4. Exit");
            System.out.print("Enter choice: ");

            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter showtime (HHMM or minutes): ");
                    int time = sc.nextInt();
                    addShowTime(time);
                    break;

                case 2:
                    sortShowTimes();
                    break;

                case 3:
                    displayShowTimes();
                    break;

                case 4:
                    System.out.println(" CinemaHouse system closed");
                    sc.close();
                    return;

                default:
                    System.out.println(" Invalid choice");
            }
        }
    }

}
