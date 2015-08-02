package com.twu.biblioteca;


public class ListLibraryItems implements LibraryOperation {

    private View view;
    private Section section;

    public ListLibraryItems(View view, Section section) {
        this.view = view;
        this.section = section;
    }

    @Override
    public void execute() {
        view.displayListOfAllBooks(section);
    }
}
