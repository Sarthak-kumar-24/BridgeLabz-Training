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
public class DeliveredOrder extends ShippedOrder {

    private String deliveryDate;

    public DeliveredOrder(String orderId, String orderDate, String trackingNumber, String deliveryDate) {
        super(orderId, orderDate, trackingNumber);
        this.deliveryDate = deliveryDate;
    }

    public String getDeliveryDate() {
        return deliveryDate;
    }

    @Override
    public String getOrderStatus() {
        return "Order Delivered on " + deliveryDate;
    }
}

