package com.twu.biblioteca;


import java.util.ArrayList;

public class View {
    public void displayWelcomeMessage() {
        System.out.println("Welcome");
    }

    public void displayListOfBooks(ArrayList<String[]> listOfBooks) {
        int i = 1;
        System.out.format("   %-32s%20s%10s\n", "Name", "Author", "Year");
        for (String[] book : listOfBooks) {
            System.out.print(i++);
            System.out.format("  %-32s%20s%10s", book[0], book[1], book[2]);
            System.out.println("");
        }
    }
}
