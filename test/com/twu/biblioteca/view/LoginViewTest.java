package com.twu.biblioteca.view;


import com.twu.biblioteca.Console;
import org.junit.Test;
import org.mockito.Mockito;

import static org.junit.Assert.*;
import static org.mockito.Mockito.atLeast;


public class LoginViewTest {

    @Test
    public void loginViewKnowsHowToDrawItself() {
        Console console = Mockito.mock(Console.class);
        IView loginView = new LoginView(console);

        loginView.draw();

        Mockito.verify(console, atLeast(2)).getInput();
    }

}