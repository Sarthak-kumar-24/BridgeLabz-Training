package com.inheritance.multilevelinheritance.educationalcoursehierarchy;

/*
 * Educational Course Hierarchy
 * 
 * Description: Model a course system where Course is the base class, OnlineCourse is a subclass, and PaidOnlineCourse extends OnlineCourse.
 * 
 * Define a superclass Course with attributes like courseName and duration.
 * Define OnlineCourse to add attributes such as platform and isRecorded.
 * Define PaidOnlineCourse to add fee and discount.
 *
 */
public class OnlineCourse extends Course {

    private String platform;
    private boolean isRecorded;

    public OnlineCourse(String courseName, int duration, String platform, boolean isRecorded) {
        super(courseName, duration);
        this.platform = platform;
        this.isRecorded = isRecorded;
    }

    public String getPlatform() {
        return platform;
    }

    public boolean isRecorded() {
        return isRecorded;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Platform: " + platform);
        System.out.println("Recorded: " + (isRecorded ? "Yes" : "No"));
    }
}

