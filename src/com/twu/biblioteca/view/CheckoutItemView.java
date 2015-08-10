package com.twu.biblioteca.view;


import com.twu.biblioteca.Console;
import com.twu.biblioteca.controller.ViewDispatcher;
import com.twu.biblioteca.model.Section;
import com.twu.biblioteca.model.Session;

abstract public class CheckoutItemView implements IView {

    private Console console;
    private Session session;
    private Section books;
    protected String itemName;

    public CheckoutItemView(Console console, Session session, Section books) {
        this.console = console;
        this.session = session;
        this.books = books;
    }

    @Override
    public void draw() {
        if (books.checkOut(console.getInput(), session.getCurrentUser()))
            console.printOutput("Thank you! Enjoy the " + itemName + "");
        else
            console.printOutput("That " + itemName + " is not available.");
    }

    @Override
    public IView next(ViewDispatcher viewDispatcher) {
        return viewDispatcher.userMenuDispatch(this.toString());
    }

    @Override
    abstract public String toString();
}
