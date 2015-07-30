package com.twu.biblioteca;


import org.junit.Test;
import org.mockito.Mockito;
import java.util.ArrayList;
import java.util.Arrays;

public class CheckinTest {

    @Test
    public void checkinIsSuccessfulWhenBookBelongsToTheLibary() {
        String[] book = {"A Game Of Thrones", "George R.R. Martin", "1996", "unavailable"};
        ArrayList<String[]> list = new ArrayList<>(Arrays.<String[]>asList(book));
        Library library = new Library(list, new ArrayList<String[]>());
        View view = Mockito.mock(View.class);
        Checkin checkin = new Checkin(view, library);

        Mockito.when(view.getUserInput()).thenReturn("A Game Of Thrones");
        checkin.execute();

        Mockito.verify(view).displaySuccessfulCheckinMessage();
    }
}