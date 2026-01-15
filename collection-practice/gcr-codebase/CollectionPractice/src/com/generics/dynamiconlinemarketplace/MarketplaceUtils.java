package com.generics.dynamiconlinemarketplace;

/**
 * MarketplaceUtils provides generic utility methods applicable to all product
 * types.
 */
public class MarketplaceUtils {

	/**
	 * Generic method to apply discount to any Product type. Uses bounded type
	 * parameter.
	 */
	static <T extends Product<?>> void applyDiscount(T product, double percentage) {
		product.applyDiscount(percentage);
	}
}
