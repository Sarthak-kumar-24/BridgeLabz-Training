package com.generics.multileveluniversitycoursemanagementsystem;

import java.util.List;

/**
 * UniversityCourseManagementSystem demonstrates:
 * - Generic classes
 * - Bounded type parameters
 * - Wild-cards for flexible handling
 */
public class CourseManagementSystem {
	
    /**
     * Displays evaluation methods for any course type
     * using wild-card (? extends CourseType)
     */
    static void displayCourses(List<? extends CourseType> courses) {
        for (CourseType c : courses) {
            c.evaluationMethod();
        }
    }

    public static void main(String[] args) {

        // Creating course containers
        Course<ExamCourse> examCourses = new Course<>();
        Course<AssignmentCourse> assignmentCourses = new Course<>();
        Course<ResearchCourse> researchCourses = new Course<>();

        // Adding courses
        examCourses.addCourse(new ExamCourse("Data Structures"));
        examCourses.addCourse(new ExamCourse("Operating Systems"));

        assignmentCourses.addCourse(new AssignmentCourse("Web Development"));
        assignmentCourses.addCourse(new AssignmentCourse("Software Engineering"));

        researchCourses.addCourse(new ResearchCourse("Artificial Intelligence"));

        // Displaying all courses dynamically
        System.out.println("----------- Exam Based Courses ----------");
        displayCourses(examCourses.getCourses());

        System.out.println("\n--------- Assignment Based Courses -----------");
        displayCourses(assignmentCourses.getCourses());

        System.out.println("\n---------- Research Based Courses -----------");
        displayCourses(researchCourses.getCourses());
    }

}
