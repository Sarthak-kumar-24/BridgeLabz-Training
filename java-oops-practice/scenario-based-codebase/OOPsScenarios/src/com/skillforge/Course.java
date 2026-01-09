package com.skillforge;

/*
 * SkillForge – Online Learning Portal"
 * 
 * Course class: title, instructor, rating, modules[].
 * User class → Student, Instructor (inheritance).
 * Interface ICertifiable with generateCertificate() method.
 * Polymorphism: certificate format varies per course level.
 * Use operators for grading, progress tracking.
 * 
 */
public class Course {
	
    private String title;
    private Instructor instructor;
    private double rating;              
    private String[] modules;
    private final String[] reviews;     // read-only internal reviews

    // Default modules constructor
    public Course(String title, Instructor instructor) {
        this.title = title;
        this.instructor = instructor;
        this.modules = new String[]{"Introduction", "Basics", "Advanced"};
        this.reviews = new String[]{"Great content", "Well structured"};
        this.rating = 0.0;
    }

    // Custom modules constructor
    public Course(String title, Instructor instructor, String[] modules) {
        this.title = title;
        this.instructor = instructor;
        this.modules = modules;
        this.reviews = new String[]{"Excellent depth", "Industry relevant"};
        this.rating = 0.0;
    }

    protected void updateRating(int score) {
        if (score >= 1 && score <= 5) {
            rating = (rating + score) / 2;   
        }
    }

    public double getRating() {
        return rating;
    }

    // Read-only access
    public String[] getReviews() {
        return reviews.clone();
    }

    public int getTotalModules() {
        return modules.length;
    }

    public String getTitle() {
        return title;
    }

}
