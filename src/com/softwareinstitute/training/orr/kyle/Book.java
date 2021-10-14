package com.softwareinstitute.training.orr.kyle;

public class Book extends LibraryContents implements Author {


////// Attribute

    private String Title;
    private String Genre;
    private int Length;
    private String Author;

////// Constructor

    public Book() {
        this("Dictionary");
    }

    public Book(String Title) {
        this("Educational", Title);
    }

    public Book(String Title, String Genre) {
        this("Dictionary", "Educational", 1000);
    }

    public Book(String Title, String Genre, int Length) {
        ("Dictionary", "Educational", 1000, "Collins");
    }

    public Book(String Title, String Genre, int Length, String Author){
        super("Book");
        this.Title = Title;
        this.Genre = Genre;
        this.Length = Length;
        this.Author = Author;
    }


}
    public Book(String Title, String Genre, int Length, String Author){
        super(Book);
        this.Title = Title;
        this.Genre = Genre;
        this.Length = Length;
        this.Author = Author;
    }


////// Method

    public void Title(String itemTitle) {
        System.out.println("The title of the book is " + itemTitle);
    }

    public void Genre(String itemGenre) {
        System.out.println("The genre of the book is " + itemGenre);
    }

    public int setLength() {
        return Length;
    }

    public void getLength(int Length) {
        this.Length = Length;
    }
}

