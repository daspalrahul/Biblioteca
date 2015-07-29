package com.twu.biblioteca;

public class Checkout implements LibraryOperation {

    private View view;
    private Library library;
    public Checkout(View view, Library library) {
        this.view = view;
        this.library = library;
    }

    @Override
    public void execute() {
        String requestedBook = view.getUserInput();
        if (library.checkOut(requestedBook)) {
            view.displaySuccessfulCheckOutMessage();
        }
        else {
            view.displayUnSuccessfulCheckOutMessage();
        }
    }
}
