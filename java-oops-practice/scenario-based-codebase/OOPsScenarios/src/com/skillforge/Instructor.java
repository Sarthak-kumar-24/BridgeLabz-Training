package com.skillforge;

import java.util.Scanner;

/*
 * SkillForge – Online Learning Portal"
 * 
 * Course class: title, instructor, rating, modules[].
 * User class → Student, Instructor (inheritance).
 * Interface ICertifiable with generateCertificate() method.
 * Polymorphism: certificate format varies per course level.
 * Use operators for grading, progress tracking.
 * 
 */
public class Instructor extends User {

    public Instructor(String name) {
        super(name);
    }

    @Override
    public String getRole() {
        return "Instructor";
    }
    // Helper Methods
    static String getLevelName(int level) {
        switch (level) {
            case 1: return "Beginner";
            case 2: return "Intermediate";
            case 3: return "Advanced";
            default: return "Unknown";
        }
    }

    static String getInstructor(int targetLevel) {
        switch (targetLevel) {
            case 1: return "Foundation Instructor";
            case 2: return "Professional Instructor";
            case 3: return "Industry Expert";
            default: return "TBD";
        }
    }
      
    
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("======================================");
        System.out.println("         SKILLFORGE PLATFORM       ");
        System.out.println("   Learn . Practice . Get Certified   ");
        System.out.println("======================================\n");

        // User Inputs
        System.out.print("Enter your name: ");
        String name = sc.nextLine();

        System.out.print("Enter skill you want to learn: ");
        String skill = sc.nextLine();

        System.out.print("Enter current level (1-Beginner, 2-Intermediate, 3-Advanced): ");
        int currentLevel = sc.nextInt();

        System.out.print("Enter target level (1-Beginner, 2-Intermediate, 3-Advanced): ");
        int targetLevel = sc.nextInt();

        System.out.println("\n-------------- USER PROFILE --------------");

        // Validation
        if (currentLevel > targetLevel) {
            System.out.println(" Invalid Input: Target level must be higher than current level.");
            System.out.println(" Restart SkillForge with correct inputs.");
            return;
        }

        int levelGap = targetLevel - currentLevel;

        // Basic Info
        System.out.println("Name            : " + name);
        System.out.println("Skill           : " + skill);
        System.out.println("Current Level   : " + getLevelName(currentLevel));
        System.out.println("Target Level    : " + getLevelName(targetLevel));

        // Instructor Assignment
        String instructor = getInstructor(targetLevel);
        System.out.println("Instructor      : " + instructor);

        System.out.println("\n-------------- LEARNING PLAN --------------");

        if (levelGap == 0) {
            System.out.println(" You already match the target level.");
        } 
        else if (levelGap == 1) {
            System.out.println(" Duration     : 2 - 4 Weeks");
            System.out.println(" Focus        : Concepts + Practice");
        } 
        else if (levelGap == 2) {
            System.out.println(" Duration     : 2 - 3 Months");
            System.out.println(" Focus        : Deep Concepts + Projects");
        }

        System.out.println("\n-------------- CERTIFICATION --------------");

        if (targetLevel == 3) {
            System.out.println(" Certificate  : SkillForge Pro Certificate");
            System.out.println(" Eligibility  : Yes (After final assessment)");
        } 
        else if (targetLevel == 2) {
            System.out.println(" Certificate  : SkillForge Intermediate Certificate");
            System.out.println(" Eligibility  : Yes");
        } 
        else {
            System.out.println(" Certificate  : Not Eligible");
        }

        System.out.println("\n-------------- STATUS --------------");
        System.out.println(" SkillForge Path Generated Successfully!");
        System.out.println(" Assigned Instructor will contact you soon.");

        sc.close();
    }
}
