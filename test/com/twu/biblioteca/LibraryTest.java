package com.twu.biblioteca;


import org.junit.Test;
import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.Assert.*;

public class LibraryTest {

    @Test
    public void libraryKnowsIfItHasACertainBook() {
        LibraryItem book1 = new Book("A Game Of Thrones", "George R.R. Martin", "1996");
        LibraryItem book2 = new Book("A CLash Of Kings", "George R.R. Martin", "1998");
        ArrayList<LibraryItem> list = new ArrayList<>();
        list.add(book1);
        list.add(book2);
        Library library = new Library(list, new ArrayList<LibraryItem>());

        assertEquals(true, library.hasBook("A Game Of Thrones"));
    }

    @Test
    public void libraryKnowsIfTheLibraryContainsAGameOfThrones() {
        Book book = new Book("A Game Of Thrones", "George R.R. Martin", "1996");
        ArrayList<LibraryItem> list = new ArrayList<>();
        list.add(book);
        Library library = new Library(list, new ArrayList<LibraryItem>());

        assertEquals(true, library.hasBook("A Game Of Thrones"));
    }

    @Test
    public void libraryCanReturnAListOfBooksItHas() {
        LibraryItem book = new Book("A Game Of Thrones", "George R.R. Martin", "1996");
        ArrayList<LibraryItem> list = new ArrayList<>();
        list.add(book);
        Library library = new Library(list, new ArrayList<LibraryItem>());
        ArrayList<LibraryItem> expectedList = new ArrayList<>();
        expectedList.add(book);

        assertEquals(expectedList, library.listOfAllAvailableBooks());
    }

    @Test
    public void libraryKnowsHowToCheckOutABook() {
        LibraryItem book = new Book("A Game Of Thrones", "George R.R. Martin", "1996");
        ArrayList<LibraryItem> list = new ArrayList<>();
        list.add(book);
        Library library = new Library(list, new ArrayList<LibraryItem>());

        assertEquals(true, library.checkOut("A Game Of Thrones"));
    }

    @Test
    public void libraryKnowsHowToCheckInABook() {
        LibraryItem book = new Book("A Game Of Thrones", "George R.R. Martin", "1996");
        ArrayList<LibraryItem> list = new ArrayList<>();
        list.add(book);
        Library library = new Library(new ArrayList<LibraryItem>(), list);

        assertEquals(true, library.checkIn("A Game Of Thrones"));
    }

    @Test
    public void libraryKnowsHowToDisplayListOfAvailableBooks() {
        LibraryItem book = new Book("A Game Of Thrones", "George R.R. Martin", "1996");
        ArrayList<LibraryItem> list = new ArrayList<>();
        list.add(book);
        Library library = new Library(list, new ArrayList<LibraryItem>());
        ArrayList<LibraryItem> expectedList = new ArrayList<>();
        expectedList.add(book);

        assertEquals(expectedList, library.listOfAllAvailableBooks());
    }

    @Test
    public void libraryKnowsHowToCheckOutABookAndStoreItInCheckedOutBookList() {
        LibraryItem book = new Book("A Game Of Thrones", "George R.R. Martin", "1996");
        ArrayList<LibraryItem> list = new ArrayList<>();
        list.add(book);
        Library library = new Library(list, new ArrayList<LibraryItem>());

        assertEquals(true, library.checkOut("A Game Of Thrones"));
    }

    @Test
    public void libraryKnowsHowToCheckInABookAndStoreItInAvailableBookList() {
        LibraryItem book = new Book("A Game Of Thrones", "George R.R. Martin", "1996");
        ArrayList<LibraryItem> list = new ArrayList<>();
        list.add(book);
        Library library = new Library(new ArrayList<LibraryItem>(), list);

        assertEquals(true, library.checkIn("A Game Of Thrones"));
    }
}