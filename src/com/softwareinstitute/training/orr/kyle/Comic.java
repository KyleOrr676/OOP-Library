package com.softwareinstitute.training.orr.kyle;

public class Comic extends Book implements Author{

    public static int ComicLength;


    public Comic(String Title, String Genre, String Author, int Length) {
        super(Title, Genre, Author, Length);
        this.ComicLength = Length;
    }


    public void setLength(int Length){
        this.ComicLength = Length;
    }
    public static int getComicLength(){
        return ComicLength;
    }

    @Override
    public void published() {

    }
    @Override
    public void written() {

    }

    @Override
    public void read() {

    }
}
