package com.bagnballorganizer;

import java.util.ArrayList;

/*
 * Bag Class
 * ---------
 * Represents a storage bag that holds multiple balls.
 * Demonstrates:
 * - Encapsulation of bag properties
 * - Composition (Bag has-a list of Balls)
 * - Capacity control logic
 * - Real-world object modeling
 */
public class Bag implements Storable {

	private int bagId;
	private String color;
	private int capacity;
	private ArrayList<Ball> balls; // composition

	public Bag(int bagId, String color, int capacity) {
		this.bagId = bagId;
		this.color = color;
		this.capacity = capacity;
		this.balls = new ArrayList<>();
	}

	// Add ball if capacity allows
	public void addBall(Ball ball) {
		if (balls.size() >= capacity) {
			System.out.println(" Bag " + bagId + " is FULL. Cannot add ball.");
			return;
		}
		balls.add(ball);
		System.out.println(" Ball added to Bag " + bagId);
	}

	// Remove ball by ID
	public void removeBall(int ballId) {
		for (Ball b : balls) {
			if (b.getBallId() == ballId) {
				balls.remove(b);
				System.out.println(" Ball removed from Bag " + bagId);
				return;
			}
		}
		System.out.println(" Ball not found in Bag " + bagId);
	}

	// Display all balls in the bag
	public void displayBalls() {
		System.out.println("\n Balls in Bag " + bagId + ":");
		if (balls.isEmpty()) {
			System.out.println("No balls in this bag.");
			return;
		}
		for (Ball b : balls) {
			b.displayInfo();
		}
	}

	public int getBallCount() {
		return balls.size();
	}

	@Override
	public void displayInfo() {
		System.out.println("Bag ID: " + bagId + ", Color: " + color + ", Capacity: " + capacity + ", Balls Stored: "
				+ balls.size());
	}

}
