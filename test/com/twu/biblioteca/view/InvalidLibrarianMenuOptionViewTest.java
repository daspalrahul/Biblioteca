package com.twu.biblioteca.view;


import com.twu.biblioteca.Console;
import com.twu.biblioteca.controller.ViewDispatcher;
import org.junit.Test;
import org.mockito.Mockito;

import static org.junit.Assert.*;


public class InvalidLibrarianMenuOptionViewTest {

    @Test
    public void invalidLibrarianMenuOptionTestKnowsHowToDrawItself() {
        Console console = Mockito.mock(Console.class);
        IView invalidOptionTest = new InvalidLibrarianMenuOptionView(console);

        invalidOptionTest.draw();

        Mockito.verify(console).printOutput("Select a valid option!");
    }

    @Test
    public void invalidLibrarianMenuOptionTestKnowsHowToReturnTheNextView() {
        IView loginMenuView = Mockito.mock(LoginMenuView.class);
        Console console = Mockito.mock(Console.class);
        IView invalidLibrarianMenuOptionView = new InvalidLibrarianMenuOptionView(console);
        ViewDispatcher viewDispatcher = Mockito.mock(ViewDispatcher.class);

        Mockito.when(viewDispatcher.librarianMenuDispatch("Invalid Librarian Menu Option View")).thenReturn(loginMenuView);

        assertEquals(loginMenuView, invalidLibrarianMenuOptionView.next(viewDispatcher));
    }
}