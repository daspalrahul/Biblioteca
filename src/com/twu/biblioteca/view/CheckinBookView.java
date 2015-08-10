package com.twu.biblioteca.view;


import com.twu.biblioteca.Console;
import com.twu.biblioteca.model.Section;
import com.twu.biblioteca.model.Session;


public class CheckinBookView extends CheckinItemView implements IView {

    public CheckinBookView(Console console, Session session, Section books) {
        super(console, session, books);
        itemName = "book";
    }

    @Override
    public String toString() {
        return "Checkin Book View";
    }
}
