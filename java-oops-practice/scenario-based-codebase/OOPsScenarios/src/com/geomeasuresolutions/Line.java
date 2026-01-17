package com.geomeasuresolutions;

public class Line {

	// Encapsulated data members
	private double x1, y1, x2, y2;

	/*
	 * Constructor to initialize line coordinates 'this' keyword differentiates
	 * instance variables
	 */
	public Line(double x1, double y1, double x2, double y2) {
		this.x1 = x1;
		this.y1 = y1;
		this.x2 = x2;
		this.y2 = y2;
	}

	/*
	 * Method to calculate length of the line Formula: √((x2-x1)² + (y2-y1)²)
	 */
	public double calculateLength() {
		return Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
	}

}
