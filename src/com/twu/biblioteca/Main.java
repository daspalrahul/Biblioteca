package com.twu.biblioteca;


import java.util.ArrayList;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        String book[] = {"A Game of Thrones", "George R. R. Martin", "1996"};
        ArrayList<String[]> library = new ArrayList<>(Arrays.asList(book, book));
        View view = new View();
        Parser parser = new Parser(view, library);
        BibliotecaApp bibliotecaApp = new BibliotecaApp(library, view, parser);
        bibliotecaApp.start();
    }

}
