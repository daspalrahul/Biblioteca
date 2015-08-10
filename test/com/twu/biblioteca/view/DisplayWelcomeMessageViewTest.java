package com.twu.biblioteca.view;


import com.twu.biblioteca.Console;
import com.twu.biblioteca.controller.ViewDispatcher;
import org.junit.Test;
import org.mockito.Mockito;

import static org.junit.Assert.*;


public class DisplayWelcomeMessageViewTest {

    @Test
    public void displayWelcomeMessageViewKnowsHowToDrawItself() {
        Console console = Mockito.mock(Console.class);
        DisplayWelcomeMessageView displayWelcomeMessageView = new DisplayWelcomeMessageView(console);

        displayWelcomeMessageView.draw();

        Mockito.verify(console).printOutput("++++++++++WELCOME++++++++++");
    }

    @Test
    public void displayWelcomeMessageViewKnowsWhatViewToGoNext() {
        Console console = Mockito.mock(Console.class);
        IView loginMenuView = Mockito.mock(LoginMenuView.class);
        DisplayWelcomeMessageView displayWelcomeMessageView = new DisplayWelcomeMessageView(console);
        ViewDispatcher viewDispatcher = Mockito.mock(ViewDispatcher.class);

        Mockito.when(viewDispatcher.loginMenuDispatch("Display Welcome Message View")).thenReturn(loginMenuView);

        assertEquals(loginMenuView, displayWelcomeMessageView.next(viewDispatcher));
    }
}