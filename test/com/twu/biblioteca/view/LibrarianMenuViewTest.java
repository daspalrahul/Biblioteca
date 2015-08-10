package com.twu.biblioteca.view;


import com.twu.biblioteca.Console;
import com.twu.biblioteca.controller.UserMenuDispatcher;
import com.twu.biblioteca.model.Session;
import org.junit.Test;
import org.mockito.Mockito;

import static org.junit.Assert.*;
import static org.mockito.Matchers.anyString;


public class LibrarianMenuViewTest {

    @Test
    public void librarianMenuViewTestKnowsHowToDrawItself() {
        Menu menu = Mockito.mock(Menu.class);
        Console console = Mockito.mock(Console.class);
        Session session = Mockito.mock(Session.class);
        IView librarianMenuView = new LibrarianMenuView(console, menu, session);

        librarianMenuView.draw();

        Mockito.verify(console).printOutput(anyString());
    }

    @Test
    public void librarianMenuViewKnowsWhatToReturnNext() {
        Menu menu = Mockito.mock(Menu.class);
        Console console = Mockito.mock(Console.class);
        UserMenuDispatcher userMenuDispatcher = Mockito.mock(UserMenuDispatcher.class);
        IView listCheckedoutBooksView = Mockito.mock(ListBooksView.class);
        Session session = Mockito.mock(Session.class);
        IView librarianMenuView = new LibrarianMenuView(console, menu, session);

        Mockito.when(console.getInput()).thenReturn("List Checkedout Books");
        Mockito.when(userMenuDispatcher.librarianMenuDispatch("List Checkedout Books")).thenReturn(listCheckedoutBooksView);

        assertEquals(listCheckedoutBooksView, librarianMenuView.next(userMenuDispatcher));
    }
}