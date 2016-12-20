package com.karenfreemansmith.flashcards.models;

import java.util.Random;

/**
 * Created by Guest on 12/20/16.
 */
public class Question {
    Person mPerson1;
    Person mPerson2;
    Person mPerson3;
    Person mPerson4;

    public Question() {
        mPerson1 = Person.getRandomPerson();
        mPerson2 = Person.getRandomPerson();
        while(mPerson2.getName().equals(mPerson1.getName())) {
            mPerson2 = Person.getRandomPerson();
        }
        mPerson3 = Person.getRandomPerson();
        while(mPerson3.getName().equals(mPerson1.getName())||mPerson3.getName().equals(mPerson2.getName())) {
            mPerson3 = Person.getRandomPerson();
        }
        mPerson4 = Person.getRandomPerson();
        while(mPerson4.getName().equals(mPerson1.getName())||mPerson4.getName().equals(mPerson2.getName())||mPerson4.getName().equals(mPerson3.getName())) {
            mPerson4 = Person.getRandomPerson();
        }
        this.setAnswer();
        // how to avoid duplicates?
    }

    public void setAnswer() {
        Random randomGenerator = new Random();
        int rand = randomGenerator.nextInt(4)+1;

        switch(rand) {
            case 1:
                mPerson1.setCorrectAnswer(true);
                break;
            case 2:
                mPerson2.setCorrectAnswer(true);
                break;
            case 3:
                mPerson3.setCorrectAnswer(true);
                break;
            case 4:
                mPerson4.setCorrectAnswer(true);
                break;
        }
    }

    public Person getPerson1() {
        return mPerson1;
    }

    public void setPerson1(Person Person1) {
        this.mPerson1 = Person1;
    }

    public Person getPerson2() {
        return mPerson2;
    }

    public void setPerson2(Person Person2) {
        this.mPerson2 = Person2;
    }

    public Person getPerson3() {
        return mPerson3;
    }

    public void setPerson3(Person Person3) {
        this.mPerson3 = Person3;
    }

    public Person getPerson4() {
        return mPerson4;
    }

    public void setPerson4(Person Person4) {
        this.mPerson4 = Person4;
    }
}
