package com.twu.biblioteca;


import java.util.ArrayList;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        Book book = new Book("A Game of Thrones", "George R.R. Martin", 1996);
        ArrayList<Book> bookList = new ArrayList<>(Arrays.asList(book, book));
        Library library = new Library(bookList);
        View view = new View();
        BibliotecaApp bibliotecaApp = new BibliotecaApp(library, view);
        bibliotecaApp.start();
    }

}
