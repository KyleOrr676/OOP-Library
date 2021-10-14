package com.softwareinstitute.training.orr.kyle;


public abstract class LibraryContents {


//////////////////////////////////////// Attributes /////////////////////////////

    private static String Title;
    private static String Genre;



////////////////////////////////////////// Constructor ///////////////////////////

    public LibraryContents(String title, String genre) {
        Title = title;
        Genre = genre;
    }


//////////////////////////////////////// Method ///////////////////////////////////


    public static String getTitle() {
        return Title;
    }
    public void setTitle(String Title) {
        this.Title = Title;
    }

    public static String getGenre(){
        return Genre;
    }
    public void setGenre(){
        this.Genre = Genre;
    }

}

















