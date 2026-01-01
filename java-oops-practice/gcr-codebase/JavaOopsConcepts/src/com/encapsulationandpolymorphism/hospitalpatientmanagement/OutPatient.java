package com.encapsulationandpolymorphism.hospitalpatientmanagement;

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
class OutPatient extends Patient implements MedicalRecord {

    private double consultationFee;

    public OutPatient(int id, String name, int age, double consultationFee) {
        super(id, name, age);
        this.consultationFee = consultationFee;
    }

    @Override
    public double calculateBill() {
        return consultationFee;
    }

    @Override
    public void addRecord(String diagnosis) {
        setDiagnosis(diagnosis);
    }

    @Override
    public void viewRecords() {
        System.out.println("Diagnosis: " + getDiagnosis());
    }
}

