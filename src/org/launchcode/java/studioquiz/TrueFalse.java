package org.launchcode.java.studioquiz;

import java.util.Scanner;

public class TrueFalse extends Question {
    private boolean correctAnswer;

    public TrueFalse(int pointValue, String text, boolean correctAnswer) {
        super(pointValue, text);
        setPointValue(1);
        this.correctAnswer = correctAnswer;

    }

    private boolean isCorrectAnswer(int result) {
        if (correctAnswer = isCorrectAnswer(result)){
            return true;
        }else {
            return false;
        }
    }

    @Override
    public int getAnswers() {
        Scanner answer = new Scanner(System.in);
        System.out.println("What will be your answer? Enter the number.");
        String userAnswer = answer.nextLine();
        int result = Integer.parseInt(userAnswer);
        if (isCorrectAnswer(result)) {
            return 1;
        } else {
            return 0;
        }
    }
}

