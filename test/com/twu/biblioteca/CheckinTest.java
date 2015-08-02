package com.twu.biblioteca;


import org.junit.Test;
import org.mockito.Mockito;
import java.util.ArrayList;

public class CheckinTest {

    @Test
    public void checkinIsSuccessfulWhenBookBelongsToTheLibary() {
        LibraryItem book = new Book("A Game Of Thrones", "George R.R. Martin", "1996");
        ArrayList<LibraryItem> list = new ArrayList<>();
        list.add(book);
        Section section = new Section(new ArrayList<LibraryItem>(), list);
        View view = Mockito.mock(View.class);
        Checkin checkin = new Checkin(view, section, Book.class);

        Mockito.when(view.getUserInput()).thenReturn("A Game Of Thrones");
        checkin.execute();

        Mockito.verify(view).displaySuccessfulCheckinMessage(Book.class);
    }
}