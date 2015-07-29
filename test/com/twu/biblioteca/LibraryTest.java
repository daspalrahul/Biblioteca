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

}