package com.twu.biblioteca;


import org.junit.Test;
import java.util.ArrayList;

import static org.junit.Assert.*;

public class LibraryTest {

    @Test
    public void libraryKnowsHowManyBooksItHas() {
        Library library =  new Library(new ArrayList<Book>());

        assertEquals(0, library.numberOfBooks());
    }

}