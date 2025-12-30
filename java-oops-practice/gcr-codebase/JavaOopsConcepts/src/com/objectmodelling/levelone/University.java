package com.objectmodelling.levelone;
import java.util.ArrayList;
import java.util.List;

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
public class University {

    private String universityName;

    // Composition
    private List<Department> departments = new ArrayList<>();

    // Aggregation
    private List<Faculty> faculties = new ArrayList<>();

    University(String universityName) {
        this.universityName = universityName;
    }

    // COMPOSITION: University creates departments
    void addDepartment(String deptName) {
        departments.add(new Department(deptName));
    }

    // AGGREGATION: Faculty passed from outside
    void addFaculty(Faculty faculty) {
        faculties.add(faculty);
    }

    void showUniversity() {
        System.out.println(" University: " + universityName);

        System.out.println("Departments:");
        for (Department d : departments) {
            d.showDepartment();
        }

        System.out.println("Faculties:");
        for (Faculty f : faculties) {
            f.showFaculty();
        }
    }
    public static void main(String[] args) {

        University uni = new University("Tech University");

        // Composition
        uni.addDepartment("Computer Science");
        uni.addDepartment("Mechanical");

        // Aggregation
        Faculty f1 = new Faculty("Dr. Sharma");
        Faculty f2 = new Faculty("Dr. Mehta");

        uni.addFaculty(f1);
        uni.addFaculty(f2);

        uni.showUniversity();

        // If uni = null;
        // Departments disappear 
        // Faculty still exists 
    }

}
