package com.softwareinstitute.training.orr.kyle;

public class Audiobook extends LibraryContents implements Author{

    private int Length;







    public Audiobook(String title, String genre, int length) {
        super(title, genre);
        Length = length;
    }


    public void Title(String itemTitle){
        System.out.println("The title of the audiobook is " +itemTitle);
    }

    public void Genre(String itemGenre){
        System.out.println("The genre of the audiobook is " +itemGenre);
    }

    public int getLength() {
        return Length;
    }
    public void setLength(){
        this.Length=Length;
    }
}
