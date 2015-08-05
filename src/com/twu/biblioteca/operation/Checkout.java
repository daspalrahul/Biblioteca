package com.twu.biblioteca.operation;


import com.twu.biblioteca.model.Section;
import com.twu.biblioteca.view.View;

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
