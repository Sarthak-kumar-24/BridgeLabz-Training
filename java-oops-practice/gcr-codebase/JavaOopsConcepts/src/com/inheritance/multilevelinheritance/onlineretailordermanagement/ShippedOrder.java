package com.inheritance.multilevelinheritance.onlineretailordermanagement;

/* Online Retail Order Management
 * 
 * Description: Create a multilevel hierarchy to manage orders, where Order is the base class, 
 * ShippedOrder is a subclass, and DeliveredOrder extends ShippedOrder.
 * 
 * Define a base class Order with common attributes like orderId and orderDate.
 * Create a subclass ShippedOrder with additional attributes like trackingNumber.
 * Create another subclass DeliveredOrder extending ShippedOrder, adding a deliveryDate attribute.
 * Implement a method getOrderStatus() to return the current order status based on the class level.
 * 
 */
public class ShippedOrder extends Order {

    private String trackingNumber;

    public ShippedOrder(String orderId, String orderDate, String trackingNumber) {
        super(orderId, orderDate);
        this.trackingNumber = trackingNumber;
    }

    public String getTrackingNumber() {
        return trackingNumber;
    }

    @Override
    public String getOrderStatus() {
        return "Order Shipped (Tracking: " + trackingNumber + ")";
    }
}

