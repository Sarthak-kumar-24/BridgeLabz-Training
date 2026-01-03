package com.stacksandqueues;

/**
 * Circular Tour (Petrol Pump) Problem
 */
public class CircularTour {

    public static int findStartingPoint(int[] petrol, int[] distance) {

        int start = 0;
        int currentSurplus = 0;
        int totalSurplus = 0;

        for (int i = 0; i < petrol.length; i++) {

            int diff = petrol[i] - distance[i];
            currentSurplus += diff;
            totalSurplus += diff;

            // Cannot reach next pump
            if (currentSurplus < 0) {
                start = i + 1;
                currentSurplus = 0;
            }
        }

        // If overall petrol is sufficient
        return totalSurplus >= 0 ? start : -1;
    }

    /* ================= DEMO ================= */

    public static void main(String[] args) {

        int[] petrol = {4, 6, 7, 4};
        int[] distance = {6, 5, 3, 5};

        int startIndex = findStartingPoint(petrol, distance);

        if (startIndex != -1) {
            System.out.println("Start at petrol pump index: " + startIndex);
        } else {
            System.out.println("No circular tour possible");
        }
    }
}

