package com.generics.aidrivenresumescreeningsystem;

import java.util.ArrayList;
import java.util.List;

/**
 * AIDrivenResumeScreeningSystem demonstrates: - Generic classes - Generic
 * methods - Bounded type parameters - Wildcards
 */
public class AIDrivenResumeScreeningSystem {

	public static void main(String[] args) {

		// Creating resumes for different job roles
		Resume<SoftwareEngineer> seResume = new Resume<>(new SoftwareEngineer());

		Resume<DataScientist> dsResume = new Resume<>(new DataScientist());

		Resume<ProductManager> pmResume = new Resume<>(new ProductManager());

		// Screening individual resumes
		ScreeningEngine.screenResume(seResume);
		System.out.println();

		ScreeningEngine.screenResume(dsResume);
		System.out.println();

		ScreeningEngine.screenResume(pmResume);

		// Screening multiple roles together using wildcard
		List<JobRole> jobRoles = new ArrayList<>();
		jobRoles.add(new SoftwareEngineer());
		jobRoles.add(new DataScientist());
		jobRoles.add(new ProductManager());

		ScreeningEngine.screenMultipleRoles(jobRoles);
	}

}
