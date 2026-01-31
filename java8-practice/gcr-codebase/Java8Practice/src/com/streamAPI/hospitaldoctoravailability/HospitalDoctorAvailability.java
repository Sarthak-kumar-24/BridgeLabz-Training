package com.streamAPI.hospitaldoctoravailability;

import java.util.*;
import java.util.stream.Collectors;

/*
 * HospitalDoctorAvailability
 * --------------------------
 * Finds doctors available on weekends
 * and sorts them by specialty.
 */
public class HospitalDoctorAvailability {

	public static void main(String[] args) {

		List<Doctor> doctors = Arrays.asList(new Doctor("Dr. Sharma", "Cardiology", true),
				new Doctor("Dr. Mehta", "Neurology", false), 
				new Doctor("Dr. Khan", "Orthopedics", true),
				new Doctor("Dr. Verma", "Dermatology", true), 
				new Doctor("Dr. Singh", "Cardiology", false),
				new Doctor("Dr. Rao", "Neurology", true));

		// Stream processing
		List<Doctor> weekendDoctors = doctors.stream()

				// Step 1: Filter doctors available on weekends
				.filter(Doctor::isAvailableOnWeekend)

				// Step 2: Sort doctors by specialty (alphabetical)
				.sorted(Comparator.comparing(Doctor::getSpecialty))

				// Collect result
				.collect(Collectors.toList());

		// Display result
		System.out.println(" Doctors Available on Weekends:");
		weekendDoctors.forEach(System.out::println);
	}
}
