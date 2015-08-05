package com.twu.biblioteca.view;


import com.twu.biblioteca.Console;

import java.util.ArrayList;

public class View {

    Console console;
    com.twu.biblioteca.model.User user;
    Menu menu;

    public View(Console console, Menu menu) {
        this.console = console;
        this.menu = menu;
    }

    public void displayWelcomeMessage() {
        console.printOutput("Welcome");
        console.printOutput("=======");
    }

    public void displayListOfAllAvailableLibraryItems(com.twu.biblioteca.model.Section section) {
        int i = 1;
        ArrayList<com.twu.biblioteca.model.LibraryItem> listOfLibraryItems = section.listOfAllAvailableLibraryItems();
        for (com.twu.biblioteca.model.LibraryItem libraryItem : listOfLibraryItems) {
            console.printOutput(i++ + ". " + libraryItem);
        }
    }

    public void displayListOfAllCheckedOutLibraryItems(String list) {
        console.printOutput(list);
    }

    public void displayMenu() {
        console.printOutput(menu.displayOptionMenuList(user));
    }

    public void displaySuccessfulCheckinMessage(Class<?> type) {
        if (type == com.twu.biblioteca.model.Book.class)
            console.printOutput("Thank you for returning the book.");
        else
            console.printOutput("Thank you for returning the movie.");
    }

    public void displayUnSuccessfulCheckinMessage(Class<?> type) {
        if (type == com.twu.biblioteca.model.Book.class)
            console.printOutput("That is not a valid book to return.");
        else
            console.printOutput("That is not a valid movie to return.");
    }

    public String getUserInput() {
        return console.getInput();
    }

    public void displayInvalidCommandMessage() {
        console.printOutput("Select a valid option!");
    }

    public void displaySuccessfulCheckOutMessage(Class<?> type) {
        if (type == com.twu.biblioteca.model.Book.class)
            console.printOutput("Thank you! Enjoy the book");
        else
            console.printOutput("Thank you! Enjoy the movie");
    }

    public void displayUnSuccessfulCheckOutMessage(Class<?> type) {
        if (type == com.twu.biblioteca.model.Book.class)
            console.printOutput("That book is not available.");
        else
            console.printOutput("That movie is not available.");
    }

    public void displayUnsuccessfulLoginMessage() {
        console.printOutput("Invalid User");
    }

    public void successfulLogin(com.twu.biblioteca.model.User user) {
        this.user = user;
        console.printOutput("Thanks for logging in " + user.userInformation());
    }

    public com.twu.biblioteca.model.User getUser() {
        return user;
    }

    public void displayLoginMenu() {
        console.printOutput(menu.displayLoginMenu());
    }

    public void logoutSuccess() {
        this.user = null;
        console.printOutput("You have logged out!");
    }
}
