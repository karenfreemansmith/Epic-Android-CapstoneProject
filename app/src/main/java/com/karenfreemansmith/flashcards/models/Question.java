package com.karenfreemansmith.flashcards.models;

import java.util.Random;

/**
 * Created by Guest on 12/20/16.
 */
public class Question {
    private int mPerson1;
    private int mPerson2;
    private int mPerson3;
    private int mPerson4;
    private int mCorrectAnswer;

    public Question(int level) {
        mPerson1 = Person.getRandomPerson(level);
        mPerson2 = Person.getRandomPerson(level);
        while(mPerson2==mPerson1) {
            mPerson2 = Person.getRandomPerson(level);
        }
        mPerson3 = Person.getRandomPerson(level);
        while((mPerson3==mPerson1)||(mPerson3==mPerson2)) {
            mPerson3 = Person.getRandomPerson(level);
        }
        mPerson4 = Person.getRandomPerson(level);
        while((mPerson4==mPerson1)||(mPerson4==mPerson2)||(mPerson4==mPerson3)) {
            mPerson4 = Person.getRandomPerson(level);
        }
        this.setAnswer();

    }

    public void setAnswer() {
        Random randomGenerator = new Random();
        int rand = randomGenerator.nextInt(4)+1;

        switch(rand) {
            case 1:
                mCorrectAnswer=mPerson1;
                break;
            case 2:
                mCorrectAnswer=mPerson2;
                break;
            case 3:
                mCorrectAnswer=mPerson3;
                break;
            case 4:
                mCorrectAnswer=mPerson4;
                break;
        }
    }

    public int getPerson1() {
        return mPerson1;
    }

    public void setPerson1(int Person1) {
        this.mPerson1 = Person1;
    }

    public int getPerson2() {
        return mPerson2;
    }

    public void setPerson2(int Person2) {
        this.mPerson2 = Person2;
    }

    public int getPerson3() {
        return mPerson3;
    }

    public void setPerson3(int Person3) {
        this.mPerson3 = Person3;
    }

    public int getPerson4() {
        return mPerson4;
    }

    public void setPerson4(int Person4) {
        this.mPerson4 = Person4;
    }

    public int getCorrectAnswer() {
        return mCorrectAnswer;
    }

    public void setCorrectAnswer(int correctAnswer) {
        mCorrectAnswer = correctAnswer;
    }
}
