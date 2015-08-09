package com.twu.biblioteca;


import com.twu.biblioteca.controller.*;
import com.twu.biblioteca.model.*;
import com.twu.biblioteca.view.*;

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
        users.add(new User("111-1111", "123456", "Rahul", "daspalrahul@gmail.com", "8860250486", "customer"));
        users.add(new User("222-2222", "123456", "Customer", "customer@gmail.com", "9876437654", "customer"));
        users.add(new User("999-9999", "123456", "Daspal", "dara@tw.com", "8832354145", "librarian"));


        LoginAuthenticator loginAuthenticator = new LoginAuthenticator(users);
        Parser parser = new Parser(view, loginAuthenticator);
        IView quitView = new QuitView();
        Session session = new Session();

        IView userMenuView = new UserMenuView(menu, console, session);
        IView listBooksView = new ListBooksView(console, books);
        IView listMoviesView = new ListMoviesView(console, movies);
        IView checkinBookView = new CheckinBookView(console, session, books);
        IView checkinMovieView = new CheckinMovieView(console, session, movies);
        IView checkoutBookView = new CheckoutBookView(console, session, books);
        IView checkoutMovieView = new CheckoutMovieView(console, session, movies);
        IView loginMenuView = new LoginMenuView(menu, console);
        IView displayWelcomeMessageView = new DisplayWelcomeMessageView(console);
        IView invalidUserMenuOptionView = new InvalidUserMenuOptionView(console);
        IView userDetailsView = new UserDetailsView(console, session);
        IView invalidLoginMenuOptionView = new InvalidLoginMenuOptionView(console);
        IView librarianMenuView = new LibrarianMenuView();
        IView loginView = new LoginView(console, loginAuthenticator, session, loginMenuView, userMenuView, librarianMenuView);
        IView logoutView = new LogoutView(console, session);
        UserMenuDispatcher userMenuDispatcher = new UserMenuDispatcher(listBooksView, listMoviesView, checkinBookView, checkinMovieView, checkoutBookView, checkoutMovieView, logoutView, userDetailsView, invalidUserMenuOptionView, invalidLoginMenuOptionView, quitView, loginView, userMenuView, loginMenuView);


        BibliotecaApp bibliotecaApp = new BibliotecaApp(displayWelcomeMessageView, userMenuDispatcher);
        bibliotecaApp.start();
    }
}
