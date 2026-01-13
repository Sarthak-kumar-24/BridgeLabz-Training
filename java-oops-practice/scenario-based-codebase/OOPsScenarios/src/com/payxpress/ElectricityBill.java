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
public class ElectricityBill extends Bill {
	
    public ElectricityBill(double amount, String dueDate) {
        super("Electricity", amount, dueDate);
    }

    public void sendReminder() {
        System.out.println(" Electricity Bill Reminder: Pay before " + dueDate);
    }

}
