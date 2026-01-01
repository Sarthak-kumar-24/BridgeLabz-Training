package com.encapsulationandpolymorphism.ecommerceplatform;

/*E-Commerce Platform
 * 
 * Description: Develop a simplified e-commerce platform:
 * 
 * Create an abstract class Product with fields like productId, name, and price, and an abstract method calculateDiscount().
 * Extend it into concrete classes: Electronics, Clothing, and Groceries.
 * Implement an interface Taxable with methods calculateTax() and getTaxDetails() for applicable product categories.
 * Use encapsulation to protect product details, allowing updates only through setter methods.
 * Showcase polymorphism by creating a method that calculates and prints the final price (price + tax - discount) for a list of Product.
 */
class Electronics extends Product implements Taxable {

    public Electronics(int id, String name, double price) {
        super(id, name, price);
    }

    @Override
    public double calculateDiscount() {
        return getPrice() * 0.10; // 10% discount
    }

    @Override
    public double calculateTax() {
        return getPrice() * 0.18; // 18% GST
    }

    @Override
    public String getTaxDetails() {
        return "Electronics Tax: 18%";
    }
}
