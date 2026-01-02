package com.hospitalpatientmanagementsystem;

/* Hospital Patient Management System
 * 
 * Scenario: A hospital wants a software module to register patients, assign doctors, and maintain
 * billing.
 * 
 *  Class: Patient, Doctor, Bill
 *  Constructor: Overloaded for emergency vs. normal patient admission
 * Access Modifiers: Keep sensitive data like medicalHistory as private, expose
 * getSummary() via public
 * Interface: Payable with method calculatePayment() implemented in Bill
 * Operators: Used to compute discounts, taxes, totals
 * OOP:
 * Encapsulation: Private fields with getter/setters
 * Abstraction: Hide billing calculation behind interface
 * Inheritance: InPatient, OutPatient extend Patient
 * Polymorphism: displayInfo() overridden for Doctor, Patient, etc.
 * 
 */
public class Bill implements Payable{
    private double baseAmount;

    public Bill(double baseAmount) {
        this.baseAmount = baseAmount;
    }

    
    @Override
    public double calculatePayment() {
        double tax = baseAmount * 0.12;      // 12% tax
        double discount = baseAmount * 0.15; // 15% discount
        return baseAmount + tax - discount;
    }
	
	


	

}
