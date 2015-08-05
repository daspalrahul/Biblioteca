package com.twu.biblioteca.view;


import com.twu.biblioteca.Console;
import com.twu.biblioteca.model.Book;
import com.twu.biblioteca.model.LibraryItem;
import com.twu.biblioteca.model.Section;
import com.twu.biblioteca.model.User;

import java.util.ArrayList;

public class View {

    private Console console;
    private User user;
    private Menu menu;

    public View(Console console, Menu menu) {
        this.console = console;
        this.menu = menu;
    }

    public void displayWelcomeMessage() {
        console.printOutput("Welcome");
        console.printOutput("=======");
    }

    public void displayListOfAllAvailableLibraryItems(Section section) {
        int i = 1;
        ArrayList<LibraryItem> listOfLibraryItems = section.listOfAllAvailableLibraryItems();
        for (LibraryItem libraryItem : listOfLibraryItems) {
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
        if (type == Book.class)
            console.printOutput("Thank you for returning the book.");
        else
            console.printOutput("Thank you for returning the movie.");
    }

    public void displayUnSuccessfulCheckinMessage(Class<?> type) {
        if (type == Book.class)
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
        if (type == Book.class)
            console.printOutput("Thank you! Enjoy the book");
        else
            console.printOutput("Thank you! Enjoy the movie");
    }

    public void displayUnSuccessfulCheckOutMessage(Class<?> type) {
        if (type == Book.class)
            console.printOutput("That book is not available.");
        else
            console.printOutput("That movie is not available.");
    }

    public void displayUnsuccessfulLoginMessage() {
        console.printOutput("Invalid User");
    }

    public void successfulLogin(User user) {
        this.user = user;
        console.printOutput("Thanks for logging in " + user.userInformation());
    }

    public User getUser() {
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
