package com.twu.biblioteca;


import java.util.ArrayList;

public class View {
    public void displayWelcomeMessage() {
        System.out.println("Welcome");
    }

    public void displayListOfBooks(ArrayList<String[]> listOfBooks) {
        for (String[] book : listOfBooks) {
            for (String bookDetails : book) {
                System.out.print(bookDetails + " ");
            }
            System.out.println("");
        }
    }
}
