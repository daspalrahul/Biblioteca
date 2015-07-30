package com.twu.biblioteca;


public class ListBooks implements LibraryOperation {

    private View view;
    private Library library;

    public ListBooks(View view, Library library) {
        this.view = view;
        this.library = library;
    }

    @Override
    public void execute() {
        view.displayListOfAllBooks(library);
    }
}
