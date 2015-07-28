package com.twu.biblioteca;


import org.junit.Test;
import org.mockito.Mockito;

import static java.util.Arrays.asList;
import static org.junit.Assert.*;

public class LibraryTest {

    @Test
    public void libraryKnowsHowManyBooksItHas() {
        Library library = new Library();

        assertEquals(0, library.numberOfBooks());
    }

    @Test
    public void libraryKnowsHowToAddABookToItself() {
        Book book = Mockito.mock(Book.class);
        Library library = new Library();

        library.addBook(book);

        assertEquals(1, library.numberOfBooks());
    }

    @Test
    public void libraryKnowsHowToReturnListOfBooks() {
        Book book = new Book("A Game of Thrones", "George R.R. Martin", 1996);
        Library library = new Library();

        library.addBook(book);

        assertEquals(asList(book), library.listOfBooks());
    }
}