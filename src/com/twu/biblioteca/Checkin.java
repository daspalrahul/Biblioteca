package com.twu.biblioteca;


public class Checkin implements LibraryOperation {

    private View view;
    private Section section;
    private Class<?> requestType;

    public Checkin(View view, Section section, Class<?> requestType) {
        this.view = view;
        this.section = section;
        this.requestType = requestType;
    }

    @Override
    public void execute() {
        String libraryItem = view.getUserInput();
        if (section.checkIn(libraryItem, view.getUser())) {
            view.displaySuccessfulCheckinMessage(requestType);
        } else {
            view.displayUnSuccessfulCheckinMessage(requestType);
        }
    }
}
