package com.twu.biblioteca;


import org.junit.Test;
import org.mockito.Mockito;
import java.util.ArrayList;

public class CheckoutTest {

    @Test
    public void checkoutCanCheckoutAGameOfThronesFromLibraryThatContainsTheSame() {
        LibraryItem book = new Book("A Game Of Thrones", "George R.R. Martin", "1996");
        ArrayList<LibraryItem> list = new ArrayList<>();
        list.add(book);
        Section section = new Section(list, new ArrayList<LibraryItem>());
        View view = Mockito.mock(View.class);
        Checkout checkout = new Checkout(view, section, Book.class);

        Mockito.when(view.getUserInput()).thenReturn("A Game Of Thrones");
        checkout.execute();

        Mockito.verify(view).displaySuccessfulCheckOutMessage(Book.class);
    }

    @Test
    public void checkoutCanNotCheckoutAGameOfThronesFromLibraryThatDoesNotContainsTheSame() {
        LibraryItem book = new Book("A Game Of Thrones", "George R.R. Martin", "1996");
        ArrayList<LibraryItem> list = new ArrayList<>();
        list.add(book);
        Section section = new Section(list, new ArrayList<LibraryItem>());
        View view = Mockito.mock(View.class);
        Checkout checkout = new Checkout(view, section, Book.class);

        Mockito.when(view.getUserInput()).thenReturn("Cupcakes and Tiaras");
        checkout.execute();

        Mockito.verify(view).displayUnSuccessfulCheckOutMessage(Book.class);
    }
}