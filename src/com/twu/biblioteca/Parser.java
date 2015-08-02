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
                libraryOperation = new Checkout(view, books, Book.class);
                break;
            case "Checkin Book":
                libraryOperation = new Checkin(view, books, Book.class);
                break;
            case "List Movies":
                libraryOperation = new ListLibraryItems(view, movies);
                break;
            case "Checkout Movie":
                libraryOperation = new Checkout(view, movies, Movie.class);
                break;
            case "Checkin Movie":
                libraryOperation = new Checkin(view, movies, Movie.class);
                break;
            default:
                libraryOperation = new InvalidOption(view);
                break;
        }
        return libraryOperation;
    }
}
