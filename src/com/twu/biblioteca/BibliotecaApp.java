package com.twu.biblioteca;


import java.util.ArrayList;

public class BibliotecaApp {

    private View view;
    private Parser parser;
    private Library library;

    public BibliotecaApp(View view, Parser parser, Library library) {
        this.view = view;
        this.parser = parser;
        this.library = library;
    }

    public void start() {
        view.displayWelcomeMessage();
        while (true) {
            view.displayMenu();
            String userInput = view.getUserInput();
            LibraryOperation libraryOperation = parser.convertIntoLibraryOperation(userInput, library);
            libraryOperation.execute();
        }
    }
}
