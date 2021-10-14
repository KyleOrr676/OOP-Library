package com.softwareinstitute.training.orr.kyle;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        ArrayList<LibraryContents> LibraryContents = new ArrayList<>(10);
        LibraryContents.add(new Book("The Shining" , "Horror","Stephen King"));
        System.out.println("Title (Book) : "+ Book.getTitle() +", written by " + Book.getAuthor()+", and this book's genre is: "+ Book.getGenre()+ ".");

        LibraryContents.add(new DVD("Batman: The Dark Knight", "Fantasy", "Christopher Nolan", 152));
        System.out.println("Title (Film) : "+ DVD.getTitle()+", this film's genre is: " + DVD.getGenre()+ ", directed by " + DVD.getDirector() +", and it plays for "+DVD.getDVDLength()+ " minutes.");

        LibraryContents.add(new Audiobook("Wolf of Wall Street", "Biopic", 1200));
        System.out.println("Title (Audiobook) : "+ Audiobook.getTitle()+ ", this audiobook's genre is: "+ Audiobook.getGenre()+ ", which plays for " + Audiobook.getABLength()+ " minutes.");

        LibraryContents.add(new Novel("To Kill a Mockingbird", "Classic", "Harper Lee"));
        System.out.println("Title (Novel) : "+ Novel.getTitle() +", this book's genre is:"+ Novel.getGenre()+ ", written by " + Novel.getAuthor()+".");

        LibraryContents.add(new Comic("The Amazing Spider-man", "Superhero", "Stan Lee"));
        System.out.println("Title (Comic) : "+ Novel.getTitle() +", this book's genre is: "+ Novel.getGenre()+ ", written by " + Novel.getAuthor()+".");
    }
}