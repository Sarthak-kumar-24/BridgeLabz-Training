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
public class Patient {

	private int id;
	protected String name;
	private String medicalHistory;

	public Patient(int id, String name) {

		this.id = id;
		this.name = name;
		this.medicalHistory = "Not Disclosed";

	}

	public Patient(int id, String name, String medicalHistory) {

		this.id = id;
		this.name = name;
		this.medicalHistory = medicalHistory;

	}

	public String getSummary() {

		return "Patient ID: " + id + ", Name: " + name;
	}

	public void displayInfo() {
		System.out.println("Patient: " + name);
	}

	public static void main(String[] args) {

		// Patients
		Patient p1 = new InPatient(101, "Sarthak", 4);
		Patient p2 = new OutPatient(102, "Nishita");

		// Doctor
		Doctor d1 = new Doctor("Dr. Sharma", "Cardiology");

		// Billing
		Payable bill = new Bill(10000);

		p1.displayInfo();
		p2.displayInfo();
		d1.displayInfo();

		System.out.println("Total Bill Amount: Rs" + bill.calculatePayment());
	}

}
