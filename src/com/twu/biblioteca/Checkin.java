package com.twu.biblioteca;

public class Checkin implements LibraryOperation {

    View view;
    Library library;

    public Checkin(View view, Library library) {
        this.view = view;
        this.library = library;
    }

    @Override
    public void execute() {
        String book = view.getUserInput();
        if (library.checkIn(book)) {
            view.displaySuccessfulCheckinMessage();
        } else {
            view.displayUnSuccessfulCheckinMessage();
        }
    }
}
