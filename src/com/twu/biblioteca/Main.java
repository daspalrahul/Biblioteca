package com.twu.biblioteca;


import java.util.ArrayList;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        String[] book = {"A Game Of Thrones", "George R.R. Martin", "1996", "available"};
        ArrayList<String[]> list = new ArrayList<>(Arrays.<String[]>asList(book));
        Library library = new Library(list, new ArrayList<String[]>());
        Console console = new Console();
        View view = new View(console);
        Parser parser = new Parser(view);
        BibliotecaApp bibliotecaApp = new BibliotecaApp(view, parser, library);
        bibliotecaApp.start();
    }

}
