package com.generics.aidrivenresumescreeningsystem;

/**
 * Resume is a generic class that processes resumes
 * for a specific job role.
 *
 * Bounded Type Parameter:
 * T must extend JobRole
 */
public class Resume<T extends JobRole>{
	
    private T jobRole;

    Resume(T jobRole) {
        this.jobRole = jobRole;
    }

    // Get job role
    T getJobRole() {
        return jobRole;
    }

}
