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
public class Order {

    private String orderId;
    private String orderDate;

    public Order(String orderId, String orderDate) {
        this.orderId = orderId;
        this.orderDate = orderDate;
    }

    public String getOrderId() {
        return orderId;
    }

    public String getOrderDate() {
        return orderDate;
    }

    public String getOrderStatus() {
        return "Order Placed";
    }
    
    public static void main(String[] args) {

        Order order1 = new Order("ORD101", "2025-01-10");
        Order order2 = new ShippedOrder("ORD102", "2025-01-11", "TRK789");
        Order order3 = new DeliveredOrder("ORD103", "2025-01-12", "TRK456", "2025-01-15");

        System.out.println(order1.getOrderStatus());
        System.out.println(order2.getOrderStatus());
        System.out.println(order3.getOrderStatus());
    }
}

