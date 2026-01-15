package com.hospitalqueue;

import java.util.Scanner;

/* --------------------------------------------------
 * 
 * Class: HospitalQueue
 * 
 * Takes Input from user about number of patient and their id, name and criticality and then 
 * Runs two methods to sort them using bubble sort and then to display each of them in sorted order.
 * 
 * --------------------------------------------------
 */
public class HospitalQueue {
	
	
    public static void bubbleSort(Patient[] patients, int n) {
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (patients[j].criticality < patients[j + 1].criticality) {
                    // Swap adjacent patient records
                    Patient temp = patients[j];
                    patients[j] = patients[j + 1];
                    patients[j + 1] = temp;
                }
            }
        }
    }

    // Display patient list
    public static void displayPatients(Patient[] patients) {
        System.out.println("\nPatients sorted by criticality (High → Low):\n");
        for (Patient p : patients) {
            System.out.println(
                "ID: " + p.id +
                " | Name: " + p.name +
                " | Criticality: " + p.criticality
            );
        }
    }

    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of patients: ");
        int n = sc.nextInt();
        sc.nextLine(); 

        Patient[] patients = new Patient[n];

     
        for (int i = 0; i < n; i++) {
            System.out.println("\nEnter details of patient " + (i + 1));

            System.out.print("Patient ID: ");
            int id = sc.nextInt();
            sc.nextLine();

            System.out.print("Name: ");
            String name = sc.nextLine();

            System.out.print("Criticality Level: ");
            int criticality = sc.nextInt();

            patients[i] = new Patient(id, name, criticality);
        }

        // Sorting patients
        bubbleSort(patients, n);

        // Display result
        displayPatients(patients);

        sc.close();
    }

}
