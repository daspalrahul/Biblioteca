package com.twu.biblioteca.controller;


import com.twu.biblioteca.model.Section;
import com.twu.biblioteca.view.View;

public class Parser {

    private View view;
    private LoginAuthenticator loginAuthenticator;

    public Parser(View view, LoginAuthenticator loginAuthenticator) {
        this.view = view;
        this.loginAuthenticator = loginAuthenticator;
    }

    public com.twu.biblioteca.operation.LibraryOperation convertIntoLibraryOperation(String userInput, Section books, Section movies) {
        com.twu.biblioteca.operation.LibraryOperation libraryOperation;
        switch (userInput) {
            case "List Books":
                libraryOperation = new com.twu.biblioteca.operation.ListLibraryItems(view, books);
                break;
            case "Quit":
                libraryOperation = new com.twu.biblioteca.operation.Quit();
                break;
            case "Checkout Book":
                libraryOperation = new com.twu.biblioteca.operation.Checkout(view, books, com.twu.biblioteca.model.Book.class);
                break;
            case "Checkin Book":
                libraryOperation = new com.twu.biblioteca.operation.Checkin(view, books, com.twu.biblioteca.model.Book.class);
                break;
            case "List Movies":
                libraryOperation = new com.twu.biblioteca.operation.ListLibraryItems(view, movies);
                break;
            case "Checkout Movie":
                libraryOperation = new com.twu.biblioteca.operation.Checkout(view, movies, com.twu.biblioteca.model.Movie.class);
                break;
            case "Checkin Movie":
                libraryOperation = new com.twu.biblioteca.operation.Checkin(view, movies, com.twu.biblioteca.model.Movie.class);
                break;
            case "Login":
                libraryOperation = new com.twu.biblioteca.operation.Login(view, loginAuthenticator);
                break;
            case "Logout":
                libraryOperation = new com.twu.biblioteca.operation.Logout(view);
                break;
            case "List CheckedOut Books":
                libraryOperation = new com.twu.biblioteca.operation.ListCheckedOutLibraryItems(view, books);
                break;
            case "List CheckedOut Movies":
                libraryOperation = new com.twu.biblioteca.operation.ListCheckedOutLibraryItems(view, movies);
                break;
            default:
                libraryOperation = new com.twu.biblioteca.operation.InvalidOption(view);
                break;
        }
        return libraryOperation;
    }
}
