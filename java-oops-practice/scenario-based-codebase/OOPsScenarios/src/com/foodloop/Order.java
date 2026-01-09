package com.foodloop;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


/*
 * FoodLoop – Restaurant Ordering System
 * 
 *  FoodLoop is an app where users place food orders from local restaurants.
 *  Requirements:
 * FoodItem class: name, category, price, availability.
 * Order class: contains list of food items and total.
 * Interface IOrderable with placeOrder() and cancelOrder().
 * Inheritance: VegItem, NonVegItem extend FoodItem.
 * Polymorphism: applyDiscount() varies by order total.
 */


public class Order implements IOrderable {
	private List<FoodItem> items = new ArrayList<>();
	private double total;
	private double discount;

	// Constructor for combo meal
	public Order(FoodItem... foodItems) {
		items.addAll(Arrays.asList(foodItems));
	}

	private void calculateTotal() {
		total = 0;
		for (FoodItem item : items) {
			total += item.getPrice();
		}
		applyDiscount();
		total = total - discount; 
	}

	// discount logic
	private void applyDiscount() {
		if (total >= 1000) {
			discount = total * 0.20;
		} else if (total >= 500) {
			discount = total * 0.10;
		} else {
			discount = 0;
		}
	}

	@Override
	public void placeOrder() {
		System.out.println("\n ORDER DETAILS");
		System.out.println("------------------------------------");

		for (FoodItem item : items) {
			if (item.isAvailable()) {
				item.reduceStock();
				System.out.printf("%s %-15s Rs%.2f%n", item.getType(), item.name, item.getPrice());
			} else {
				System.out.println(" " + item.name + " is out of stock");
			}
		}

		calculateTotal();

		System.out.println("------------------------------------");
		System.out.printf("Subtotal        : Rs%.2f%n", total + discount);
		System.out.printf("Discount Applied: Rs%.2f%n", discount);
		System.out.printf("Total Payable   : Rs%.2f%n", total);
		System.out.println(" Order Placed Successfully");
	}

	@Override
	public void cancelOrder() {
		System.out.println(" Order Cancelled");
	}
}
