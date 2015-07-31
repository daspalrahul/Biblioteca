package com.twu.biblioteca;


import org.junit.Test;

import static org.junit.Assert.*;

public class BookTest {

    @Test
    public void bookKnowsIfAGivenStringIsEqualToItsName() {
        Book book = new Book("bookName", "bookAuthor", "bookYear");

        assertEquals(true, book.hasTitle("bookName"));
    }
}