package org.launchcode.java.studioquiz;

import javax.swing.*;

public class MultipleChoice extends Question{


    public MultipleChoice(int pointValue, String text) {
        super(pointValue, text);
        setPointValue(1);
        this.pointValue = pointValue;
    }

    @Override
    public int getAnswers() {
        return 0;
    }
}
