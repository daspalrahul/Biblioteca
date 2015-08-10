package com.twu.biblioteca.view;

import com.twu.biblioteca.Console;
import com.twu.biblioteca.controller.ViewDispatcher;
import com.twu.biblioteca.model.Section;
import com.twu.biblioteca.model.Session;

public class CheckinBookView implements IView {

    private Console console;
    private Session session;
    private Section books;
    private String checkinBookView;

    public CheckinBookView(Console console, Session session, Section books) {
        this.console = console;
        this.session = session;
        this.books = books;
        this.checkinBookView = "Checkin Book View";
    }

    @Override
    public void draw() {
        if (books.checkIn(console.getInput(), session.getCurrentUser()))
            console.printOutput("Thank you for returning the book.");
        else
            console.printOutput("That is not a valid book to return.");
    }

    @Override
    public IView next(ViewDispatcher viewDispatcher) {
        return viewDispatcher.userMenuDispatch(checkinBookView);
    }
}
