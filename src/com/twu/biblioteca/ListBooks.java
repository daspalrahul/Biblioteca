package com.twu.biblioteca;


public class ListBooks implements LibraryOperation {

    private View view;
    private Section section;

    public ListBooks(View view, Section section) {
        this.view = view;
        this.section = section;
    }

    @Override
    public void execute() {
        view.displayListOfAllBooks(section);
    }
}
