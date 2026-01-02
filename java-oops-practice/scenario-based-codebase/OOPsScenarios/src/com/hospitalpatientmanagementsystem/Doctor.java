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
public class Doctor {


	private String name;
	private String specialization;
	
	public Doctor( String name, String specialization) {
		this.name = name;
		this.specialization = specialization;
	}
	
	
    public void displayInfo() {
        System.out.println("Doctor: " + name + " | Specialization: " + specialization);
    }

}
