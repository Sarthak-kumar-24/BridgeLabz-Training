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
public class InternetBill  extends Bill {

    public InternetBill(double amount, String dueDate) {
        super("Internet", amount, dueDate);
    }

    public void sendReminder() {
        System.out.println(" Internet Bill Alert: Avoid service disruption!");
    }
}
