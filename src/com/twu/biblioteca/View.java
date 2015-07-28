package com.twu.biblioteca;


import java.util.ArrayList;

public class View {
    public void displayWelcomeMessage() {
        System.out.println("Welcome");
    }

    public void displayListOfBooks(ArrayList<String> listOfBooks) {
        for (String listOfBook : listOfBooks) {
            System.out.println(listOfBook);
        }
    }
}
