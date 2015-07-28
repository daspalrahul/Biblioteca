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
        while (true) {
            view.displayMenu();
            String userInput = view.getUserInput();
            if (userInput.equals("List Books")) {
                view.displayListOfBooks(library);
            } else if (userInput.equals("Quit")) {
                break;
            } else {
                view.displayInvalidCommandMessage();
            }
        }
    }
}
