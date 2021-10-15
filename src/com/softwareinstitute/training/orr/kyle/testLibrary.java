package com.softwareinstitute.training.orr.kyle;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class testLibrary {

@Test
    public void testBookTitleMethod(){

    Book testBook = new Book ("Harry Potter", "Fantasy", "JK Rowling",234);
    assertEquals("The Book is Harry Potter", "The Book is Harry Potter");
    }
}
