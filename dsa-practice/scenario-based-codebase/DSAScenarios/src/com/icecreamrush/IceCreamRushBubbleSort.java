package com.icecreamrush;

import java.util.Scanner;

/*
 *  IceCreamRush – Sorting Flavors by Popularity (Bubble Sort)
 * 
 * 
 * At “IceCreamRush,” a small local vendor sells 8 different ice cream flavors. 
 * At the end of each week, the shopkeeper wants to sort these flavors based on how many times each
 * was sold. Since the list is short and he updates it manually, he prefers a simple sorting method
 * Bubble Sort — where he repeatedly compares adjacent sales figures and swaps them ifNeeded.s
 * 
 */
public class IceCreamRushBubbleSort {
	
    public static void bubbleSort(Flavor[] flavors) {

        int n = flavors.length;

        // Outer loop for passes
        for (int i = 0; i < n - 1; i++) {

            // Inner loop for adjacent comparison
            for (int j = 0; j < n - 1 - i; j++) {

                // Swap if current flavor sold more than next
                if (flavors[j].weeklySales > flavors[j + 1].weeklySales) {

                    Flavor temp = flavors[j];
                    flavors[j] = flavors[j + 1];
                    flavors[j + 1] = temp;
                }
            }
        }
    }

    public static void displayFlavors(Flavor[] flavors) {

        System.out.println("--------------------------------------");
        System.out.println("Flavor Name\tWeekly Sales");
        System.out.println("--------------------------------------");

        for (Flavor f : flavors) {
            System.out.println(f.name + "\t\t" + f.weeklySales);
        }
    }

    /*
     * Main method – execution starts here
     */
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println(" IceCreamRush – Weekly Sales Sorter");
        System.out.println("------------------------------------");

        int n = 8;
        Flavor[] flavors = new Flavor[n];

        // User input
        for (int i = 0; i < n; i++) {

            System.out.println("\nEnter details for Flavor " + (i + 1));

            System.out.print("Flavor Name: ");
            String name = sc.next();

            System.out.print("Weekly Sales: ");
            int sales = sc.nextInt();

            flavors[i] = new Flavor(name, sales);
        }

        // Before sorting
        System.out.println("\n Flavors BEFORE Sorting:");
        displayFlavors(flavors);

        // Apply Bubble Sort
        bubbleSort(flavors);

        // After sorting
        System.out.println("\n Flavors AFTER Sorting (by Popularity):");
        displayFlavors(flavors);

        sc.close();
    }

}
