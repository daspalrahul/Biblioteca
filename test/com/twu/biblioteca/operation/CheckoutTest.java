package com.twu.biblioteca.operation;


import org.junit.Test;
import org.mockito.Mockito;
import java.util.ArrayList;
import java.util.HashMap;

public class CheckoutTest {

    @Test
    public void checkoutCanCheckoutAGameOfThronesFromLibraryThatContainsTheSame() {
        com.twu.biblioteca.model.LibraryItem book = new com.twu.biblioteca.model.Book("A Game Of Thrones", "George R.R. Martin", "1996");
        ArrayList<com.twu.biblioteca.model.LibraryItem> list = new ArrayList<>();
        list.add(book);
        com.twu.biblioteca.model.Section section = new com.twu.biblioteca.model.Section(list, new HashMap<com.twu.biblioteca.model.LibraryItem, com.twu.biblioteca.model.User>());
        com.twu.biblioteca.view.View view = Mockito.mock(com.twu.biblioteca.view.View.class);
        com.twu.biblioteca.operation.Checkout checkout = new com.twu.biblioteca.operation.Checkout(view, section, com.twu.biblioteca.model.Book.class);

        Mockito.when(view.getUserInput()).thenReturn("A Game Of Thrones");
        checkout.execute();

        Mockito.verify(view).displaySuccessfulCheckOutMessage(com.twu.biblioteca.model.Book.class);
    }

    @Test
    public void checkoutCanNotCheckoutAGameOfThronesFromLibraryThatDoesNotContainsTheSame() {
        com.twu.biblioteca.model.LibraryItem book = new com.twu.biblioteca.model.Book("A Game Of Thrones", "George R.R. Martin", "1996");
        ArrayList<com.twu.biblioteca.model.LibraryItem> list = new ArrayList<>();
        list.add(book);
        com.twu.biblioteca.model.Section section = new com.twu.biblioteca.model.Section(list, new HashMap<com.twu.biblioteca.model.LibraryItem, com.twu.biblioteca.model.User>());
        com.twu.biblioteca.view.View view = Mockito.mock(com.twu.biblioteca.view.View.class);
        com.twu.biblioteca.operation.Checkout checkout = new com.twu.biblioteca.operation.Checkout(view, section, com.twu.biblioteca.model.Book.class);

        Mockito.when(view.getUserInput()).thenReturn("Cupcakes and Tiaras");
        checkout.execute();

        Mockito.verify(view).displayUnSuccessfulCheckOutMessage(com.twu.biblioteca.model.Book.class);
    }
}