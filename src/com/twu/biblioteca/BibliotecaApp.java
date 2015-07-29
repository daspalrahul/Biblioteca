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
            LibraryOperation libraryOperation;
            if (userInput.equals("List Books")) {
                libraryOperation = new ListBooks(view, library);
            } else if (userInput.equals("Quit")) {
                libraryOperation = new Quit();
            } else {
                libraryOperation = new InvalidOption(view);
            }
            libraryOperation.execute();
        }
    }
}
