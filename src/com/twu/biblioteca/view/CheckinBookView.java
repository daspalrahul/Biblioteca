package com.twu.biblioteca.view;

import com.twu.biblioteca.Console;
import com.twu.biblioteca.controller.UserMenuDispatcher;
import com.twu.biblioteca.model.Section;
import com.twu.biblioteca.model.Session;

public class CheckinBookView implements IView {

    private Console console;
    private IView userMenuView;
    private Session session;
    private Section books;

    public CheckinBookView(Console console, IView userMenuView, Session session, Section books) {
        this.console = console;
        this.userMenuView = userMenuView;
        this.session = session;
        this.books = books;
    }

    @Override
    public void draw() {
        if (books.checkIn(console.getInput(), session.getCurrentUser()))
            console.printOutput("Thank you for returning the book.");
        else
            console.printOutput("That is not a valid book to return.");
    }

    @Override
    public IView next(UserMenuDispatcher userMenuDispatcher) {
        return userMenuView;
    }
}
