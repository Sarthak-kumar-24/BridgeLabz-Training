package com.encapsulationandpolymorphism.onlinefooddeliverysystem;

/* Online Food Delivery System
 * 
 * 
 * Define an abstract class FoodItem with fields like itemName, price, and quantity.
 * Add abstract methods calculateTotalPrice() and concrete methods like getItemDetails().
 * Extend it into classes VegItem and NonVegItem, overriding calculateTotalPrice() to include additional charges (e.g., for non-veg items).
 * Use an interface Discountable with methods applyDiscount() and getDiscountDetails().
 * Demonstrate encapsulation to restrict modifications to order details and 
 * use polymorphism to handle different types of food items in a single order-processing method.
 * 
 * 
 */
class VegItem extends FoodItem implements Discountable {

    public VegItem(String name, double price, int qty) {
        super(name, price, qty);
    }

    @Override
    public double calculateTotalPrice() {
        return getPrice() * getQuantity();
    }

    @Override
    public double applyDiscount() {
        return calculateTotalPrice() * 0.10; // 10% discount
    }

    @Override
    public String getDiscountDetails() {
        return "Veg Item Discount: 10%";
    }
}
