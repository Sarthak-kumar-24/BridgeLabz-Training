package com.generics.smartwarehousemanagementsystem;

import java.util.List;

/**
 * SmartWarehouseSystem demonstrates:
 * - Generic class usage
 * - Bounded type parameters
 * - Wildcards
 */
public class SmartWarehouseSystem {
	
	   static void displayAllItems(List<? extends WarehouseItem> items) {
	        for (WarehouseItem item : items) {
	            item.displayInfo();
	        }
	    }
	   

	    public static void main(String[] args) {

	        // Creating storage for different item categories
	        Storage<Electronics> electronicsStorage = new Storage<>();
	        Storage<Groceries> groceriesStorage = new Storage<>();
	        Storage<Furniture> furnitureStorage = new Storage<>();

	        // Adding items
	        electronicsStorage.addItem(new Electronics("Laptop"));
	        electronicsStorage.addItem(new Electronics("Smartphone"));

	        groceriesStorage.addItem(new Groceries("Rice"));
	        groceriesStorage.addItem(new Groceries("Milk"));

	        furnitureStorage.addItem(new Furniture("Chair"));
	        furnitureStorage.addItem(new Furniture("Table"));

	        // Displaying items using wildcard method
	        System.out.println("---- Electronics ----");
	        displayAllItems(electronicsStorage.getItems());

	        System.out.println("\n---- Groceries ----");
	        displayAllItems(groceriesStorage.getItems());

	        System.out.println("\n---- Furniture ----");
	        displayAllItems(furnitureStorage.getItems());
	    }

}
