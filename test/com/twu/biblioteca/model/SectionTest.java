package com.twu.biblioteca.model;


import org.junit.Test;
import org.mockito.Mockito;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.*;

public class SectionTest {

    @Test
    public void libraryCanReturnAListOfBooksItHas() {
        com.twu.biblioteca.model.LibraryItem book = new com.twu.biblioteca.model.Book("A Game Of Thrones", "George R.R. Martin", "1996");
        ArrayList<com.twu.biblioteca.model.LibraryItem> list = new ArrayList<>();
        list.add(book);
        com.twu.biblioteca.model.User user = Mockito.mock(com.twu.biblioteca.model.User.class);
        Map<com.twu.biblioteca.model.LibraryItem, com.twu.biblioteca.model.User> map = new HashMap<>();
        map.put(book, user);
        com.twu.biblioteca.model.Section section = new com.twu.biblioteca.model.Section(list, new HashMap<com.twu.biblioteca.model.LibraryItem, com.twu.biblioteca.model.User>(){});
        ArrayList<com.twu.biblioteca.model.LibraryItem> expectedList = new ArrayList<>();
        expectedList.add(book);

        assertEquals(expectedList, section.listOfAllAvailableLibraryItems());
    }

    @Test
    public void libraryKnowsHowToCheckOutABook() {
        com.twu.biblioteca.model.LibraryItem book = new com.twu.biblioteca.model.Book("A Game Of Thrones", "George R.R. Martin", "1996");
        ArrayList<com.twu.biblioteca.model.LibraryItem> list = new ArrayList<>();
        list.add(book);
        com.twu.biblioteca.model.User user = Mockito.mock(com.twu.biblioteca.model.User.class);
        Map<com.twu.biblioteca.model.LibraryItem, com.twu.biblioteca.model.User> map = new HashMap<>();
        map.put(book, user);
        com.twu.biblioteca.model.Section section = new com.twu.biblioteca.model.Section(list, new HashMap<com.twu.biblioteca.model.LibraryItem, com.twu.biblioteca.model.User>(){});

        assertEquals(true, section.checkOut("A Game Of Thrones", user));
    }

    @Test
    public void libraryKnowsHowToCheckInABook() {
        com.twu.biblioteca.model.LibraryItem book = new com.twu.biblioteca.model.Book("A Game Of Thrones", "George R.R. Martin", "1996");
        ArrayList<com.twu.biblioteca.model.LibraryItem> list = new ArrayList<>();
        list.add(book);
        com.twu.biblioteca.model.User user = Mockito.mock(com.twu.biblioteca.model.User.class);
        Map<com.twu.biblioteca.model.LibraryItem, com.twu.biblioteca.model.User> map = new HashMap<>();
        map.put(book, user);
        com.twu.biblioteca.model.Section section = new com.twu.biblioteca.model.Section(new ArrayList<com.twu.biblioteca.model.LibraryItem>(), map);

        assertEquals(true, section.checkIn("A Game Of Thrones", user));
    }

    @Test
    public void libraryKnowsHowToDisplayListOfAvailableBooks() {
        com.twu.biblioteca.model.LibraryItem book = new com.twu.biblioteca.model.Book("A Game Of Thrones", "George R.R. Martin", "1996");
        ArrayList<com.twu.biblioteca.model.LibraryItem> list = new ArrayList<>();
        list.add(book);
        com.twu.biblioteca.model.User user = Mockito.mock(com.twu.biblioteca.model.User.class);
        Map<com.twu.biblioteca.model.LibraryItem, com.twu.biblioteca.model.User> map = new HashMap<>();
        map.put(book, user);
        com.twu.biblioteca.model.Section section = new com.twu.biblioteca.model.Section(list, new HashMap<com.twu.biblioteca.model.LibraryItem, com.twu.biblioteca.model.User>(){});
        ArrayList<com.twu.biblioteca.model.LibraryItem> expectedList = new ArrayList<>();
        expectedList.add(book);

        assertEquals(expectedList, section.listOfAllAvailableLibraryItems());
    }

    @Test
    public void libraryKnowsHowToCheckOutABookAndStoreItInCheckedOutBookList() {
        com.twu.biblioteca.model.LibraryItem book = new com.twu.biblioteca.model.Book("A Game Of Thrones", "George R.R. Martin", "1996");
        ArrayList<com.twu.biblioteca.model.LibraryItem> list = new ArrayList<>();
        list.add(book);
        com.twu.biblioteca.model.User user = Mockito.mock(com.twu.biblioteca.model.User.class);
        Map<com.twu.biblioteca.model.LibraryItem, com.twu.biblioteca.model.User> map = new HashMap<>();
        map.put(book, user);
        com.twu.biblioteca.model.Section section = new com.twu.biblioteca.model.Section(list, new HashMap<com.twu.biblioteca.model.LibraryItem, com.twu.biblioteca.model.User>(){});

        assertEquals(true, section.checkOut("A Game Of Thrones", user));
    }

    @Test
    public void libraryKnowsHowToCheckInABookAndStoreItInAvailableBookList() {
        com.twu.biblioteca.model.LibraryItem book = new com.twu.biblioteca.model.Book("A Game Of Thrones", "George R.R. Martin", "1996");
        ArrayList<com.twu.biblioteca.model.LibraryItem> list = new ArrayList<>();
        list.add(book);
        com.twu.biblioteca.model.User user = Mockito.mock(com.twu.biblioteca.model.User.class);
        Map<com.twu.biblioteca.model.LibraryItem, com.twu.biblioteca.model.User> map = new HashMap<>();
        map.put(book, user);
        com.twu.biblioteca.model.Section section = new com.twu.biblioteca.model.Section(new ArrayList<com.twu.biblioteca.model.LibraryItem>(), map);

        assertEquals(true, section.checkIn("A Game Of Thrones", user));
    }

    @Test
    public void libraryKnowsHowToDisplayInformationRelatedToCheckedOutBook() {
        com.twu.biblioteca.model.LibraryItem book = Mockito.mock(com.twu.biblioteca.model.Book.class);
        com.twu.biblioteca.model.User user = Mockito.mock(com.twu.biblioteca.model.User.class);
        Map<com.twu.biblioteca.model.LibraryItem, com.twu.biblioteca.model.User> map = new HashMap<>();
        map.put(book, user);
        com.twu.biblioteca.model.Section section = new com.twu.biblioteca.model.Section(new ArrayList<com.twu.biblioteca.model.LibraryItem>(), map);

        Mockito.when(book.toString()).thenReturn("book");
        Mockito.when(user.userInformation()).thenReturn("user");

        assertEquals("book    user\n", section.listOfAllCheckedOutLIbraryItems());
    }
}
