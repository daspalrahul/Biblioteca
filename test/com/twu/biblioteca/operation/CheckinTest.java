package com.twu.biblioteca.operation;


import org.junit.Test;
import org.mockito.Mockito;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class CheckinTest {

    @Test
    public void checkinIsSuccessfulWhenBookBelongsToTheLibary() {
        com.twu.biblioteca.model.LibraryItem book = new com.twu.biblioteca.model.Book("A Game Of Thrones", "George R.R. Martin", "1996");
        Map<com.twu.biblioteca.model.LibraryItem, com.twu.biblioteca.model.User> list = new HashMap<>();
        com.twu.biblioteca.model.User user = Mockito.mock(com.twu.biblioteca.model.User.class);
        list.put(book, user);
        com.twu.biblioteca.model.Section section = new com.twu.biblioteca.model.Section(new ArrayList<com.twu.biblioteca.model.LibraryItem>(), list);
        com.twu.biblioteca.view.View view = Mockito.mock(com.twu.biblioteca.view.View.class);
        com.twu.biblioteca.operation.Checkin checkin = new com.twu.biblioteca.operation.Checkin(view, section, com.twu.biblioteca.model.Book.class);

        Mockito.when(view.getUser()).thenReturn(user);
        Mockito.when(view.getUserInput()).thenReturn("A Game Of Thrones");
        checkin.execute();

        Mockito.verify(view).displaySuccessfulCheckinMessage(com.twu.biblioteca.model.Book.class);
    }
}