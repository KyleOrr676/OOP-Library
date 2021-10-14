package com.softwareinstitute.training.orr.kyle;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        ArrayList<LibraryContents> LibraryContents = new ArrayList<>(10);
        LibraryContents.add(new Book("To Kill a Mockingbird" , "Classic","Harper Lee"));
        System.out.println("Title: "+ Book.getTitle() +", written by " + Book.getAuthor()+", and this book is "+ Book.getGenre());

        LibraryContents.add(new DVD("Batman: The Dark Knight", "It is a Fantasy movie", "Christopher Nolan", 152));
        System.out.println("Title: "+ DVD.getTitle()+", "+ DVD.getGenre()+ ", directed by " + DVD.getDirector() +", and it plays for "+DVD.getDVDLength()+ " minutes");

         LibraryContents.add(new Audiobook("Wolf of Wall Street", "Biopic", 1200));
         System.out.println("Title: "+ Audiobook.getTitle()+ " It is a "+ Audiobook.getGenre()+ "which plays for " + Audiobook.getABLength()+ "mins");

    }
}