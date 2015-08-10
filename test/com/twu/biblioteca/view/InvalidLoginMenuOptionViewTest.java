package com.twu.biblioteca.view;


import com.twu.biblioteca.Console;
import com.twu.biblioteca.controller.ViewDispatcher;
import org.junit.Test;
import org.mockito.Mockito;

import static org.junit.Assert.*;


public class InvalidLoginMenuOptionViewTest {

    @Test
    public void invalidOptionTestKnowsHowToDrawItself() {
        Console console = Mockito.mock(Console.class);
        IView invalidOptionTest = new InvalidLoginMenuOptionView(console);

        invalidOptionTest.draw();

        Mockito.verify(console).printOutput("Select a valid option!");
    }

    @Test
    public void invalidOptionTestKnowsHowToReturnTheNextView() {
        IView loginMenuView = Mockito.mock(LoginMenuView.class);
        Console console = Mockito.mock(Console.class);
        IView invalidOptionTest = new InvalidLoginMenuOptionView(console);
        ViewDispatcher viewDispatcher = Mockito.mock(ViewDispatcher.class);

        Mockito.when(viewDispatcher.loginMenuDispatch("Invalid Login Menu Option View")).thenReturn(loginMenuView);

        assertEquals(loginMenuView, invalidOptionTest.next(viewDispatcher));
    }
}