package com.softwareinstitute.training.orr.kyle;

public class Book extends LibraryContents{

    private String Title;
    private String Genre;
    private int Length;
    private String Author;




    public void Title(String itemTitle){
        System.out.println("The title of the item is" +itemTitle);
    }

    public void Genre(String itemGenre){
        System.out.println("The genre of the item is " +itemGenre);
    }

    public void pages(int length) {
        System.out.println("The number of pages is" + length);

    }
    public void Author(String itemAuthor) {
        System.out.println("Author of item is" +itemAuthor);
    }

}
