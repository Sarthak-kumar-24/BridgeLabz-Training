package com.medinventory;

import java.util.*;

/**
 * MedInventoryApp
 * ----------------
 * Main driver class for MedInventory system.
 * Reads inventory CSV file, analyzes data,
 * and displays categorized inventory.
 */
public class MedInventoryApp {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter inventory CSV file path: ");
        String filePath = sc.nextLine();

        try {
            List<String> lines = InventoryReader.readFile(filePath);

            Map<String, List<Item<String>>> inventory = InventoryAnalyzer.analyze(lines);

            System.out.println("\n===== INVENTORY SUMMARY =====\n");

            for (Map.Entry<String, List<Item<String>>> entry : inventory.entrySet()) {

                System.out.println("Category: " + entry.getKey());
                for (Item<String> item : entry.getValue()) {
                    System.out.println(" - " + item);
                }
                System.out.println();
            }

        } catch (LowStockException e) {
            System.out.println(e.getMessage());
        } catch (Exception e) {
            System.out.println("System error: " + e.getMessage());
        }
    }
}

