package com.constructor.levelone;

/**
 * Class Name: Vehicle
 * Represents vehicle registration details.
 * Demonstrates:
 * - Instance variables
 * - Static (class) variable
 * - Instance method
 * - Static method
 */
public class Vehicle {

    // Instance variables
    private String ownerName;
    private String vehicleType;

    // Class variable
    private static double registrationFee = 5000.0;

    /**
     * Parameterized constructor
     * Initializes vehicle details
     */
    public Vehicle(String ownerName, String vehicleType) {
        this.ownerName = ownerName;
        this.vehicleType = vehicleType;
    }

    /**
     * Instance method
     * Displays owner and vehicle details
     */
    public void displayVehicleDetails() {
        System.out.println("Owner Name        : " + ownerName);
        System.out.println("Vehicle Type      : " + vehicleType);
        System.out.println("Registration Fee  : ₹" + registrationFee);
        System.out.println("----------------------------------");
    }

    /**
     * Static method
     * Updates registration fee for all vehicles
     */
    public static void updateRegistrationFee(double newFee) {
        registrationFee = newFee;
    }

    public static void main(String[] args) {

        // Creating vehicle objects
        Vehicle v1 = new Vehicle("Rahul Verma", "Two Wheeler");
        Vehicle v2 = new Vehicle("Anita Sharma", "Four Wheeler");

        // Displays before fee update
        v1.displayVehicleDetails();
        v2.displayVehicleDetails();

        // Updates registration fee (affects all vehicles)
        Vehicle.updateRegistrationFee(6500.0);

        // Displays after fee update
        v1.displayVehicleDetails();
        v2.displayVehicleDetails();
    }
}
