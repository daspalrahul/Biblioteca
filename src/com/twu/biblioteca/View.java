package com.twu.biblioteca;


import java.util.ArrayList;
import java.util.Scanner;

public class View {

    Console console;

    public View(Console console) {
        this.console = console;
    }

    public void displayWelcomeMessage() {
        console.printOutput("Welcome");
    }

    public void displayListOfAllBooks(Library library) {
        int i = 1;
        ArrayList<String[]> listOfBooks = library.listOfAllBooks();
        System.out.format("   %-32s%20s%10s\n", "Name", "Author", "Year");
        for (String[] book : listOfBooks) {
            System.out.print(i++);
            System.out.format("  %-32s%20s%10s", book[0], book[1], book[2]);
            System.out.println("");
        }
    }

    public void displayMenu() {
        console.printOutput("Enter the action you want to perform");
        console.printOutput("1. List Books\n" +
                "2. Quit\n");
    }

    public String getUserInput() {
        return console.getInput();
    }

    public void displayInvalidCommandMessage() {
        console.printOutput("Select a valid option!");
    }
}
