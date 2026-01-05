package com.campusconnect;

/* CampusConnect – College Information System
 * 
 * Person (base class): common fields like name, email, id.
 * Student and Faculty extend Person (use inheritance).
 * ICourseActions interface with methods like enrollCourse() and dropCourse().
 * Course class has a list of students and a faculty assigned.
 * Use access modifiers: student grades must be private.
 * Polymorphism: printDetails() works differently for Student and Faculty.
 * 
 */
public interface ICourseActions {

    void enrollCourse(Course c);
    void dropCourse(Course c);
}
