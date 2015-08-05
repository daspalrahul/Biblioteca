package com.twu.biblioteca.controller;


import com.twu.biblioteca.model.Section;
import com.twu.biblioteca.operation.LibraryOperation;
import com.twu.biblioteca.view.View;

public class BibliotecaApp {

    private View view;
    private Parser parser;
    private Section movies;
    private Section books;

    public BibliotecaApp(View view, Parser parser, Section books, Section movies) {
        this.view = view;
        this.parser = parser;
        this.movies = movies;
        this.books = books;
    }

    public void start() {
        view.displayWelcomeMessage();
        while (true) {
            view.displayLoginMenu();
            String userInput = view.getUserInput();
            LibraryOperation libraryOperation = parser.convertIntoLibraryOperation(userInput, books, movies);
            libraryOperation.execute();
            if (view.getUser() == null)
                continue;
            while (true) {
                view.displayMenu();
                userInput = view.getUserInput();
                libraryOperation = parser.convertIntoLibraryOperation(userInput, books, movies);
                libraryOperation.execute();
                if (userInput.equals("Logout"))
                    break;
            }
        }
    }
}
