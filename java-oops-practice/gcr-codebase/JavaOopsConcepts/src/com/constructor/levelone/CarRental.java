package com.constructor.levelone;

/**
 * Class Name: CarRental
 * Represents a simple car rental system.
 * Demonstrates:
 * - Instance variables
 * - Constructors
 * - Cost calculation logic
 */
public class CarRental {

    // Instance variables (attributes)
    private String customerName;
    private String carModel;
    private int rentalDays;

    // Constant rental cost per day
    private static final double COST_PER_DAY = 1500.0;

    /**
     * Parameterized constructor
     * Initializes rental details
     */
    public CarRental(String customerName, String carModel, int rentalDays) {
        this.customerName = customerName;
        this.carModel = carModel;
        this.rentalDays = rentalDays;
    }

    /**
     * Calculates total rental cost
     */
    public double calculateTotalCost() {
        return rentalDays * COST_PER_DAY;
    }

    /**
     * Displays rental details
     */
    public void displayRentalDetails() {
        System.out.println("Customer Name : " + customerName);
        System.out.println("Car Model     : " + carModel);
        System.out.println("Rental Days   : " + rentalDays);
        System.out.println("Total Cost    : ₹" + calculateTotalCost());
    }

    /**
     * Main method for testing
     */
    public static void main(String[] args) {

        // Creating CarRental object using constructor
        CarRental rental = new CarRental("Amit Sharma", "Hyundai Creta", 5);

        // Displaying rental details
        rental.displayRentalDetails();
    }
}

