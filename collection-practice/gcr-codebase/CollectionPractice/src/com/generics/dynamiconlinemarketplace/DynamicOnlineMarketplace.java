package com.generics.dynamiconlinemarketplace;

import java.util.ArrayList;
import java.util.List;

/**
 * DynamicOnlineMarketplace demonstrates:
 * - Generic classes
 * - Bounded type parameters
 * - Generic methods
 * - Type-safe mixed catalog
 */
public class DynamicOnlineMarketplace {
	

    public static void main(String[] args) {

        // Creating different products
        Product<BookCategory> book = new Product<>("Java Programming", 500, new BookCategory());

        Product<ClothingCategory> shirt = new Product<>("T-Shirt", 800, new ClothingCategory());

        Product<GadgetCategory> phone = new Product<>("Smartphone", 25000, new GadgetCategory());

        
        List<Product<?>> catalog = new ArrayList<>();
        catalog.add(book);
        catalog.add(shirt);
        catalog.add(phone);

        // Applying discounts dynamically
        MarketplaceUtils.applyDiscount(book, 10);    // 10% off
        MarketplaceUtils.applyDiscount(shirt, 20);  // 20% off
        MarketplaceUtils.applyDiscount(phone, 5);   // 5% off

        // Displaying catalog
        System.out.println("--------------- Online Marketplace Catalog --------------");
        for (Product<?> p : catalog) {
            p.display();
        }
    }

}
