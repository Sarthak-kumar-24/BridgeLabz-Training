package com.markmate;

/**
 * This class represents the final marksheet
 * that will be exported as JSON.
 */
public class StudentReport {

    // Student name
    public String name;

    // Total marks
    public int total;

    // Average marks
    public double average;

    // Grade based on average
    public String grade;

    /**
     * Constructor to initialize report fields
     */
    public StudentReport(String name, int total, double average, String grade) {
        this.name = name;
        this.total = total;
        this.average = average;
        this.grade = grade;
    }
}
