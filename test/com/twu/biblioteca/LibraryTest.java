package com.twu.biblioteca;


import org.junit.Test;
import org.mockito.Mockito;

import static org.junit.Assert.*;

public class LibraryTest {

    @Test
    public void libraryKnowsHowManyBooksItHas() {
        Library library =  new Library();

        assertEquals(0, library.numberOfBooks());
    }

    @Test
    public void libraryKnowsHowToAddABookToItself() {
        Book book = Mockito.mock(Book.class);
        Library library = new Library();

        library.addBook(book);

        assertEquals(1, library.numberOfBooks());
    }
}