package com.twu.biblioteca;


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
        } else if (userInput.equals("Checkout")) {
            libraryOperation = new Checkout(view, library);
        } else if (userInput.equals("Checkin")) {
            libraryOperation = new Checkin(view, library);
        } else {
            libraryOperation = new InvalidOption(view);
        }
        return libraryOperation;
    }
}
