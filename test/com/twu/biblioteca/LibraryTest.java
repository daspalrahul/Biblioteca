package com.twu.biblioteca;


import org.junit.Test;
import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.Assert.*;

public class LibraryTest {

    @Test
    public void libraryKnowsIfItHasACertainBook() {
        Book book1 = new Book("A Game Of Thrones", "George R.R. Martin", "1996");
        Book book2 = new Book("A CLash Of Kings", "George R.R. Martin", "1998");
        ArrayList<Book> list = new ArrayList<>();
        list.add(book1);
        list.add(book2);
        Library library = new Library(list, new ArrayList<Book>());

        assertEquals(true, library.hasBook("A Game Of Thrones"));
    }

    @Test
    public void libraryKnowsIfTheLibraryContainsAGameOfThrones() {
        Book book = new Book("A Game Of Thrones", "George R.R. Martin", "1996");
        ArrayList<Book> list = new ArrayList<>();
        list.add(book);
        Library library = new Library(list, new ArrayList<Book>());

        assertEquals(true, library.hasBook("A Game Of Thrones"));
    }

    @Test
    public void libraryCanReturnAListOfBooksItHas() {
        Book book = new Book("A Game Of Thrones", "George R.R. Martin", "1996");
        ArrayList<Book> list = new ArrayList<>();
        list.add(book);
        Library library = new Library(list, new ArrayList<Book>());
        ArrayList<Book> expectedList = new ArrayList<>();
        expectedList.add(book);

        assertEquals(expectedList, library.listOfAllBooks());
    }

    @Test
    public void libraryKnowsHowToCheckOutABook() {
        Book book = new Book("A Game Of Thrones", "George R.R. Martin", "1996");
        ArrayList<Book> list = new ArrayList<>();
        list.add(book);
        Library library = new Library(list, new ArrayList<Book>());

        assertEquals(true, library.checkOut("A Game Of Thrones"));
    }

    @Test
    public void libraryKnowsHowToCheckInABook() {
        Book book = new Book("A Game Of Thrones", "George R.R. Martin", "1996");
        ArrayList<Book> list = new ArrayList<>();
        list.add(book);
        Library library = new Library(new ArrayList<Book>(), list);

        assertEquals(true, library.checkIn("A Game Of Thrones"));
    }

    @Test
    public void libraryKnowsHowToDisplayListOfAvailableBooks() {
        Book book = new Book("A Game Of Thrones", "George R.R. Martin", "1996");
        ArrayList<Book> list = new ArrayList<>();
        list.add(book);
        Library library = new Library(list, new ArrayList<Book>());
        ArrayList<Book> expectedList = new ArrayList<>();
        expectedList.add(book);

        assertEquals(expectedList, library.listOfAllAvailableBooks());
    }

    @Test
    public void libraryKnowsHowToCheckOutABookAndStoreItInCheckedOutBookList() {
        Book book = new Book("A Game Of Thrones", "George R.R. Martin", "1996");
        ArrayList<Book> list = new ArrayList<>();
        list.add(book);
        Library library = new Library(list, new ArrayList<Book>());

        assertEquals(true, library.checkOut("A Game Of Thrones"));
    }

    @Test
    public void libraryKnowsHowToCheckInABookAndStoreItInAvailableBookList() {
        Book book = new Book("A Game Of Thrones", "George R.R. Martin", "1996");
        ArrayList<Book> list = new ArrayList<>();
        list.add(book);
        Library library = new Library(new ArrayList<Book>(), list);

        assertEquals(true, library.checkIn("A Game Of Thrones"));
    }
}