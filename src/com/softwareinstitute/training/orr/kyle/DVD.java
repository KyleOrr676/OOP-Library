package com.softwareinstitute.training.orr.kyle;

public class DVD extends LibraryContents{

    private int Length;


    public DVD(String title, String genre, int length) {
        super(title, genre);
        Length = length;
    }

    public void Title(String itemTitle){
        System.out.println("The title of the item is" +itemTitle);
    }

    public void Genre(String itemGenre){
        System.out.println("The genre of the item is " +itemGenre);
    }

    public void Length(int itemLength){
        System.out.println("The length of the item is" +itemLength);
    }
}
