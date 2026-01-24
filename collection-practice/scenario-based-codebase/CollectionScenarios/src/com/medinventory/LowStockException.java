package com.medinventory;

/**
 * LowStockException 
 * ----------------- 
 * Thrown when an inventory item's quantity
 * falls below a critical threshold.
 */
public class LowStockException extends Exception {

	public LowStockException(String message) {
		super(message);
	}

}
