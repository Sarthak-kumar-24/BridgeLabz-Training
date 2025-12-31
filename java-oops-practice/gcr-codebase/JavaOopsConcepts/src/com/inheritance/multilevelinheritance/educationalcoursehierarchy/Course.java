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
public class Course {

    private String courseName;
    private int duration; // in hours

    public Course(String courseName, int duration) {
        this.courseName = courseName;
        this.duration = duration;
    }

    public String getCourseName() {
        return courseName;
    }

    public int getDuration() {
        return duration;
    }

    public void displayInfo() {
        System.out.println("Course Name: " + courseName);
        System.out.println("Duration: " + duration + " hours");
    }
    public static void main(String[] args) {

        Course course = new PaidOnlineCourse("Java Full Stack", 120, "BridgeLabz", true, 20000, 20 );

        course.displayInfo();
    }
}

