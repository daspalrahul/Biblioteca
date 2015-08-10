package com.twu.biblioteca.view;


import com.twu.biblioteca.Console;
import com.twu.biblioteca.controller.LoginAuthenticator;
import com.twu.biblioteca.controller.ViewDispatcher;
import com.twu.biblioteca.model.Session;
import org.junit.Test;
import org.mockito.Mockito;

import static org.junit.Assert.*;
import static org.mockito.Mockito.atLeast;


public class LoginViewTest {

    @Test
    public void loginViewKnowsHowToDrawItself() {
        Console console = Mockito.mock(Console.class);
        IView loginMenuView = Mockito.mock(LoginMenuView.class);
        IView userMenuView = Mockito.mock(UserMenuView.class);
        IView librarianMenuView = Mockito.mock(LibrarianMenuView.class);
        LoginAuthenticator loginAuthenticator = Mockito.mock(LoginAuthenticator.class);
        Session session = Mockito.mock(Session.class);
        IView loginView = new LoginView(console, loginAuthenticator, session, loginMenuView, userMenuView, librarianMenuView);

        loginView.draw();

        Mockito.verify(console, atLeast(2)).getInput();
    }

    @Test
    public void loginViewKnowsWhatViewToCallNext() {
        Console console = Mockito.mock(Console.class);
        IView loginMenuView = Mockito.mock(LoginMenuView.class);
        IView userMenuView = Mockito.mock(UserMenuView.class);
        IView librarianMenuView = Mockito.mock(LibrarianMenuView.class);
        LoginAuthenticator loginAuthenticator = Mockito.mock(LoginAuthenticator.class);
        Session session = Mockito.mock(Session.class);
        IView loginView = new LoginView(console, loginAuthenticator, session, loginMenuView, userMenuView, librarianMenuView);
        ViewDispatcher viewDispatcher = Mockito.mock(ViewDispatcher.class);

        assertEquals(loginMenuView, loginView.next(viewDispatcher));
    }

}