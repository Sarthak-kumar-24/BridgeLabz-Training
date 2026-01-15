package com.generics.aidrivenresumescreeningsystem;

/**
 * JobRole is an abstract class representing
 * a role for which resumes can be screened.
 *
 * All specific job roles must extend this class.
 */
public abstract class JobRole {
	

    protected String roleName;

    JobRole(String roleName) {
        this.roleName = roleName;
    }

    // Abstract method for screening logic
    abstract void screenResume();

}
