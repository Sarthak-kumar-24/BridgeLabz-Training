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
public class Doctor {

    private String name;

    Doctor(String name) {
        this.name = name;
    }

    // Association through communication
    void consult(Patient patient) {
        System.out.println(" Dr. " + name +
                " is consulting patient " + patient.getName());
    }

    String getName() {
        return name;
    }
}
