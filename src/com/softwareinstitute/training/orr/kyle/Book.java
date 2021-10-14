package com.softwareinstitute.training.orr.kyle;

public class Book extends LibraryContents{

    private int Length;
    private String Author;


    public Book(String title, String genre, int length, String author) {
        super(title, genre);
        Length = length;
        Author = author;
    }


    public void Title(String itemTitle){
        System.out.println("The title of the book is " +itemTitle);
    }

    public void Genre(String itemGenre){
        System.out.println("The genre of the book is " +itemGenre);
    }

    public int getLength() {
        return Length;
    }


}
