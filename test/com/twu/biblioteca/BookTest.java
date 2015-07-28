package com.twu.biblioteca;


import org.junit.Test;

import static org.junit.Assert.*;

public class BookTest {

    @Test
    public void bookKnowsAboutItsName() {
        Book book = new Book("A Game of Thrones", "George R.R. Martin", 1996);

        assertEquals("A Game of Thrones", book.getBookName());
    }

    @Test
    public void bookKnowsAboutItsAuthor() {
        Book book = new Book("A Game of Thrones", "George R.R. Martin", 1996);

        assertEquals("George R.R. Martin", book.getBookAuthor());
    }

    @Test
    public void bookKnowsAboutItsYearPublished() {
        Book book = new Book("A Game of Thrones", "George R.R. Martin", 1996);

        assertEquals(1996, book.getYearPublished());
    }

    @Test
    public void bookKnowsTwoEqualBooksAreEqual() {
        Book book = new Book("A Game of Thrones", "George R.R. Martin", 1996);

        assertEquals(book, book);
    }

    @Test
    public void bookKnowsBookAndNullAreNotEqual() {
        Book book = new Book("A Game of Thrones", "George R.R. Martin", 1996);

        assertNotEquals(book, null);
    }

    @Test
    public void bookKnowsEqualBookAreEqualInReverseOrder() {
        Book book1 = new Book("A Game of Thrones", "George R.R. Martin", 1996);
        Book book2 = new Book("A Game of Thrones", "George R.R. Martin", 1996);

        assertEquals(book1, book2);
    }

    @Test
    public void bookKnowsEqualBooksHaveEqualHashCodes() {
        Book book1 = new Book("A Game of Thrones", "George R.R. Martin", 1996);
        Book book2 = new Book("A Game of Thrones", "George R.R. Martin", 1996);

        assertEquals(book1.hashCode(), book2.hashCode());
    }
}