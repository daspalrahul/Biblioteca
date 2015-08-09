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
        UserMenuDispatcher userMenuDispatcher = new UserMenuDispatcher();
        IView userMenuView = new UserMenuView(menu, console, session, userMenuDispatcher);
        IView listBooksView = new ListBooksView(console, userMenuView, books);
        IView listMoviesView = new ListMoviesView(console, userMenuView, movies);
        IView checkinBookView = new CheckinBookView(console, userMenuView, session, books);
        IView checkinMovieView = new CheckinMovieView(console, userMenuView, session, movies);
        IView checkoutBookView = new CheckoutBookView(console, userMenuView, session, books);
        IView checkoutMovieView = new CheckoutMovieView(console, userMenuView, session, movies);
        IView loginMenuView = new LoginMenuView(menu, console, userMenuDispatcher);
        IView displayWelcomeMessageView = new DisplayWelcomeMessageView(loginMenuView, console);
        IView invalidUserMenuOptionView = new InvalidUserMenuOptionView(console, userMenuView);
        IView userDetailsView = new UserDetailsView(console, userMenuView, session);
        IView invalidLoginMenuOptionView = new InvalidLoginMenuOptionView(console, loginMenuView);
        IView librarianMenuView = new LibrarianMenuView();
        IView loginView = new LoginView(console, loginAuthenticator, session, loginMenuView, userMenuView, librarianMenuView);
        IView logoutView = new LogoutView(console, loginMenuView, session);
        userMenuDispatcher.setViews(listBooksView, listMoviesView, checkinBookView, checkinMovieView, checkoutBookView, checkoutMovieView, logoutView, userDetailsView, invalidUserMenuOptionView, invalidLoginMenuOptionView, quitView, loginView);


        BibliotecaApp bibliotecaApp = new BibliotecaApp(displayWelcomeMessageView);
        bibliotecaApp.start();
    }
}
