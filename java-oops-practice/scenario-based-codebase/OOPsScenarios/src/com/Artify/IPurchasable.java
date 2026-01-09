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
public interface IPurchasable {
	
    void purchase(User user);
    void showLicense();

}
