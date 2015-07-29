package com.twu.biblioteca;


import java.util.ArrayList;
import java.util.Scanner;

public class View {
    public void displayWelcomeMessage() {
        System.out.println("Welcome");
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
        System.out.println("Enter the action you want to perform");
        System.out.print("1. List Books\n2. Quit\n");
    }

    public String getUserInput() {
        Scanner sc = new Scanner(System.in);
        return sc.nextLine();
    }

    public void displayInvalidCommandMessage() {
        System.out.println("Select a valid option!");
    }
}
