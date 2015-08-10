package com.twu.biblioteca.view;


import com.twu.biblioteca.Console;
import com.twu.biblioteca.model.Section;
import com.twu.biblioteca.model.Session;


public class CheckoutMovieView extends CheckoutItemView implements IView {


    public CheckoutMovieView(Console console, Session session, Section books) {
        super(console, session, books);
        itemName = "movie";
    }

    @Override
    public String toString() {
        return "Checkout Movie View";
    }
}
