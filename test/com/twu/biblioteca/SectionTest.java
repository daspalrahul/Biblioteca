package com.twu.biblioteca;


import org.junit.Test;
import org.mockito.Mockito;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.*;

public class SectionTest {

    @Test
    public void libraryCanReturnAListOfBooksItHas() {
        LibraryItem book = new Book("A Game Of Thrones", "George R.R. Martin", "1996");
        ArrayList<LibraryItem> list = new ArrayList<>();
        list.add(book);
        User user = Mockito.mock(User.class);
        Map<LibraryItem, User> map = new HashMap<>();
        map.put(book, user);
        Section section = new Section(list, new HashMap<LibraryItem, User>(){});
        ArrayList<LibraryItem> expectedList = new ArrayList<>();
        expectedList.add(book);

        assertEquals(expectedList, section.listOfAllAvailableLibraryItems());
    }

    @Test
    public void libraryKnowsHowToCheckOutABook() {
        LibraryItem book = new Book("A Game Of Thrones", "George R.R. Martin", "1996");
        ArrayList<LibraryItem> list = new ArrayList<>();
        list.add(book);
        User user = Mockito.mock(User.class);
        Map<LibraryItem, User> map = new HashMap<>();
        map.put(book, user);
        Section section = new Section(list, new HashMap<LibraryItem, User>(){});

        assertEquals(true, section.checkOut("A Game Of Thrones", user));
    }

    @Test
    public void libraryKnowsHowToCheckInABook() {
        LibraryItem book = new Book("A Game Of Thrones", "George R.R. Martin", "1996");
        ArrayList<LibraryItem> list = new ArrayList<>();
        list.add(book);
        User user = Mockito.mock(User.class);
        Map<LibraryItem, User> map = new HashMap<>();
        map.put(book, user);
        Section section = new Section(new ArrayList<LibraryItem>(), map);

        assertEquals(true, section.checkIn("A Game Of Thrones", user));
    }

    @Test
    public void libraryKnowsHowToDisplayListOfAvailableBooks() {
        LibraryItem book = new Book("A Game Of Thrones", "George R.R. Martin", "1996");
        ArrayList<LibraryItem> list = new ArrayList<>();
        list.add(book);
        User user = Mockito.mock(User.class);
        Map<LibraryItem, User> map = new HashMap<>();
        map.put(book, user);
        Section section = new Section(list, new HashMap<LibraryItem, User>(){});
        ArrayList<LibraryItem> expectedList = new ArrayList<>();
        expectedList.add(book);

        assertEquals(expectedList, section.listOfAllAvailableLibraryItems());
    }

    @Test
    public void libraryKnowsHowToCheckOutABookAndStoreItInCheckedOutBookList() {
        LibraryItem book = new Book("A Game Of Thrones", "George R.R. Martin", "1996");
        ArrayList<LibraryItem> list = new ArrayList<>();
        list.add(book);
        User user = Mockito.mock(User.class);
        Map<LibraryItem, User> map = new HashMap<>();
        map.put(book, user);
        Section section = new Section(list, new HashMap<LibraryItem, User>(){});

        assertEquals(true, section.checkOut("A Game Of Thrones", user));
    }

    @Test
    public void libraryKnowsHowToCheckInABookAndStoreItInAvailableBookList() {
        LibraryItem book = new Book("A Game Of Thrones", "George R.R. Martin", "1996");
        ArrayList<LibraryItem> list = new ArrayList<>();
        list.add(book);
        User user = Mockito.mock(User.class);
        Map<LibraryItem, User> map = new HashMap<>();
        map.put(book, user);
        Section section = new Section(new ArrayList<LibraryItem>(), map);

        assertEquals(true, section.checkIn("A Game Of Thrones", user));
    }

    @Test
    public void libraryKnowsHowToDisplayInformationRelatedToCheckedOutBook() {
        LibraryItem book = Mockito.mock(Book.class);
        User user = Mockito.mock(User.class);
        Map<LibraryItem, User> map = new HashMap<>();
        map.put(book, user);
        Section section = new Section(new ArrayList<LibraryItem>(), map);

        Mockito.when(book.toString()).thenReturn("book");
        Mockito.when(user.userInformation()).thenReturn("user");

        assertEquals("book    user\n", section.listOfAllCheckedOutLIbraryItems());
    }
}
