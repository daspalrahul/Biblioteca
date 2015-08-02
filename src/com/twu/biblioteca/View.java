package com.twu.biblioteca;


import java.util.ArrayList;

public class View {

    Console console;

    public View(Console console) {
        this.console = console;
    }

    public void displayWelcomeMessage() {
        console.printOutput("Welcome");
        console.printOutput("=======");
    }

    public void displayListOfAllBooks(Section section) {
        int i = 1;
        ArrayList<LibraryItem> listOfBooks = section.listOfAllAvailableLibraryItems();
        for (LibraryItem libraryItem : listOfBooks) {
            console.printOutput(i++ + ". " + libraryItem);
        }
    }

    public void displayMenu() {
        console.printOutput("\n\nEnter the action you want to perform");
        console.printOutput("List Books\nCheckout Book\nCheckin Book\nList Movies\nCheckout Movie\nCheckin Movie\n" +
                "Quit\n\n\n");
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
}
