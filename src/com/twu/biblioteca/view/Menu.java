package com.twu.biblioteca.view;

import com.twu.biblioteca.model.User;

public class Menu {

    private String menuDecorator;
    private String menu;
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
    private String userDetails;
    private String delimiter;

    public Menu() {
        menuDecorator = "===========================";
        menu = "          MENU";
        listBooks = "List Books";
        listMovies = "List Movies";
        checkinBook = "Checkin Book";
        checkinMovie = "Checkin Movie";
        checkoutBook = "Checkout Book";
        checkoutMovie = "Checkout Movie";
        listCheckedOutBooks = "List Checkedout Books";
        listCheckedOutMovies = "List Checkedout Movies";
        quit = "Quit";
        login = "Login";
        logout = "Logout";
        userDetails = "User Details";
        delimiter = "\n";
    }

    public String displayOptionMenuList(User user) {
        String output = delimiter + menuDecorator + delimiter + menu + delimiter + menuDecorator + delimiter + listBooks + delimiter + listMovies + delimiter + checkinBook + delimiter + checkoutBook + delimiter + checkinMovie + delimiter + checkoutMovie + delimiter;
        if (user.isLibrarian())
            output += listCheckedOutBooks + delimiter + listCheckedOutMovies + delimiter;
        return output + userDetails + delimiter + logout + delimiter + menuDecorator + delimiter + delimiter;
    }

    public String displayLoginMenu() {
        return delimiter + menuDecorator + delimiter + menu + delimiter + menuDecorator + delimiter + login + delimiter + quit + delimiter + menuDecorator + delimiter + delimiter;
    }
}
