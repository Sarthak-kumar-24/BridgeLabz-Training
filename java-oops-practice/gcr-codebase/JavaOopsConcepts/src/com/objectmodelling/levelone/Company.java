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
class Company {

    private String companyName;
    private List<Department> departments = new ArrayList<>();

    Company(String companyName) {
        this.companyName = companyName;
    }

    // Company CREATES departments
    void addDepartment(String departmentName) {
        departments.add(new Department(departmentName));
    }

    Department getDepartment(int index) {
        return departments.get(index);
    }

    void showCompany() {
        System.out.println(" Company: " + companyName);
        for (Department d : departments) {
            d.showDepartment();
        }
    }
    public static void main(String[] args) {

        Company company = new Company("TechCorp");

        company.addDepartment("IT");
        company.addDepartment("HR");

        company.getDepartment(0).addEmployee("Amit");
        company.getDepartment(0).addEmployee("Neha");

        company.getDepartment(1).addEmployee("Rohit");

        company.showCompany();

        // If company = null → everything is gone
    }
}

