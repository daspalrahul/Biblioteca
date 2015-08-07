package com.twu.biblioteca.view;


import com.twu.biblioteca.Console;
import org.junit.Test;
import org.mockito.Mockito;

import static org.junit.Assert.*;


public class InvalidLoginMenuOptionViewTest {

    @Test
    public void invalidOptionTestKnowsHowToDrawItself() {
        IView loginMenuView = Mockito.mock(LoginMenuView.class);
        Console console = Mockito.mock(Console.class);
        IView invalidOptionTest = new InvalidLoginMenuOptionView(console, loginMenuView);

        invalidOptionTest.draw();

        Mockito.verify(console).printOutput("Select a valid option!");
    }

    @Test
    public void invalidOptionTestKnowsHowToReturnTheNextView() {
        IView loginMenuView = Mockito.mock(LoginMenuView.class);
        Console console = Mockito.mock(Console.class);
        IView invalidOptionTest = new InvalidLoginMenuOptionView(console, loginMenuView);

        invalidOptionTest.next();

        assertEquals(loginMenuView, invalidOptionTest.next());
    }
}