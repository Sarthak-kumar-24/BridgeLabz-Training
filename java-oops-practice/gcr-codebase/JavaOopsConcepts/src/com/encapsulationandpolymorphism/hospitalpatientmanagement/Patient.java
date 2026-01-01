package com.encapsulationandpolymorphism.hospitalpatientmanagement;

import java.util.ArrayList;
import java.util.List;

/* Hospital Patient Management
 * 
 * Create an abstract class Patient with fields like patientId, name, and age.
 * Add an abstract method calculateBill() and a concrete method getPatientDetails().
 * Extend it into subclasses InPatient and OutPatient, implementing calculateBill() with different billing logic.
 * Implement an interface MedicalRecord with methods addRecord() and viewRecords().
 * Use encapsulation to protect sensitive patient data like diagnosis and medical history.
 * Use polymorphism to handle different patient types and display their billing details dynamically.
 * 
 */
abstract class Patient {

    private int patientId;
    private String name;
    private int age;

    // Sensitive data
    private String diagnosis;

    public Patient(int patientId, String name, int age) {
        this.patientId = patientId;
        this.name = name;
        this.age = age;
    }

    
    public void getPatientDetails() {
        System.out.println("ID: " + patientId);
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }

    
    protected void setDiagnosis(String diagnosis) {
        this.diagnosis = diagnosis;
    }

    protected String getDiagnosis() {
        return diagnosis;
    }

    
    public abstract double calculateBill();
    
    public static void processPatients(List<Patient> patients) {

        for (Patient p : patients) {

            p.getPatientDetails();
            System.out.println("Bill Amount: Rs" + p.calculateBill());

            if (p instanceof MedicalRecord r) {
                r.viewRecords();
            }

            System.out.println("-----------------------------------");
        }
    }
    
    
    public static void main(String[] args) {

        List<Patient> patients = new ArrayList<>();

        InPatient p1 = new InPatient(1, "Aman", 30, 5, 2000);
        p1.addRecord("Pneumonia");

        OutPatient p2 = new OutPatient(2, "Neha", 25, 500);
        p2.addRecord("General Checkup");

        patients.add(p1);
        patients.add(p2);

        processPatients(patients);
    }
}

