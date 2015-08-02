package com.twu.biblioteca;


public class Parser {

    private View view;

    public Parser(View view) {
        this.view = view;
    }

    public LibraryOperation convertIntoLibraryOperation(String userInput, Section books, Section movies) {
        LibraryOperation libraryOperation;
        switch (userInput) {
            case "List Books":
                libraryOperation = new ListLibraryItems(view, books);
                break;
            case "Quit":
                libraryOperation = new Quit();
                break;
            case "Checkout Book":
                libraryOperation = new Checkout(view, books);
                break;
            case "Checkin Book":
                libraryOperation = new Checkin(view, books);
                break;
            case "List Movies":
                libraryOperation = new ListLibraryItems(view, movies);
                break;
            case "Checkout Movie":
                libraryOperation = new Checkout(view, movies);
                break;
            case "Checkin Movie":
                libraryOperation = new Checkin(view, movies);
                break;
            default:
                libraryOperation = new InvalidOption(view);
                break;
        }
        return libraryOperation;
    }
}
