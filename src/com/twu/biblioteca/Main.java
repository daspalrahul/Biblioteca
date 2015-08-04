package com.twu.biblioteca;


import java.util.ArrayList;
import java.util.HashMap;

public class Main {

    public static void main(String[] args) {
        LibraryItem book = new Book("A Game Of Thrones", "George R.R. Martin", "1996");
        ArrayList<LibraryItem> bookList = new ArrayList<>();
        bookList.add(book);
        Section books = new Section(bookList, new HashMap<LibraryItem, User>());
        LibraryItem movie = new Movie("Kick", "2014", "Parul", "-10");
        ArrayList<LibraryItem> movieList = new ArrayList<>();
        movieList.add(movie);
        Section movies = new Section(movieList, new HashMap<LibraryItem, User>());
        Console console = new Console();
        Menu menu = new Menu();
        View view = new View(console, menu);
        ArrayList<User> users = new ArrayList<>();
        users.add(new User("123-4567", "123456", "Rahul", "daspalrahul@gmail.com", "8860250486", "customer"));
        users.add(new User("999-9999", "123456", "Rahul", "daspalrahul@gmail.com", "8860250486", "librarian"));
        LoginAuthenticator loginAuthenticator = new LoginAuthenticator(users);
        Parser parser = new Parser(view, loginAuthenticator);
        BibliotecaApp bibliotecaApp = new BibliotecaApp(view, parser, books, movies);
        bibliotecaApp.start();
    }

}
