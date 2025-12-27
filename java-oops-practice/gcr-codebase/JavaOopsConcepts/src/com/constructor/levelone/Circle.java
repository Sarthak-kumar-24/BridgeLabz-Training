package com.constructor.levelone;

/**
 * Created a class named Circle that 
 * Represents a Circle with a radius.
 * Demonstrates constructor chaining using this().
 */
public class Circle {

    // Instance variable
    private double radius;

    /**
     * Default Constructor
     * Initializes the radius with a default value.
     * Uses constructor chaining.
     */
    public Circle() {
        this(1.0); // Calls parameterized constructor
    }

    /**
     * Parameterized Constructor
     * Initializes the radius with user-provided value.
     */
    public Circle(double radius) {
        this.radius = radius;
    }

    /**
     * Displays the radius of the circle.
     */
    public void displayRadius() {
        System.out.println("Radius: " + radius);
    }

    /**
     * Main method (same file)
     */
    public static void main(String[] args) {

        // Using default constructor
        Circle c1 = new Circle();
        c1.displayRadius();

        System.out.println("--------------------");

        // Using parameterized constructor
        Circle c2 = new Circle(5.5);
        c2.displayRadius();
    }
}

