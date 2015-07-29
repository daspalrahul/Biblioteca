package com.twu.biblioteca;


import java.util.ArrayList;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        String book[] = {"A Game of Thrones", "George R. R. Martin", "1996"};
        Library library = new Library((ArrayList<String[]>) Arrays.asList(book, book));
        Console console = new Console();
        View view = new View(console);
        Parser parser = new Parser(view);
        BibliotecaApp bibliotecaApp = new BibliotecaApp(view, parser, library);
        bibliotecaApp.start();
    }

}
