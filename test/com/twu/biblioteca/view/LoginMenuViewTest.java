package com.twu.biblioteca.view;


import com.twu.biblioteca.Console;
import org.junit.Test;
import org.mockito.Mockito;

import static org.junit.Assert.*;


public class LoginMenuViewTest {

    @Test
    public void loginMenuViewKnowsHowToDrawItself() {
        Console console = Mockito.mock(Console.class);
        Menu menu = Mockito.mock(Menu.class);
        IView quitView = Mockito.mock(QuitView.class);
        IView invalidOptionView = Mockito.mock(InvalidOptionView.class);
        IView loginView = Mockito.mock(LoginView.class);
        IView loginMenuView = new LoginMenuView(menu, console, quitView, invalidOptionView, loginView);

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
}