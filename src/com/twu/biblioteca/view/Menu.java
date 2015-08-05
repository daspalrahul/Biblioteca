package com.twu.biblioteca.view;

import com.twu.biblioteca.model.User;

public class Menu {

    private String listBooks;
    private String listMovies;
    private String checkoutBook;
    private String checkoutMovie;
    private String checkinBook;
    private String checkinMovie;
    private String listCheckedOutBooks;
    private String listCheckedOutMovies;
    private String quit;
    private String login;
    private String logout;
    private String userInformation;
    private String delimiter;

    public Menu() {
        listBooks = "List Books";
        listMovies = "List Movies";
        checkinBook = "Checkin Book";
        checkinMovie = "Checkin Movie";
        checkoutBook = "Checkout Book";
        checkoutMovie = "Checkout Movie";
        listCheckedOutBooks = "List CheckedOut Books";
        listCheckedOutMovies = "List CheckedOut Movies";
        quit = "Quit";
        login = "Login";
        logout = "Logout";
        userInformation = "User Information";
        delimiter = "\n";
    }

    public String displayOptionMenuList(User user) {
        String output = listBooks + delimiter + listMovies + delimiter + checkinBook + delimiter + checkoutBook + delimiter + checkinMovie + delimiter + checkoutMovie + delimiter;
        if (user.isLibrarian())
            output += listCheckedOutBooks + delimiter + listCheckedOutMovies + delimiter;
        return output + userInformation + delimiter + logout + delimiter;
    }

    public String displayLoginMenu() {
        return login + delimiter + quit + delimiter;
    }
}
