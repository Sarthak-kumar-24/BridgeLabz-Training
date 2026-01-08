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
public abstract class Medicine implements ISellable{
	
	private String name;
	private int price;
	private int expiryDate;
	private int quantity;
	protected boolean isExpired;
	
	
	
	
	public Medicine(String name, int price, int expiryDate, int quantity, boolean isExpired) {
		this.name = name;
		this.price = price;
		this.expiryDate = expiryDate;
		this.quantity= quantity;
		this.isExpired= isExpired;
		
	}
	public Medicine(String name, int price, int expiryDate, boolean isExpired) {
		this.name = name;
		this.price = price;
		this.expiryDate = expiryDate;
		this.quantity= 5;
		this.isExpired= isExpired;
		
	}
    // sensitive pricing logic hidden
    protected int getPrice() {
        return price;
    }

    protected int getQuantity() {
        return quantity;
    }

    protected void reduceStock(int qty) {
        quantity -= qty;
    }

    public String getName() {
        return name;
    }
	
    // common selling logic
    @Override
    public void sell(int qty) {
        if (qty <= quantity && !checkExpiry()) {
            reduceStock(qty);
            System.out.println(qty + " units of " + name + " sold");
        } else {
            System.out.println(" Cannot sell " + name);
        }
    }

    // Each medicine type will define expiry logic
    @Override
    public abstract boolean checkExpiry();

	
	
	
	


}
