package com.twu.biblioteca.controller;


import com.twu.biblioteca.Console;
import com.twu.biblioteca.view.*;
import org.junit.Test;
import org.mockito.Mockito;

import static org.junit.Assert.*;


public class UserMenuDispatcherTest {

    @Test
    public void userMenuDispatcherKnowsWhatViewToReturn() {
        IView listBooksView = Mockito.mock(ListBooksView.class);
        IView listMoviesView = Mockito.mock(ListMoviesView.class);
        IView checkinBookView = Mockito.mock(CheckinBookView.class);
        IView checkinMovieView = Mockito.mock(CheckinMovieView.class);
        IView checkoutBookView = Mockito.mock(CheckoutBookView.class);
        IView checkoutMovieView = Mockito.mock(CheckoutMovieView.class);
        IView logoutView = Mockito.mock(LogoutView.class);
        IView userDetailsView = Mockito.mock(UserDetailsView.class);
        IView invalidUserMenuOptionView = Mockito.mock(InvalidUserMenuOptionView.class);
        IView invalidLoginOptionView = Mockito.mock(InvalidLoginMenuOptionView.class);
        IView quitView = Mockito.mock(QuitView.class);
        IView loginView = Mockito.mock(LoginView.class);
        UserMenuDispatcher userMenuDispatcher = new UserMenuDispatcher();
        userMenuDispatcher.setViews(listBooksView, listMoviesView, checkinBookView, checkinMovieView, checkoutBookView, checkoutMovieView, logoutView, userDetailsView, invalidUserMenuOptionView, invalidLoginOptionView, quitView, loginView);

        assertEquals(listBooksView, userMenuDispatcher.userMenuDispatch("List Books"));
    }

    @Test
    public void viewDispatcherCanReturnCorrectViewBasedOnUserInput() {
        IView listBooksView = Mockito.mock(ListBooksView.class);
        IView listMoviesView = Mockito.mock(ListMoviesView.class);
        IView checkinBookView = Mockito.mock(CheckinBookView.class);
        IView checkinMovieView = Mockito.mock(CheckinMovieView.class);
        IView checkoutBookView = Mockito.mock(CheckoutBookView.class);
        IView checkoutMovieView = Mockito.mock(CheckoutMovieView.class);
        IView logoutView = Mockito.mock(LogoutView.class);
        IView userDetailsView = Mockito.mock(UserDetailsView.class);
        IView invalidUserMenuOptionView = Mockito.mock(InvalidUserMenuOptionView.class);
        IView invalidLoginOptionView = Mockito.mock(InvalidLoginMenuOptionView.class);
        IView quitView = Mockito.mock(QuitView.class);
        IView loginView = Mockito.mock(LoginView.class);
        Console console = Mockito.mock(Console.class);

        Mockito.when(console.getInput()).thenReturn("Login");
        UserMenuDispatcher userMenuDispatcher = new UserMenuDispatcher();
        userMenuDispatcher.setViews(listBooksView, listMoviesView, checkinBookView, checkinMovieView, checkoutBookView, checkoutMovieView, logoutView, userDetailsView, invalidUserMenuOptionView, invalidLoginOptionView, quitView, loginView);


        assertEquals(loginView, userMenuDispatcher.loginMenuDispatch(console.getInput()));
    }
}