package com.examscanner;

/**
 * AnswerSheet<T> 
 * -------------
 *  Generic interface representing an answer sheet
 * for any subject.
 */
public interface AnswerSheet {

	int evaluate(char[] studentAnswers);
}
