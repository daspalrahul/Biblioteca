package com.twu.biblioteca;


public class Checkout implements LibraryOperation {

    private View view;
    private Section section;
    public Checkout(View view, Section section) {
        this.view = view;
        this.section = section;
    }

    @Override
    public void execute() {
        String requestedBook = view.getUserInput();
        if (section.checkOut(requestedBook)) {
            view.displaySuccessfulCheckOutMessage();
        }
        else {
            view.displayUnSuccessfulCheckOutMessage();
        }
    }
}
