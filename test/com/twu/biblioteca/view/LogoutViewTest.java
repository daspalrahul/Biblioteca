package com.twu.biblioteca.view;


import com.twu.biblioteca.Console;
import com.twu.biblioteca.controller.UserMenuDispatcher;
import com.twu.biblioteca.model.Session;
import org.junit.Test;
import org.mockito.Mockito;

import static org.junit.Assert.*;


public class LogoutViewTest {

    @Test
    public void logoutViewKnowsHowToDrawItself() {
        Console console = Mockito.mock(Console.class);
        IView loginMenuView = Mockito.mock(LoginMenuView.class);
        Session session = Mockito.mock(Session.class);
        IView logoutView = new LogoutView(console, loginMenuView, session);

        logoutView.draw();

        Mockito.verify(session).unsetCurrentUser();
    }

    @Test
    public void logoutViewKnowsHowToReturnNextView() {
        Console console = Mockito.mock(Console.class);
        IView loginMenuView = Mockito.mock(LoginMenuView.class);
        Session session = Mockito.mock(Session.class);
        IView logoutView = new LogoutView(console, loginMenuView, session);
        UserMenuDispatcher userMenuDispatcher = Mockito.mock(UserMenuDispatcher.class);

        assertEquals(loginMenuView, logoutView.next(userMenuDispatcher));
    }
}