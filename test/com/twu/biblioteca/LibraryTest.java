package com.twu.biblioteca;


import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.Assert.*;

public class LibraryTest {

    @Test
    public void libraryKnowsIfItHasACertainBook() {
        String[] book1 = {"A Game Of Thrones", "George R.R. Martin", "1996"};
        String[] book2 = {"A CLash Of Kings", "George R.R. Martin", "1998"};
        ArrayList<String[]> list = new ArrayList<>(Arrays.asList(book1, book2));
        Library library = new Library(list);

        assertEquals(true, library.hasBook("A Game Of Thrones"));
    }

    @Test
    public void libraryKnowsIfTheLibraryContainsAGameOfThrones() {
        String[] book = {"A Game Of Thrones", "George R.R. Martin", "1996"};
        ArrayList<String[]> list = new ArrayList<>(Arrays.<String[]>asList(book));
        Library library = new Library(list);

        assertEquals(true, library.hasBook("A Game Of Thrones"));
    }

    @Test
    public void libraryCanReturnAListOfBooksItHas() {
        String[] book = {"A Game Of Thrones", "George R.R. Martin", "1996"};
        ArrayList<String[]> list = new ArrayList<>(Arrays.<String[]>asList(book));
        Library library = new Library(list);

        assertEquals(Arrays.<String[]>asList(book), library.listOfAllBooks());
    }

    @Test
    public void libraryKnowsHowToCheckOutABook() {
        String[] book = {"A Game Of Thrones", "George R.R. Martin", "1996", "available"};
        ArrayList<String[]> list = new ArrayList<>(Arrays.<String[]>asList(book));
        Library library = new Library(list);

        assertEquals(true, library.checkOut("A Game Of Thrones"));
    }

    @Test
    public void libraryKnowsHowToCheckInABook() {
        String[] book = {"A Game Of Thrones", "George R.R. Martin", "1996", "unavailable"};
        ArrayList<String[]> list = new ArrayList<>(Arrays.<String[]>asList(book));
        Library library = new Library(list);

        assertEquals(true, library.checkIn("A Game Of Thrones"));
    }
}