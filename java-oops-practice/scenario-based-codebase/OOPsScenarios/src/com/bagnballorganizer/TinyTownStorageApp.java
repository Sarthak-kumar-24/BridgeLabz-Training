package com.bagnballorganizer;

/*
 * TinyTownStorageApp Class
 * -----------------------
 * Main driver class of the application.
 * Responsible for:
 * - Creating Bag and Ball objects
 * - Demonstrating add, remove, and display operations
 * - Showing real-world interaction between objects
 */
public class TinyTownStorageApp {
    public static void main(String[] args) {

        System.out.println(" TinyTown Play School – Bag & Ball Organizer");
        System.out.println("---------------------------------------------");

        // Create bags
        Bag redBag = new Bag(1, "Red", 2);
        Bag blueBag = new Bag(2, "Blue", 3);

        // Create balls
        Ball b1 = new Ball(101, "Yellow", "Small");
        Ball b2 = new Ball(102, "Green", "Medium");
        Ball b3 = new Ball(103, "Blue", "Large");

        // Add balls
        redBag.addBall(b1);
        redBag.addBall(b2);
        redBag.addBall(b3); // should fail (capacity reached)

        // Display contents
        redBag.displayBalls();

        // Remove a ball
        redBag.removeBall(101);

        // Display again
        redBag.displayBalls();

        
        System.out.println("\n All Bags Summary:");
        redBag.displayInfo();
        blueBag.displayInfo();
    }

}
