package com.twu.biblioteca;


import java.util.ArrayList;

public class BibliotecaApp {

    private ArrayList<String[]> library;
    private View view;

    public BibliotecaApp(ArrayList<String[]> library, View view) {
        this.library = library;
        this.view = view;
    }

    public void start() {
        view.displayWelcomeMessage();
        view.displayMenu();
        String userInput = view.getUserInput();
    }
}
