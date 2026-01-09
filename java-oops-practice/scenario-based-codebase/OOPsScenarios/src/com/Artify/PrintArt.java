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
public class PrintArt extends Artwork {

    public PrintArt(String title, String artist, double price) {
        super(title, artist, price, "Print License");
    }

    @Override
    public void showLicense() {
        System.out.println(" License Terms  : One-time physical print usage allowed.");
    }
}
