package com.queueinterface.hospitaltriagesystem;

import java.util.PriorityQueue;
import java.util.Scanner;

/*
=========================================================
Program: Hospital Triage System
Purpose:
- Simulate a hospital triage system
- Patients with higher severity are treated first
- Uses PriorityQueue with custom comparator
=========================================================
*/
public class HospitalTriageSystem {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		/*
		 * PriorityQueue: - Higher severity should come first - Hence, reverse order
		 * comparison
		 */
		PriorityQueue<Patient> queue = new PriorityQueue<>((a, b) -> b.severity - a.severity);

		System.out.print("Enter number of patients: ");
		int n = sc.nextInt();
		sc.nextLine();

		// Input patients
		for (int i = 0; i < n; i++) {
			System.out.print("Enter patient name: ");
			String name = sc.nextLine();

			System.out.print("Enter severity (1-10): ");
			int severity = sc.nextInt();
			sc.nextLine();

			queue.add(new Patient(name, severity));
		}

		// Treat patients based on priority
		System.out.println("\n🩺 Treatment Order:");
		while (!queue.isEmpty()) {
			Patient p = queue.poll();
			System.out.println(p.name + " (Severity: " + p.severity + ")");
		}

		sc.close();
	}

}
