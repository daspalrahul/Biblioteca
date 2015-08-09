package com.twu.biblioteca.view;


import com.twu.biblioteca.Console;
import com.twu.biblioteca.controller.UserMenuDispatcher;
import com.twu.biblioteca.model.Section;
import com.twu.biblioteca.model.Session;

public class CheckoutBookView implements IView {

    private Console console;
    private IView userMenuView;
    private Session session;
    private Section books;

    public CheckoutBookView(Console console, IView userMenuView, Session session, Section books) {
        this.console = console;
        this.userMenuView = userMenuView;
        this.session = session;
        this.books = books;
    }

    @Override
    public void draw() {
        if (books.checkOut(console.getInput(), session.getCurrentUser()))
            console.printOutput("Thank you! Enjoy the book");
        else
            console.printOutput("That book is not available.");
    }

    @Override
    public IView next(UserMenuDispatcher userMenuDispatcher) {
        return userMenuView;
    }
}
