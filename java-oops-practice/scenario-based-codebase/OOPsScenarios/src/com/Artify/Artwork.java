package com.Artify;

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
public abstract class Artwork implements IPurchasable {
    protected String title;
    protected String artist;
    protected double price;
    protected String licenseType; // encapsulated (protected)

    // Constructor without preview
    public Artwork(String title, String artist, double price, String licenseType) {
        this.title = title;
        this.artist = artist;
        this.price = price;
        this.licenseType = licenseType;
    }

    // Constructor with preview
    public void showArtworkDetails(String type) {
        System.out.println("\n Artwork Selected");
        System.out.println("------------------------------------");
        System.out.println("Title          : " + title);
        System.out.println("Artist         : " + artist);
        System.out.println("Type           : " + type);
        System.out.printf ("Price          : Rs%.2f%n", price);
        System.out.println("------------------------------------");
    }

    @Override
    public void purchase(User user) {
        if (user.deductBalance(price)) {
            System.out.println("\n Purchase Successful!");
            System.out.printf (" Amount Deducted : Rs%.2f%n", price);
            System.out.println(" License Type    : " + licenseType);
            showLicense();
            System.out.printf (" Remaining Wallet Balance : Rs%.2f%n", user.getWalletBalance());
        } else {
            System.out.println("\n Purchase Failed!");
            System.out.println(" Reason : Insufficient Wallet Balance");
            System.out.printf (" Wallet Balance Unchanged : Rs%.2f%n", user.getWalletBalance());
        }
    }
       
    
}
