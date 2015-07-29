package com.twu.biblioteca;

import java.util.ArrayList;

public class Parser {

    private View view;

    public Parser(View view) {
        this.view = view;
    }

    public LibraryOperation convertIntoLibraryOperation(String userInput, Library library) {
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
