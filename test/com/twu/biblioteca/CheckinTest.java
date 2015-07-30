package com.twu.biblioteca;

import org.junit.Test;
import org.mockito.Mockito;
import java.util.ArrayList;
import java.util.Arrays;

public class CheckinTest {

    @Test
    public void checkinIsUnsuccessfulWhenBookDoesNotBelongToLibary() {
        String[] book = {"A Game Of Thrones", "George R.R. Martin", "1996", "available"};
        ArrayList<String[]> list = new ArrayList<>(Arrays.<String[]>asList(book));
        Library library = new Library(list);
        View view = Mockito.mock(View.class);
        Checkout checkout = new Checkout(view, library);
    }
}