package com.twu.biblioteca;


import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        LibraryItem book = new Book("A Game Of Thrones", "George R.R. Martin", "1996");
        ArrayList<LibraryItem> bookList = new ArrayList<>();
        bookList.add(book);
        Section books = new Section(bookList, new ArrayList<LibraryItem>());
        LibraryItem movie = new Movie("Kick", "2014", "Parul", "-10");
        ArrayList<LibraryItem> movieList = new ArrayList<>();
        movieList.add(movie);
        Section movies = new Section(movieList, new ArrayList<LibraryItem>());
        Console console = new Console();
        View view = new View(console);
        ArrayList<User> users = new ArrayList<>();
        users.add(new User("123-4567", "diney", "Rahul", "daspalrahul@gmail.com", "8860250486", "customer"));
        LoginAuthenticator loginAuthenticator = new LoginAuthenticator(users);
        Parser parser = new Parser(view, loginAuthenticator);
        BibliotecaApp bibliotecaApp = new BibliotecaApp(view, parser, books, movies);
        bibliotecaApp.start();
    }

}
