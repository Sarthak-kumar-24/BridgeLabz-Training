package com.medinventory;

public class Item<T> {

	private String itemID;
	private String itemName;
	private int quantity;
	private String expiryDate;
	private T category;

	public Item(String itemID, String itemName, int quantity, String expiryDate, T category) {
		this.itemID = itemID;
		this.itemName = itemName;
		this.quantity = quantity;
		this.expiryDate = expiryDate;
		this.category = category;

	}

	public String getItemID() {
		return itemID;
	}

	public String getName() {
		return itemName;
	}

	public int getQuantity() {
		return quantity;
	}

	public String getExpiry() {
		return expiryDate;
	}

	public T getCategory() {
		return category;
	}

	@Override
	public String toString() {
		return itemID + " | " + itemName + " | Qty: " + quantity + " | Exp: " + expiryDate;
	}

}
