package com.examproctor;

import java.util.HashMap;
import java.util.Scanner;
import java.util.Stack;

public class ExamProctor {

	// Stack to track navigation (last visited question)
	private static Stack<Integer> navigationStack = new Stack<>();

	// questionID -> selectedAnswer
	private static HashMap<Integer, String> answers = new HashMap<>();

	// questionID -> correctAnswer (answer key)
	private static HashMap<Integer, String> answerKey = new HashMap<>();

	
	
	private static void setupExam() {
		answerKey.put(1, "A");
		answerKey.put(2, "C");
		answerKey.put(3, "B");
		answerKey.put(4, "D");
		answerKey.put(5, "A");
	}
	
	

    private static void visitQuestion(int qId) {
        navigationStack.push(qId);
        System.out.println(" Visited Question " + qId);
    }

 
    private static void submitAnswer(int qId, String ans) {
        answers.put(qId, ans.toUpperCase());
        System.out.println(" Answer saved for Question " + qId);
    }


    private static void goBack() {
        if (navigationStack.isEmpty()) {
            System.out.println(" No previous question");
            return;
        }
        int last = navigationStack.pop();
        System.out.println(" Returned from Question " + last);
    }
    
    private static int evaluateScore() {
        int score = 0;
        for (int qId : answerKey.keySet()) {
            if (answerKey.get(qId).equals(answers.get(qId))) {
                score++;
            }
        }
        return score;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        setupExam();

        while (true) {
            System.out.println("\n======  EXAM PROCTOR MENU ======");
            System.out.println("1. Visit Question");
            System.out.println("2. Submit Answer");
            System.out.println("3. Go Back");
            System.out.println("4. Submit Exam");
            System.out.println("5. Exit");
            System.out.print("Enter choice: ");

            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter Question ID: ");
                    visitQuestion(sc.nextInt());
                    break;

                case 2:
                    System.out.print("Enter Question ID: ");
                    int qId = sc.nextInt();
                    System.out.print("Enter Answer (A/B/C/D): ");
                    String ans = sc.next();
                    submitAnswer(qId, ans);
                    break;

                case 3:
                    goBack();
                    break;

                case 4:
                    int score = evaluateScore();
                    System.out.println(" Exam Submitted");
                    System.out.println(" Score: " + score + "/" + answerKey.size());
                    break;

                case 5:
                    System.out.println(" Exiting Exam Proctor");
                    sc.close();
                    return;

                default:
                    System.out.println(" Invalid choice");
            }
        }
    }
}
