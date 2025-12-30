package com.objectmodelling.levelone;

/*
 * Description: Model a Hospital where Doctor and Patient objects interact through consultations. 
 * A doctor can see multiple patients, and each patient can consult multiple doctors.
 * Tasks:
 * Define a Hospital class containing Doctor and Patient classes.
 * Create a method consult() in the Doctor class to show communication,
 *  which would display the consultation between a doctor and a patient.
 * Model an association between doctors and patients to show that doctors and patients can have multiple relationships.
 * 
 * 
 */
public class Hospital {
	
    private String hospitalName;

    Hospital(String hospitalName) {
        this.hospitalName = hospitalName;
    }

    void startConsultation(Doctor doctor, Patient patient) {
        System.out.println(hospitalName + " arranges consultation");
        doctor.consult(patient);
    }

    public static void main(String[] args) {

        Hospital hospital = new Hospital("City Hospital");

        Doctor d1 = new Doctor("Sharma");
        Doctor d2 = new Doctor("Mehta");

        Patient p1 = new Patient("Aman");
        Patient p2 = new Patient("Neha");

        hospital.startConsultation(d1, p1);
        hospital.startConsultation(d1, p2);
        hospital.startConsultation(d2, p1);
    }

}
