package com.twu.biblioteca;


import org.junit.Test;

import static org.junit.Assert.*;

public class BookTest {

    @Test
    public void bookKnowsIfAGivenStringIsEqualToItsName() {
        LibraryItem libraryItem = new Book("bookName", "bookAuthor", "bookYear");

        assertEquals(true, libraryItem.hasName("bookName"));
    }
}