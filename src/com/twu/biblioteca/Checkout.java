package com.twu.biblioteca;


public class Checkout implements LibraryOperation {

    private View view;
    private Section section;
    private Class<?> requestType;

    public Checkout(View view, Section section, Class<?> requestType) {
        this.view = view;
        this.section = section;
        this.requestType = requestType;
    }

    @Override
    public void execute() {
        String requestedLibraryItem = view.getUserInput();
        if (section.checkOut(requestedLibraryItem, view.getUser())) {
            view.displaySuccessfulCheckOutMessage(requestType);
        }
        else {
            view.displayUnSuccessfulCheckOutMessage(requestType);
        }
    }
}
