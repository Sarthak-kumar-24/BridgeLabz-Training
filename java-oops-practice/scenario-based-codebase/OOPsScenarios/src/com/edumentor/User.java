package com.edumentor;

import java.util.Scanner;

/*
 *  EduMentor – Personalized Learning Platform
 *  User base class: name, email, userId.
 *  Learner and Instructor inherit from User.
 *  ICertifiable interface with method generateCertificate().
 *  Quiz class: fields for questions, answers, and score.
 *  Encapsulation for quiz answers (can’t be modified once set).
 *  Polymorphism: generateCertificate() works differently for short courses vsfull-time.
 *  
 * 
 */
public abstract class User {

	protected String name;
	protected String email;
	protected int userId;

	public User(String name, String email, int userId) {
		this.name = name;
		this.email = email;
		this.userId = userId;
	}

    // ---------- Utility Output Methods ----------
    static void header(String title) {
        System.out.println("\n===========================================");
        System.out.println("    " + title.toUpperCase());
        System.out.println("===========================================");
    }

    static void section(String title) {
        System.out.println("\n------------ " + title + " -------------");
    }

    static void line(String key, Object value) {
        System.out.printf("%-20s : %s%n", key, value);
    }

    // ---------- Main ----------
    public static void main(String[] args) {

        header("EduMentor Learning Platform");

        // ===== Learners =====
        Learner[] learners = {
            new Learner("Sarthak", "sarthak@mail.com", 101),
            new Learner("DeviJii", "devijii@mail.com", 102),
            new Learner("harsh", "harsh@mail.com", 103)
        };

        // ===== Instructors =====
        Instructor[] instructors = {
            new Instructor("Dr. Rao", "rao@mail.com", 201),
            new Instructor("Dr. Mehta", "mehta@mail.com", 202)
        };

        section("User Details");

        for (Learner l : learners) {
            line("Learner Name", l.name);
            line("Learner Email", l.email);
            l.showRole();
            System.out.println();
        }

        for (Instructor i : instructors) {
            line("Instructor Name", i.name);
            line("Instructor Email", i.email);
            i.showRole();
            System.out.println();
        }

        // ===== Quiz Data =====
        section("Quiz Session Started");

        Quiz[] quizzes = {
            new Quiz(
                new String[]{"What is OOP?", "What is Encapsulation?"},
                new String[]{"Object Oriented Programming", "Data Hiding"},
                "Easy"
            ),
            new Quiz(
                new String[]{"What is Polymorphism?", "What is Abstraction?"},
                new String[]{"Many Forms", "Hiding Implementation"},
                "Medium"
            ),
            new Quiz(
                new String[]{"What is Inheritance?", "What is Interface?"},
                new String[]{"IS-A relationship", "Contract"},
                "Hard"
            )
        };

        String[] Answers = {
            "Object Oriented Programming",
            "Data Hiding"
        };

        for (Quiz q : quizzes) {
            q.evaluate(Answers);
            line("Difficulty Level", q.getDifficulty());
            line("Questions Attempted", q.getTotalQuestions());
            line("Correct Answers", q.getScore());
            line("Final Percentage", q.getPercent() + " %");
            System.out.println();
        }

        // ===== Certification =====
        section("Certification Status");

        ICertifiable shortCourse = new ShortCourse("Java Basics");
        ICertifiable fullTimeCourse = new FullTimeCourse("AI Engineering");

        shortCourse.generateCertificate();
        fullTimeCourse.generateCertificate();

        header("Session Completed Successfully");
    }
}
