package com.twu.biblioteca;


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
        /*boolean untillLoginSuccessful = true;
        do {
            view.d
        }*/
        while (true) {
            view.displayMenu();
            String userInput = view.getUserInput();
            LibraryOperation libraryOperation = parser.convertIntoLibraryOperation(userInput, books, movies);
            libraryOperation.execute();
        }
    }
}
