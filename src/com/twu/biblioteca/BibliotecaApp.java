package com.twu.biblioteca;


public class BibliotecaApp {

    private Library library;
    private View view;

    public BibliotecaApp(Library library, View view) {
        this.library = library;
        this.view = view;
    }

    public void start() {
        view.displayWelcomeMessage();
        view.displayListOfBooks(library.listOfBooks());
    }
}
