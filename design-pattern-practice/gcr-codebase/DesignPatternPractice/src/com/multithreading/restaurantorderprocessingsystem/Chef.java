package com.multithreading.restaurantorderprocessingsystem;

/*
 * Chef class
 * ----------
 * Represents a chef working as an independent thread.
 * Each chef prepares one dish and reports progress at intervals.
 */
public class Chef extends Thread {

	private String chefName;
	private String dishName;
	private int cookingTime; // total cooking time in milliseconds

	// Constructor
	public Chef(String chefName, String dishName, int cookingTime) {
		this.chefName = chefName;
		this.dishName = dishName;
		this.cookingTime = cookingTime;
	}

	@Override
	public void run() {

		System.out.println(chefName + " started preparing " + dishName);

		try {
			// Divide total cooking time into 4 equal parts
			int stepTime = cookingTime / 4;

			// Progress updates
			for (int progress = 25; progress <= 100; progress += 25) {
				Thread.sleep(stepTime); // simulate cooking
				System.out.println(chefName + " preparing " + dishName + ": " + progress + "% complete");
			}

			System.out.println(chefName + " finished preparing " + dishName);

		} catch (InterruptedException e) {
			System.out.println(chefName + " was interrupted while cooking " + dishName);
		}
	}

}
