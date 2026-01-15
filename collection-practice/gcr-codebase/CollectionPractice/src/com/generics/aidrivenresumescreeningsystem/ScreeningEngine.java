package com.generics.aidrivenresumescreeningsystem;

import java.util.List;

/**
 * ScreeningEngine contains methods used by the AI
 * to screen resumes dynamically.
 */
public class ScreeningEngine {
	
    /**
     * Generic method to screen a single resume
     */
    static <T extends JobRole> void screenResume(Resume<T> resume) {
        System.out.println("AI Screening Started...");
        resume.getJobRole().screenResume();
    }

    /**
     * Wildcard method to screen resumes
     * for multiple job roles together
     */
    static void screenMultipleRoles(List<? extends JobRole> roles) {
        System.out.println("\nAI Bulk Screening Pipeline:");
        for (JobRole role : roles) {
            role.screenResume();
        }
    }

}
