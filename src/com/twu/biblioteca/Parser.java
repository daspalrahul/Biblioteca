package com.twu.biblioteca;

import java.util.ArrayList;

public class Parser {

    private View view;
    ArrayList<String[]> library;

    public Parser(View view, ArrayList<String[]> library) {
        this.view = view;
        this.library = library;
    }

    public LibraryOperation convertIntoLibraryOperation(String userInput) {
        LibraryOperation libraryOperation;
        if (userInput.equals("List Books")) {
            libraryOperation = new ListBooks(view, library);
        } else if (userInput.equals("Quit")) {
            libraryOperation = new Quit();
        } else {
            libraryOperation = new InvalidOption(view);
        }
        return libraryOperation;
    }
}
