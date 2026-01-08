package com.medistore;

/* MediStore – Pharmacy Inventory & Sales System
 * 
 *  A pharmacy chain needs an app to manage drug inventory, sales, and expiry tracking.
 *  
 *  Medicine class: name, price, expiryDate, quantity.
 *  Constructors for medicines with default quantity.
 *  Use operators: total price, discount, stock adjustments.
 *  Inheritance: Tablet, Syrup, Injection extend Medicine.
 *  Polymorphism: checkExpiry() works differently for preserved vs liquid meds
 *  
 */
public class Syrup extends Medicine {

	private String name;
	private int quantity;

	public Syrup(String name, int price, int expiryDate, int quantity, boolean isExpired) {
		super(name, price, expiryDate, quantity, isExpired);

	}

	@Override
	public boolean checkExpiry() {
		if (this.isExpired == true) {
			return true;
		} else {
			return false;
		}
	}
}
