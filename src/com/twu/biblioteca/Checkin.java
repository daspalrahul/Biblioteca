package com.twu.biblioteca;


public class Checkin implements LibraryOperation {

    View view;
    Section section;

    public Checkin(View view, Section section) {
        this.view = view;
        this.section = section;
    }

    @Override
    public void execute() {
        String book = view.getUserInput();
        if (section.checkIn(book)) {
            view.displaySuccessfulCheckinMessage();
        } else {
            view.displayUnSuccessfulCheckinMessage();
        }
    }
}
