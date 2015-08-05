package com.twu.biblioteca.controller;


import com.twu.biblioteca.model.Movie;
import com.twu.biblioteca.model.Section;
import com.twu.biblioteca.operation.*;
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
                libraryOperation = new ListLibraryItems(view, books);
                break;
            case "Quit":
                libraryOperation = new Quit();
                break;
            case "Checkout Book":
                libraryOperation = new Checkout(view, books, com.twu.biblioteca.model.Book.class);
                break;
            case "Checkin Book":
                libraryOperation = new Checkin(view, books, com.twu.biblioteca.model.Book.class);
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
            case "Login":
                libraryOperation = new Login(view, loginAuthenticator);
                break;
            case "Logout":
                libraryOperation = new Logout(view);
                break;
            case "List CheckedOut Books":
                libraryOperation = new ListCheckedOutLibraryItems(view, books);
                break;
            case "List CheckedOut Movies":
                libraryOperation = new ListCheckedOutLibraryItems(view, movies);
                break;
            case "User Information":
                libraryOperation = new UserDetails(view);
                break;
            default:
                libraryOperation = new InvalidOption(view);
                break;
        }
        return libraryOperation;
    }
}
