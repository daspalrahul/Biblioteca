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

    }
}
