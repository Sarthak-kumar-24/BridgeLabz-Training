package com.shoppingcart;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

/*
 * Shopping Cart System
 * Demonstrates HashMap, LinkedHashMap, and TreeMap usage
 */
public class ShoppingCartSystem {
	
    // Stores product prices (fast access)
    private static HashMap<String, Double> priceMap = new HashMap<>();

    // Maintains insertion order of cart items
    private static LinkedHashMap<String, Double> cartMap = new LinkedHashMap<>();

    // Scanner for user input
    private static Scanner sc = new Scanner(System.in);
    private static void addProduct() {
        sc.nextLine();
        System.out.print("Enter Product Name: ");
        String product = sc.nextLine();

        System.out.print("Enter Product Price: ");
        double price = sc.nextDouble();

        // Store price
        priceMap.put(product, price);
        cartMap.put(product, price);

        System.out.println(" Product added to cart");
    }

    // Display all products (unordered)
    private static void displayProducts() {
        System.out.println("\nProducts in Cart:");
        for (Map.Entry<String, Double> entry : priceMap.entrySet()) {
            System.out.println(entry.getKey() + " -> Rs" + entry.getValue());
        }
    }
    // Display items in insertion order
    private static void displayInsertionOrder() {
        System.out.println("\nCart Items (Insertion Order):");
        for (Map.Entry<String, Double> entry : cartMap.entrySet()) {
            System.out.println(entry.getKey() + " -> Rs" + entry.getValue());
        }
    }
    
    // Display items sorted by price
    private static void displaySortedByPrice() {
        TreeMap<Double, List<String>> sortedMap = new TreeMap<>();

        // Group products by price
        for (Map.Entry<String, Double> entry : cartMap.entrySet()) {
            sortedMap.putIfAbsent(entry.getValue(), new ArrayList<>());
            sortedMap.get(entry.getValue()).add(entry.getKey());
        }

        System.out.println("\nCart Items (Sorted by Price):");
        for (Map.Entry<Double, List<String>> entry : sortedMap.entrySet()) {
            for (String product : entry.getValue()) {
                System.out.println(product + " -> Rs" + entry.getKey());
            }
        }
    }
    // Calculate total bill
    private static void calculateTotal() {
        double total = 0;
        for (double price : cartMap.values()) {
            total += price;
        }
        System.out.println("\n Total Bill Amount: ₹" + total);
    }

    // Menu-driven program
    public static void main(String[] args) {

        while (true) {
            System.out.println("\n====== Shopping Cart Menu ======");
            System.out.println("1. Add Product");
            System.out.println("2. Display Products");
            System.out.println("3. Display Items (Insertion Order)");
            System.out.println("4. Display Items (Sorted by Price)");
            System.out.println("5. Calculate Total Bill");
            System.out.println("6. Exit");
            System.out.print("Choose an option: ");

            int choice = sc.nextInt();

            switch (choice) {
                case 1 -> addProduct();
                case 2 -> displayProducts();
                case 3 -> displayInsertionOrder();
                case 4 -> displaySortedByPrice();
                case 5 -> calculateTotal();
                case 6 -> {
                    System.out.println(" Shopping cart closed. Thank you!");
                    return;
                }
                default -> System.out.println(" Invalid option. Try again.");
            }
        }
    }

}
