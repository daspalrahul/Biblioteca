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
        String libraryItem = view.getUserInput();
        if (section.checkIn(libraryItem)) {
            view.displaySuccessfulCheckinMessage();
        } else {
            view.displayUnSuccessfulCheckinMessage();
        }
    }
}
