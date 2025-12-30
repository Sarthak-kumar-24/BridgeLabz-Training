package com.objectmodelling.levelone;
import java.util.ArrayList;
import java.util.List;

/*
 * A Company has several Department objects, and each department contains Employee objects.
 * Model this using composition, 
 * where deleting a company should also delete all departments and employees.
 * 
 * Define a Company class that contains multiple Department objects.
 * Define an Employee class within each Department.
 * Show the composition relationship by ensuring that when a Company object 
 * is deleted, all associated Department and Employee objects are also removed.
 */
public class Department {

    private String departmentName;
    private List<Employee> employees = new ArrayList<>();

    Department(String departmentName) {
        this.departmentName = departmentName;
    }

    // Department CREATES employees
    void addEmployee(String employeeName) {
        employees.add(new Employee(employeeName));
    }

    void showDepartment() {
        System.out.println("  Department: " + departmentName);
        for (Employee e : employees) {
            e.showEmployee();
        }
    }
}
