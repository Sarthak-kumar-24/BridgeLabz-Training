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
public class PaidOnlineCourse extends OnlineCourse {

    private double fee;
    private double discount; // percentage

    public PaidOnlineCourse(String courseName, int duration, String platform, boolean isRecorded, double fee, double discount) {
        super(courseName, duration, platform, isRecorded);
        this.fee = fee;
        this.discount = discount;
    }

    public double calculateFinalFee() {
        return fee - (fee * discount / 100);
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Fee: Rs" + fee);
        System.out.println("Discount: " + discount + "%");
        System.out.println("Final Fee: Rs" + calculateFinalFee());
    }
}

