package com.examresultuploader;

/**
 * ExamRecord<T> 
 * -------------- 
 * Generic model class representing a student's
 * exam result for any exam type (Mid, Final, Internal).
 */
public class ExamRecord<T> {

	private int rollNo;
	private String name;
	private String subject;
	private int marks;
	private T examType;

	public ExamRecord(int rollNo, String name, String subject, int marks, T examType) {
		this.rollNo = rollNo;
		this.name = name;
		this.subject = subject;
		this.marks = marks;
		this.examType = examType;
	}

	public String getSubject() {
		return subject;
	}

	public int getMarks() {
		return marks;
	}
}
