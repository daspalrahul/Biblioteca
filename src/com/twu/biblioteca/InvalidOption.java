package com.twu.biblioteca;


public class InvalidOption implements LibraryOperation {

    private View view;

    public InvalidOption(View view) {
        this.view = view;
    }

    @Override
    public void execute() {
        view.displayInvalidCommandMessage();
    }
}
