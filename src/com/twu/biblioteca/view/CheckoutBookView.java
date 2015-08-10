package com.twu.biblioteca.view;


import com.twu.biblioteca.Console;
import com.twu.biblioteca.model.Section;
import com.twu.biblioteca.model.Session;


public class CheckoutBookView extends CheckoutItemView implements IView {


    public CheckoutBookView(Console console, Session session, Section books) {
        super(console, session, books);
        itemName = "book";
    }

    @Override
    public String toString() {
        return "Checkout Book View";
    }
}
