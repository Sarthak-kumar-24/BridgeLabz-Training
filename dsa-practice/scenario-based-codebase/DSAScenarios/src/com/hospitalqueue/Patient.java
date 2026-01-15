package com.hospitalqueue;

/* --------------------------------------------------
 * 
 * ClassName: Patient
 * 
 * initializes the patient with its id, name and criticality
 * 
 * --------------------------------------------------
 */
public class Patient {
	protected String name;
	protected int criticality;
	protected int id;
	
    // Constructor
    Patient(int id, String name, int criticality) {
        this.id = id;
        this.name = name;
        this.criticality = criticality;
    }

}
