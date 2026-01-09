package com.Artify;

import java.util.Scanner;

/* Artify – Digital Art Marketplace
 * 
 *  Artists sell digital art via Artify. Buyers can purchase, license, or subscribe to collections
 * 
 * Artwork class: title, artist, price, licenseType.
 * User class: name, walletBalance.
 * Interface IPurchasable with purchase() and license() methods.
 * Encapsulation: licensing terms are protected.
 * Inheritance: DigitalArt, PrintArt from Artwork.
 */
public class User {
	
    private String name;
    private double walletBalance;

    public User(String name, double walletBalance) {
        this.name = name;
        this.walletBalance = walletBalance;
    }

    public String getName() {
        return name;
    }

    public double getWalletBalance() {
        return walletBalance;
    }

    public boolean deductBalance(double amount) {
        if (walletBalance >= amount) {
            walletBalance -= amount;
            return true;
        }
        return false;
    }
    
    
    public static void printHeader() {
        System.out.println("====================================================");
        System.out.println("  Welcome to ARTIFY - Digital Art Marketplace");
        System.out.println("====================================================");
    }

    public static void startUserSession(User user) {
        System.out.println("\n USER SESSION STARTED");
        System.out.println("------------------------------------");
        System.out.println("Name           : " + user.getName());
        System.out.printf ("Wallet Balance : Rs%.2f%n", user.getWalletBalance());
        System.out.println("------------------------------------");
    }
    
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // ---------------- Header ----------------
        System.out.println("====================================================");
        System.out.println("  ARTIFY – DIGITAL ART MARKETPLACE");
        System.out.println("====================================================");

        // ---------------- User Input ----------------
        System.out.print("\nEnter User Name           : ");
        String userName = sc.nextLine();

        System.out.print("Enter Wallet Balance (Rs) : ");
        double balance = sc.nextDouble();

        User user = new User(userName, balance);

        // ---------------- Artwork Catalog (SYSTEM OWNED) ----------------
        Artwork[] catalog = {
            new DigitalArt("Cyber Dreams", "Alex", 1200),
            new DigitalArt("Neon City", "Riya", 900),
            new DigitalArt("Cyber Dreams", "Alex", 1200),
            new DigitalArt("Neon City", "Riya", 900),
            new DigitalArt("Cyber Dreams", "Alex", 1200),
            new DigitalArt("Neon City", "Riya", 900),
            new DigitalArt("Cyber Dreams", "Alex", 1200),
            new DigitalArt("Neon City", "Riya", 900),
            new DigitalArt("Cyber Dreams", "Alex", 1200),
            new DigitalArt("Neon City", "Riya", 900),
            new PrintArt("Nature Bliss", "Emma", 2000),
            new PrintArt("Vintage Art", "John", 1500),
            new PrintArt("Nature Bliss", "Emma", 2000),
            new PrintArt("Vintage Art", "John", 1500),
            new PrintArt("Nature Bliss", "Emma", 2000),
            new PrintArt("Vintage Art", "John", 1500),
            new PrintArt("Nature Bliss", "Emma", 2000),
            new PrintArt("Vintage Art", "John", 1500),
            new PrintArt("Nature Bliss", "Emma", 2000),
            new PrintArt("Vintage Art", "John", 1500)
        };

        // ---------------- Display Catalog ----------------
        System.out.println("\n AVAILABLE ARTWORKS");
        System.out.println("----------------------------------------------------");
        for (int i = 0; i < catalog.length; i++) {
            System.out.printf(
                "%d. %-15s | %-10s | Rs%.2f%n",
                i + 1,
                catalog[i].title,
                (catalog[i] instanceof DigitalArt) ? "Digital" : "Print",
                catalog[i].price
            );
        }
        System.out.println("----------------------------------------------------");

        // ---------------- User Selection ----------------
        System.out.print("\nSelect Artwork (1-" + catalog.length + ") : ");
        int choice = sc.nextInt();

        if (choice < 1 || choice > catalog.length) {
            System.out.println(" Invalid Selection");
            sc.close();
            return;
        }

        Artwork selectedArtwork = catalog[choice - 1];

        // ---------------- Show Details ----------------
        if (selectedArtwork instanceof DigitalArt) {
            selectedArtwork.showArtworkDetails("Digital Art");
        } else {
            selectedArtwork.showArtworkDetails("Print Art");
        }

        // ---------------- Purchase ----------------
        selectedArtwork.purchase(user);

        // ---------------- Footer ----------------
        System.out.println("\n====================================================");
        System.out.println(" Thank you for using ARTIFY!");
        System.out.println("====================================================");

        sc.close();
    }

}
