package com.twu.biblioteca.controller;


import com.twu.biblioteca.Console;
import com.twu.biblioteca.view.IView;
import com.twu.biblioteca.view.InvalidLoginMenuOptionView;
import com.twu.biblioteca.view.LoginView;
import com.twu.biblioteca.view.QuitView;
import org.junit.Test;
import org.mockito.Mockito;

import static org.junit.Assert.*;


public class ViewDispatcherTest {

    @Test
    public void viewDispatcherCanReturnCorrectViewBasedOnUserInput() {
        IView invalidOptionView = Mockito.mock(InvalidLoginMenuOptionView.class);
        IView quitView = Mockito.mock(QuitView.class);
        IView loginView = Mockito.mock(LoginView.class);
        Console console = Mockito.mock(Console.class);

        Mockito.when(console.getInput()).thenReturn("Login");
        ViewDispatcher viewDispatcher = new ViewDispatcher(invalidOptionView, quitView, loginView);

        assertEquals(loginView, viewDispatcher.convertIntoView(console.getInput()));
    }

}