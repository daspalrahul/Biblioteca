package com.twu.biblioteca;


import java.util.ArrayList;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        LibraryItem book = new Book("A Game Of Thrones", "George R.R. Martin", "1996");
        ArrayList<LibraryItem> list = new ArrayList<>();
        list.add(book);
        Library library = new Library(list, new ArrayList<LibraryItem>());
        Console console = new Console();
        View view = new View(console);
        Parser parser = new Parser(view);
        BibliotecaApp bibliotecaApp = new BibliotecaApp(view, parser, library);
        bibliotecaApp.start();
    }

}
