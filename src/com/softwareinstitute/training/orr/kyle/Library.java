package com.softwareinstitute.training.orr.kyle;

import java.util.ArrayList;

public class Library{

    public static void main(String[]args){

        ArrayList<LibraryContents> libraryContents = new ArrayList<>(10);
        libraryContents.add(new Book());
        libraryContents.add(new DVD());
        libraryContents.add(new Audiobook());
    }
}
