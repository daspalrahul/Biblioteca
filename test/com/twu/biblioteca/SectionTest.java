package com.twu.biblioteca;


import org.junit.Test;
import java.util.ArrayList;

import static org.junit.Assert.*;

public class SectionTest {

    @Test
    public void libraryCanReturnAListOfBooksItHas() {
        LibraryItem book = new Book("A Game Of Thrones", "George R.R. Martin", "1996");
        ArrayList<LibraryItem> list = new ArrayList<>();
        list.add(book);
        Section section = new Section(list, new ArrayList<LibraryItem>());
        ArrayList<LibraryItem> expectedList = new ArrayList<>();
        expectedList.add(book);

        assertEquals(expectedList, section.listOfAllAvailableLibraryItems());
    }

    @Test
    public void libraryKnowsHowToCheckOutABook() {
        LibraryItem book = new Book("A Game Of Thrones", "George R.R. Martin", "1996");
        ArrayList<LibraryItem> list = new ArrayList<>();
        list.add(book);
        Section section = new Section(list, new ArrayList<LibraryItem>());

        assertEquals(true, section.checkOut("A Game Of Thrones"));
    }

    @Test
    public void libraryKnowsHowToCheckInABook() {
        LibraryItem book = new Book("A Game Of Thrones", "George R.R. Martin", "1996");
        ArrayList<LibraryItem> list = new ArrayList<>();
        list.add(book);
        Section section = new Section(new ArrayList<LibraryItem>(), list);

        assertEquals(true, section.checkIn("A Game Of Thrones"));
    }

    @Test
    public void libraryKnowsHowToDisplayListOfAvailableBooks() {
        LibraryItem book = new Book("A Game Of Thrones", "George R.R. Martin", "1996");
        ArrayList<LibraryItem> list = new ArrayList<>();
        list.add(book);
        Section section = new Section(list, new ArrayList<LibraryItem>());
        ArrayList<LibraryItem> expectedList = new ArrayList<>();
        expectedList.add(book);

        assertEquals(expectedList, section.listOfAllAvailableLibraryItems());
    }

    @Test
    public void libraryKnowsHowToCheckOutABookAndStoreItInCheckedOutBookList() {
        LibraryItem book = new Book("A Game Of Thrones", "George R.R. Martin", "1996");
        ArrayList<LibraryItem> list = new ArrayList<>();
        list.add(book);
        Section section = new Section(list, new ArrayList<LibraryItem>());

        assertEquals(true, section.checkOut("A Game Of Thrones"));
    }

    @Test
    public void libraryKnowsHowToCheckInABookAndStoreItInAvailableBookList() {
        LibraryItem book = new Book("A Game Of Thrones", "George R.R. Martin", "1996");
        ArrayList<LibraryItem> list = new ArrayList<>();
        list.add(book);
        Section section = new Section(new ArrayList<LibraryItem>(), list);

        assertEquals(true, section.checkIn("A Game Of Thrones"));
    }
}