package com.softwareinstitute.training.orr.kyle;

public abstract class LibraryContents {

//////////////////////////////////////// Attributes /////////////////////////////

    private String Title;
    private String Genre;



////////////////////////////////////////// Constructor ///////////////////////////

    public LibraryContents(String title, String genre) {
        Title = title;
        Genre = genre;
    }


//////////////////////////////////////// Method ///////////////////////////////////


    public String getTitle() {
        return Title;
    }
    public void setTitle(String Title) {
        this.Title = Title;
    }

    public String getGenre(){
        return Genre;
    }
    public void setGenre(){
        this.Genre = Genre;
    }

}

















