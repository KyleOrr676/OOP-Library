package com.softwareinstitute.training.orr.kyle;

public class Book extends LibraryContents implements Author {



    private static String Author;



    public Book(String Title, String Genre, String Author) {
        super(Title, Genre);
        Book.Author = Author;
    }



    public static String getAuthor() {
        return Author;
    }

    public static void setAuthor(String Author) {
        Author = Author;
    }
}





