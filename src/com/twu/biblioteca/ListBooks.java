package com.twu.biblioteca;

import java.util.ArrayList;

public class ListBooks implements LibraryOperation {
    private View view;
    private ArrayList<String[]> library;

    public ListBooks(View view, ArrayList<String[]> library) {
        this.view = view;
        this.library = library;
    }

    @Override
    public void execute() {
        view.displayListOfBooks(library);
    }
}
