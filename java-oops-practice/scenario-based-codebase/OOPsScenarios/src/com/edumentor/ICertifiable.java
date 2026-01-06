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
public interface ICertifiable {
	
	public void generateCertificate();

}
