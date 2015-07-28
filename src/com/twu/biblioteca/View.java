package com.twu.biblioteca;


import java.util.ArrayList;

public class View {
    public void displayWelcomeMessage() {
        System.out.println("Welcome");
    }

    public void displayListOfBooks(ArrayList<Book> listOfBooks) {
        for (int i = 0; i < listOfBooks.size(); i++) {
            System.out.println(listOfBooks.get(i).toString());
        }
    }
}
