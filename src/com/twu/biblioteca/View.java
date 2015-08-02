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
        System.out.format("   %-32s%20s%10s\n", "Name", "Author", "Year");
        for (LibraryItem libraryItem : listOfBooks) {
            System.out.print(i++ + " ");
            System.out.print(libraryItem.toString());
            System.out.println("");
        }
    }

    public void displayMenu() {
        console.printOutput("\n\nEnter the action you want to perform");
        console.printOutput("List Books\nCheckout Book\nCheckin Book\nList Movies\nCheckout Movie\nCheckin Movie" +
                "Quit\n\n\n");
    }

    public void displaySuccessfulCheckinMessage() {
        console.printOutput("Thank you for returning the book.");
    }

    public void displayUnSuccessfulCheckinMessage() {
        console.printOutput("That is not a valid book to return.");
    }

    public String getUserInput() {
        return console.getInput();
    }

    public void displayInvalidCommandMessage() {
        console.printOutput("Select a valid option!");
    }

    public void displaySuccessfulCheckOutMessage() {
        console.printOutput("Thank you! Enjoy the book");
    }

    public void displayUnSuccessfulCheckOutMessage() {
        console.printOutput("That book is not available.");
    }
}
