package com.twu.biblioteca;


import java.util.ArrayList;

public class BibliotecaApp {

    private ArrayList<String[]> library;
    private View view;
    private Parser parser;

    public BibliotecaApp(ArrayList<String[]> library, View view, Parser parser) {
        this.library = library;
        this.view = view;
        this.parser = parser;
    }

    public void start() {
        view.displayWelcomeMessage();
        while (true) {
            view.displayMenu();
            String userInput = view.getUserInput();
            LibraryOperation libraryOperation = parser.convertIntoLibraryOperation(userInput);
            libraryOperation.execute();
        }
    }
}
