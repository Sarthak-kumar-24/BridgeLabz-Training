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
public abstract class Bill implements IPayable{
	
    protected String type;
    protected double amount;
    protected String dueDate;
    private boolean isPaid; // encapsulated

    protected Bill(String type, double amount, String dueDate) {
        this.type = type;
        this.amount = amount;
        this.dueDate = dueDate;
        this.isPaid = false;
    }

    
    protected double calculateLateFee(double penalty) {
        return amount + penalty;
    }

    
    public final void pay() {
        if (isPaid) {
            System.out.println(" Bill already paid: " + type);
            return;
        }
        isPaid = true;
        System.out.println(" Payment successful for " + type + " bill");
    }

    protected boolean isPaid() {
        return isPaid;
    }

    public void showBill() {
        System.out.println(type + " | Amount: Rs" + amount +
                " | Due: " + dueDate +
                " | Status: " + (isPaid ? "PAID" : "PENDING"));
    }

}
