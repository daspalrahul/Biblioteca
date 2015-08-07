package com.twu.biblioteca.view;


import com.twu.biblioteca.Console;
import com.twu.biblioteca.controller.UserMenuDispatcher;
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
        UserMenuDispatcher userMenuDispatcher = Mockito.mock(UserMenuDispatcher.class);
        IView userMenuViewTest = new UserMenuView(menu, console, loginView, userMenuDispatcher);

        userMenuViewTest.draw();

        Mockito.verify(console).printOutput(anyString());
    }

    @Test
    public void userMenuViewKnowsWhatToReturnNext() {
        Menu menu = Mockito.mock(Menu.class);
        Console console = Mockito.mock(Console.class);
        LoginView loginView = Mockito.mock(LoginView.class);
        UserMenuDispatcher userMenuDispatcher = Mockito.mock(UserMenuDispatcher.class);
        IView listBooksView = Mockito.mock(ListBooksView.class);
        IView userMenuViewTest = new UserMenuView(menu, console, loginView, userMenuDispatcher);

        Mockito.when(console.getInput()).thenReturn("List Books");
        Mockito.when(userMenuDispatcher.dispatch("List Books")).thenReturn(listBooksView);

        assertEquals(listBooksView, userMenuViewTest.next());
    }
}