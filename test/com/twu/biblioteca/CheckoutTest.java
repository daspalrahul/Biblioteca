package com.twu.biblioteca;

import org.junit.Test;
import org.mockito.Mockito;
import java.util.ArrayList;
import java.util.Arrays;

public class CheckoutTest {

    @Test
    public void checkoutCanCheckoutAGameOfThronesFromLibraryThatContainsTheSame() {
        String[] book = {"A Game Of Thrones", "George R.R. Martin", "1996", "available"};
        ArrayList<String[]> list = new ArrayList<>(Arrays.<String[]>asList(book));
        Library library = new Library(list, new ArrayList<String[]>());
        View view = Mockito.mock(View.class);
        Checkout checkout = new Checkout(view, library);

        Mockito.when(view.getUserInput()).thenReturn("A Game Of Thrones");
        checkout.execute();

        Mockito.verify(view).displaySuccessfulCheckOutMessage();
    }

    @Test
    public void checkoutCanNotCheckoutAGameOfThronesFromLibraryThatDoesNotContainsTheSame() {
        String[] book = {"A Game Of Thrones", "George R.R. Martin", "1996", "available"};
        ArrayList<String[]> list = new ArrayList<>(Arrays.<String[]>asList(book));
        Library library = new Library(list, new ArrayList<String[]>());
        View view = Mockito.mock(View.class);
        Checkout checkout = new Checkout(view, library);

        Mockito.when(view.getUserInput()).thenReturn("Cupcakes and Tiaras");
        checkout.execute();

        Mockito.verify(view).displayUnSuccessfulCheckOutMessage();
    }
}