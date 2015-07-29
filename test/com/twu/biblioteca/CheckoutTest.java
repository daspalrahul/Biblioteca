package com.twu.biblioteca;

import org.junit.Test;
import org.mockito.Mockito;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.Assert.*;

public class CheckoutTest {

    @Test
    public void checkoutCanCheckoutAGameOfThronesFromLibraryThatContainsTheSame() {
        String[] book = {"A Game Of Thrones", "George R.R. Martin", "1996", "available"};
        ArrayList<String[]> list = new ArrayList<>(Arrays.<String[]>asList(book));
        Library library = new Library(list);
        View view = Mockito.mock(View.class);
        Checkout checkout = new Checkout(view, library);

        Mockito.when(view.getUserInput()).thenReturn("A Game Of Thrones");
        checkout.execute();

        Mockito.verify(view).displaySuccessfulCheckOutMessage();
    }
}