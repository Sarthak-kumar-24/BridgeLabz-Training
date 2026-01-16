package com.cropmonitor;

import java.util.Scanner;

/*
=========================================================
Class: CropMonitor
Purpose:
- Manages unordered sensor data collected by drone sensors
- Each sensor record contains a timestamp and temperature
- Sorts large sensor datasets quickly using Quick Sort
- Uses timestamp as the partitioning key
- Designed for high-speed sorting before visualization
=========================================================
*/

public class CropMonitor {
	
    // Arrays to store sensor data
    private static long[] timestamps = new long[100];
    private static double[] temperatures = new double[100];
    private static int size = 0;

    // Adds new sensor reading
    private static void addSensorData(long timestamp, double temperature) {
        timestamps[size] = timestamp;
        temperatures[size] = temperature;
        size++;
        System.out.println(" Sensor data added");
    }

    // Quick Sort based on timestamps
    private static void quickSort(int low, int high) {
        if (low < high) {
            int pivotIndex = partition(low, high);
            quickSort(low, pivotIndex - 1);
            quickSort(pivotIndex + 1, high);
        }
    }

    // Partition logic for Quick Sort
    private static int partition(int low, int high) {
        long pivot = timestamps[high];
        int i = low - 1;

        for (int j = low; j < high; j++) {
            if (timestamps[j] <= pivot) {
                i++;
                swap(i, j);
            }
        }
        swap(i + 1, high);
        return i + 1;
    }

    // Swap both timestamp and temperature to keep data aligned
    private static void swap(int i, int j) {
        long tempTime = timestamps[i];
        timestamps[i] = timestamps[j];
        timestamps[j] = tempTime;

        double tempValue = temperatures[i];
        temperatures[i] = temperatures[j];
        temperatures[j] = tempValue;
    }

    // Display sorted sensor data
    private static void displayData() {
        if (size == 0) {
            System.out.println(" No sensor data available");
            return;
        }

        System.out.println("\n Sensor Data (Sorted by Timestamp)");
        for (int i = 0; i < size; i++) {
            System.out.println("Time: " + timestamps[i] +
                    " | Temp: " + temperatures[i] + "°C");
        }
    }

    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("\n======  CROP MONITOR MENU ======");
            System.out.println("1. Add Sensor Data");
            System.out.println("2. Sort Data by Timestamp");
            System.out.println("3. Display Sensor Data");
            System.out.println("4. Exit");
            System.out.print("Enter choice: ");

            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter timestamp: ");
                    long ts = sc.nextLong();
                    System.out.print("Enter temperature: ");
                    double temp = sc.nextDouble();
                    addSensorData(ts, temp);
                    break;

                case 2:
                    quickSort(0, size - 1);
                    System.out.println(" Data sorted using Quick Sort");
                    break;

                case 3:
                    displayData();
                    break;

                case 4:
                    System.out.println(" CropMonitor shutting down");
                    sc.close();
                    return;

                default:
                    System.out.println(" Invalid choice");
            }
        }
    }

}
