package com.objectmodelling.levelone;

/*
 * Description: Create a University with multiple Faculty members and Department objects. 
 * Model it so that the University and its Departments are in a composition relationship 
 * (deleting a university deletes all departments), 
 * and the Faculty members are in an aggregation relationship (faculty can exist outside of any specific department).

Tasks:
Define a University class with Department and Faculty classes.
Demonstrate how deleting a University also deletes its Departments.
Show that Faculty members can exist independently of a Department.
 * 
 */
public class UniversityDepartment {

    private String deptName;

    UniversityDepartment(String deptName) {
        this.deptName = deptName;
    }

    void showDepartment() {
        System.out.println(" Department: " + deptName);
    }
}