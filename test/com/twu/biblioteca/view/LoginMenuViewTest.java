package com.twu.biblioteca.view;


import com.twu.biblioteca.Console;
import com.twu.biblioteca.controller.ViewDispatcher;
import org.junit.Test;
import org.mockito.Mockito;

import static org.junit.Assert.*;


public class LoginMenuViewTest {

    @Test
    public void loginMenuViewKnowsHowToDrawItself() {
        Console console = Mockito.mock(Console.class);
        Menu menu = Mockito.mock(Menu.class);
        IView loginMenuView = new LoginMenuView(menu, console);

        Mockito.when(menu.displayLoginMenu()).thenReturn("\n" +
                "===========================\n" +
                "          MENU\n" +
                "===========================\n" +
                "Login\n" +
                "Quit\n" +
                "===========================\n" +
                "\n");
        loginMenuView.draw();

        Mockito.verify(console).printOutput("\n" +
                "===========================\n" +
                "          MENU\n" +
                "===========================\n" +
                "Login\n" +
                "Quit\n" +
                "===========================\n" +
                "\n");
    }

    @Test
    public void loginMenuViewKnowsHowToReturnNextView() {
        Console console = Mockito.mock(Console.class);
        Menu menu = Mockito.mock(Menu.class);
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
        IView userMenuView = Mockito.mock(UserMenuView.class);
        IView loginMenuView = new LoginMenuView(menu, console);
        IView listCheckedoutBooksView = Mockito.mock(ListCheckedoutBooksView.class);
        IView listCheckedOutMoviesView = Mockito.mock(ListCheckedoutMovies.class);
        IView librarianMenuView = Mockito.mock(LibrarianMenuView.class);
        ViewDispatcher viewDispatcher = new ViewDispatcher(listBooksView, listMoviesView, checkinBookView, checkinMovieView, checkoutBookView, checkoutMovieView, logoutView, userDetailsView, invalidUserMenuOptionView, invalidLoginOptionView, quitView, loginView, userMenuView, loginMenuView, listCheckedoutBooksView, listCheckedOutMoviesView, librarianMenuView);

        Mockito.when(console.getInput()).thenReturn("Login");

        assertEquals(loginView, loginMenuView.next(viewDispatcher));
    }
}