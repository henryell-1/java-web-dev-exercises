package org.launchcode.java.studioquiz;

public abstract class Question {
    public  int pointValue;
    private String text;

    public Question(int pointValue, String text) {
        this.pointValue = pointValue;
        this.text = text;

    }

    public void displayQuestion(){
        System.out.println(text);
    }

    public void setPointValue(int x){
        this.pointValue = x;
    }

    public int getPointValue(){
        return this.pointValue;
    }

    public abstract int getAnswers();
}
