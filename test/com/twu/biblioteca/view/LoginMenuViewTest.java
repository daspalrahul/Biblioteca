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
        ViewDispatcher viewDispatcher = Mockito.mock(ViewDispatcher.class);
        IView loginMenuView = new LoginMenuView(menu, console, viewDispatcher);

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
        IView quitView = Mockito.mock(QuitView.class);
        IView invalidOptionView = Mockito.mock(InvalidOptionView.class);
        IView loginView = Mockito.mock(LoginView.class);
        ViewDispatcher viewDispatcher = new ViewDispatcher(invalidOptionView, quitView, loginView);
        IView loginMenuView = new LoginMenuView(menu, console, viewDispatcher);

        Mockito.when(console.getInput()).thenReturn("Login");

        assertEquals(loginView, loginMenuView.next(loginView));
    }
}