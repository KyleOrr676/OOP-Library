package com.softwareinstitute.training.orr.kyle;

public class Novel extends Book implements Author{

private final int Length;

    public Novel(String title, String genre, int length, String author, int length1) {
        super(title, genre, length, author);
        Length = length1;
    }


    public int getLength() {
        return Length;
    }
}