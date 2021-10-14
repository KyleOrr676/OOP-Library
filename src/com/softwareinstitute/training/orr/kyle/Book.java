package com.softwareinstitute.training.orr.kyle;

public class Book extends LibraryContents implements Author{

////// Attribute

    private int Length;

////// Constructor

    public Book(String title, String genre, int length, String author) {
        super(title, genre);
        Length = length;
    }


////// Method

    public void Title(String itemTitle){
        System.out.println("The title of the book is " +itemTitle);
    }

    public void Genre(String itemGenre){
        System.out.println("The genre of the book is " +itemGenre);
    }

    public int setLength() {
        return Length;
    }
    public void getLength(int Length){
        this.Length=Length;
    }

}
