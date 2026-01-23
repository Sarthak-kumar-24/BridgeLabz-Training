package com.examscanner;

/**
 * MathAnswerSheet 
 * -----------------------
 * 
 * Holds answer key for Math subject and evaluates student responses.
 */
public class MathAnswerSheet implements AnswerSheet {

	private final char[] answerKey = { 'A', 'B', 'C', 'D', 'A', 'B', 'C' };

	@Override
	public int evaluate(char[] studentAnswers) {

		int score = 0;

		for (int i = 0; i < answerKey.length; i++) {
			if (studentAnswers[i] == answerKey[i]) {
				score++;
			}
		}
		return score;
	}
}
