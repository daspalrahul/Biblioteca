package com.twu.biblioteca;


import java.util.ArrayList;
import java.util.HashMap;

public class Main {

    public static void main(String[] args) {
        com.twu.biblioteca.model.LibraryItem book = new com.twu.biblioteca.model.Book("A Game Of Thrones", "George R.R. Martin", "1996");
        ArrayList<com.twu.biblioteca.model.LibraryItem> bookList = new ArrayList<>();
        bookList.add(book);
        com.twu.biblioteca.model.Section books = new com.twu.biblioteca.model.Section(bookList, new HashMap<com.twu.biblioteca.model.LibraryItem, com.twu.biblioteca.model.User>());
        com.twu.biblioteca.model.LibraryItem movie = new com.twu.biblioteca.model.Movie("Kick", "2014", "Parul", "-10");
        ArrayList<com.twu.biblioteca.model.LibraryItem> movieList = new ArrayList<>();
        movieList.add(movie);
        com.twu.biblioteca.model.Section movies = new com.twu.biblioteca.model.Section(movieList, new HashMap<com.twu.biblioteca.model.LibraryItem, com.twu.biblioteca.model.User>());
        Console console = new Console();
        com.twu.biblioteca.view.Menu menu = new com.twu.biblioteca.view.Menu();
        com.twu.biblioteca.view.View view = new com.twu.biblioteca.view.View(console, menu);
        ArrayList<com.twu.biblioteca.model.User> users = new ArrayList<>();
        users.add(new com.twu.biblioteca.model.User("123-4567", "123456", "Rahul", "daspalrahul@gmail.com", "8860250486", "customer"));
        users.add(new com.twu.biblioteca.model.User("999-9999", "123456", "Rahul", "daspalrahul@gmail.com", "8860250486", "librarian"));
        com.twu.biblioteca.controller.LoginAuthenticator loginAuthenticator = new com.twu.biblioteca.controller.LoginAuthenticator(users);
        com.twu.biblioteca.controller.Parser parser = new com.twu.biblioteca.controller.Parser(view, loginAuthenticator);
        com.twu.biblioteca.controller.BibliotecaApp bibliotecaApp = new com.twu.biblioteca.controller.BibliotecaApp(view, parser, books, movies);
        bibliotecaApp.start();
    }

}
