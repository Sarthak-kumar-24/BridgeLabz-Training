package com.payxpress;

/*
 * PayXpress – Utility Bill Payment System
 * 
 * 
 * Bill class: type, amount, dueDate, isPaid.
 * Interface IPayable with pay() and sendReminder().
 * Use constructors to create recurring bills.
 * Encapsulation: prevent direct payment status changes.
 * Inheritance: ElectricityBill, InternetBill, WaterBill.
 * Polymorphism: reminders vary depending on utility type.
 */
public class WaterBill extends Bill {

    public WaterBill(double amount, String dueDate) {
        super("Water", amount, dueDate);
    }

    public void sendReminder() {
        System.out.println(" Water Bill Reminder: Due on " + dueDate);
    }
}
