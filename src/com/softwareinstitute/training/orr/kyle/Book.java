package com.softwareinstitute.training.orr.kyle;

public class Book extends LibraryContents implements Author {


////// Attribute

    private static String Author;

////// Constructor


    public Book(String Title, String Genre, String Author) {
        super(Title, Genre);
        Book.Author = Author;
    }


////// Method

    public static String getAuthor() {
        return Author;
    }

    public static void setAuthor(String Author) {
        Author = Author;
    }
}





