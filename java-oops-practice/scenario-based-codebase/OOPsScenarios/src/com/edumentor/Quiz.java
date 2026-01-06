package com.edumentor;

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
public class Quiz {
	private String[] questions;
	private String[] answers;
	private int score;
	private String difficulty;

	Quiz(String[] questions, String[] answers , String difficulty) {
		this.difficulty = difficulty;
		this.questions = questions;
		this.answers = answers;
		this.score = 0;
	}


	
    public void displayQuestions() {
        for (int i = 0; i < questions.length; i++) {
            System.out.println((i + 1) + ". " + questions[i]);
        }
    }
    
    public void evaluate(String[] userAnswers) {
        for (int i = 0; i < answers.length; i++) {
            if (answers[i].equalsIgnoreCase(userAnswers[i])) {
                score++;
            }
        }
    }

	public int getScore() {
		return score;
	}

	public int getTotalQuestions() {
		return answers.length;
	}

	public double getPercent() {
		return (score * 100.0) / answers.length;
	}

	public String getDifficulty() {
		return difficulty;
	}

}
