package com.twu.biblioteca.view;


import com.twu.biblioteca.Console;
import com.twu.biblioteca.controller.ViewDispatcher;
import com.twu.biblioteca.model.Section;
import com.twu.biblioteca.model.Session;

public class CheckoutBookView implements IView {

    private Console console;
    private Session session;
    private Section books;
    private String checkoutBookView;

    public CheckoutBookView(Console console, Session session, Section books) {
        this.console = console;
        this.session = session;
        this.books = books;
        this.checkoutBookView = "Checkout Book View";
    }

    @Override
    public void draw() {
        if (books.checkOut(console.getInput(), session.getCurrentUser()))
            console.printOutput("Thank you! Enjoy the book");
        else
            console.printOutput("That book is not available.");
    }

    @Override
    public IView next(ViewDispatcher viewDispatcher) {
        return viewDispatcher.userMenuDispatch(checkoutBookView);
    }
}
