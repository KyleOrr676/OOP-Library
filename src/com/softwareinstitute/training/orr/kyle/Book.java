package com.softwareinstitute.training.orr.kyle;

public class Book extends LibraryContents implements Author {



    private static String Author;
    private static int Length;



    public Book(String Title, String Genre, String Author, int BookLength) {
        super(Title, Genre);
        Book.Author = Author;
        this.Length = Length;
    }



    public static String getAuthor() {
        return Author;
    }

    public static void setAuthor(String Author) {
        Author = Author;
    }
    public void setLength(int Length){
        this.Length = Length;
    }
    public static int getBookLength(){
        return Length;
    }
}





