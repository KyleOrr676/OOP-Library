package com.softwareinstitute.training.orr.kyle;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class testLibrary {

    @Test
    public void testBookTitleMethod(){

    Book testBook = new Book ("Harry Potter", "Fantasy", "JK Rowling",234);
    assertEquals("The Book is not Harry Potter", "Harry Potter", "Harry Potter");
    }
    @Test
    public void testBookGenreMethod(){

        Book testBook = new Book ("Harry Potter", "Fantasy", "JK Rowling",234);
        assertEquals("The Book is not Fantasy", "Fantasy", "Fantasy");
    }
    @Test
    public void testDVDTitleMethod(){

        DVD testDVD = new DVD ("IT", "Horror", "Stephen King",96);
        assertEquals("The Film is not IT", "IT", "IT");
    }
    @Test
    public void testDVDGenreMethod(){

        DVD testDVD = new DVD ("IT", "Horror", "Stephen King",96);
        assertEquals("The Film is not Horror", "Horror", "Horror");
    }
    @Test
    public void testAudiobookMethod(){

        Audiobook testAudiobook = new Audiobook ("LOTR", "Fantasy", 960);
        assertEquals("The Film is not LOTR", "LOTR", "LOTR");
    }
    @Test
    public void testAudiobookGenreMethod(){

        Audiobook testAudiobook = new Audiobook ("IT", "Horror", 96);
        assertEquals("The Film is not Horror", "Horror", "Horror");
    }
}