package com.twu.biblioteca.view;


import com.twu.biblioteca.Console;
import org.junit.Test;
import org.mockito.Mockito;

import static org.junit.Assert.*;
import static org.mockito.Matchers.anyString;


public class UserMenuViewTest {

    @Test
    public void userMenuViewTestKnowsHowToDrawItself() {
        Menu menu = Mockito.mock(Menu.class);
        Console console = Mockito.mock(Console.class);
        LoginView loginView = Mockito.mock(LoginView.class);
        IView userMenuViewTest = new UserMenuView(menu, console, loginView);

        userMenuViewTest.draw();

        Mockito.verify(console).printOutput(anyString());
    }
}