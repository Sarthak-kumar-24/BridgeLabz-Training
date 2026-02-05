package com.multithreading.restaurantorderprocessingsystem;

/*
 * Main class (Manager)
 * --------------------
 * Acts as the restaurant manager.
 * Starts all chef threads and waits for them to finish before closing the kitchen.
 */
public class RestaurantOrderSystem {
	public static void main(String[] args) throws InterruptedException {

		// Create chef threads with different dishes and cooking times
		Chef chef1 = new Chef("Chef-1", "Pizza", 3000);
		Chef chef2 = new Chef("Chef-2", "Pasta", 2000);
		Chef chef3 = new Chef("Chef-3", "Salad", 1000);
		Chef chef4 = new Chef("Chef-4", "Burger", 2500);

		// Start cooking
		chef1.start();
		chef2.start();
		chef3.start();
		chef4.start();

		// Manager waits for all chefs to finish
		chef1.join();
		chef2.join();
		chef3.join();
		chef4.join();

		System.out.println("Kitchen closed - All orders completed");
	}

}
