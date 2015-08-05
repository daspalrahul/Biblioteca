package com.twu.biblioteca.model;


import org.junit.Test;

import static org.junit.Assert.*;

public class BookTest {

    @Test
    public void bookKnowsIfAGivenStringIsEqualToItsName() {
        com.twu.biblioteca.model.LibraryItem libraryItem = new com.twu.biblioteca.model.Book("bookName", "bookAuthor", "bookYear");

        assertEquals(true, libraryItem.hasName("bookName"));
    }
}