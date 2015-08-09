package com.twu.biblioteca.view;


import com.twu.biblioteca.Console;
import org.junit.Test;
import org.mockito.Mockito;

import static org.junit.Assert.*;


public class InvalidUserMenuOptionViewTest {

    @Test
    public void invalidUserMenuOptionViewKnowsHowToDrawItself() {
        Console console = Mockito.mock(Console.class);
        IView userMenuView = Mockito.mock(UserMenuView.class);
        IView invalidUserMenuOptionView = new InvalidUserMenuOptionView(console, userMenuView);

        invalidUserMenuOptionView.draw();

        Mockito.verify(console).printOutput("That is not a valid option");
    }

    @Test
    public void invalidUserMenuOptionViewKnowsWhatViewToCallNext() {
        Console console = Mockito.mock(Console.class);
        IView userMenuView = Mockito.mock(UserMenuView.class);
        IView invalidUserMenuOptionView = new InvalidUserMenuOptionView(console, userMenuView);

        assertEquals(userMenuView, invalidUserMenuOptionView.next());
    }
}