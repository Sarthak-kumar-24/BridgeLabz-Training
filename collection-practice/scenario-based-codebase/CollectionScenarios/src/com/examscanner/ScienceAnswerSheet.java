package com.examscanner;

/**
 * ScienceAnswerSheet
 * -------------------
 * Holds answer key for Science subject
 * and evaluates student responses.
 */
public class ScienceAnswerSheet implements AnswerSheet {

    private final char[] answerKey =
            {'B', 'C', 'A', 'D', 'B', 'A', 'C'};

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
