package com.softwareinstitute.training.orr.kyle;

public class Novel extends LibraryContents implements Author{

private int Length;


    public Novel(String title, String genre) {
        super(title, genre);
        Length = Length;
    }

    public int setLength() {
        return Length;
    }
    public void getLength(int Length){
        this.Length=Length;
    }
}
