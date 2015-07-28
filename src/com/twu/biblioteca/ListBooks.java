package com.twu.biblioteca;

import java.util.ArrayList;

public class ListBooks extends LibraryOperation {
    public void execute(View view, ArrayList<String[]> library) {
        view.displayListOfBooks(library);
    }
}
