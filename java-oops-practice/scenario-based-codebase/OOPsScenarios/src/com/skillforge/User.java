package com.skillforge;

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
public abstract class User {
	
    protected String name;

    public User(String name) {
        this.name = name;
    }

    public abstract String getRole();

}
