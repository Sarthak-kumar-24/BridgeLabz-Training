package com.bagnballorganizer;

/*
 * Ball Class
 * ----------
 * Represents a ball stored inside a bag.
 * Demonstrates:
 * - Encapsulation (private fields)
 * - Object creation using constructors
 * - Interface implementation (Storable)
 */
public class Ball implements Storable {

	private int ballId;
	private String color;
	private String size; // small / medium / large

	public Ball(int ballId, String color, String size) {
		this.ballId = ballId;
		this.color = color;
		this.size = size;
	}

	public int getBallId() {
		return ballId;
	}

	@Override
	public void displayInfo() {
		System.out.println("Ball ID: " + ballId + ", Color: " + color + ", Size: " + size);
	}

}
