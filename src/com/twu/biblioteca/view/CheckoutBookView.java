package com.twu.biblioteca.view;


import com.twu.biblioteca.Console;
import com.twu.biblioteca.model.Section;
import com.twu.biblioteca.model.Session;

public class CheckoutBookView implements IView {

    private Console console;
    private IView userMenuView;
    private Session session;
    private Section books;
    private boolean result;

    public CheckoutBookView(Console console, IView userMenuView, Session session, Section books) {
        this.console = console;
        this.userMenuView = userMenuView;
        this.session = session;
        this.books = books;
        this.result = false;
    }

    @Override
    public void draw() {
        result = books.checkOut(console.getInput(), session.getCurrentUser());
    }

    @Override
    public IView next() {
        return null;
    }
}
