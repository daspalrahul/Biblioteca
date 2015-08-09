package com.twu.biblioteca.view;


import com.twu.biblioteca.Console;
import com.twu.biblioteca.controller.UserMenuDispatcher;
import com.twu.biblioteca.model.Section;
import org.junit.Test;
import org.mockito.Mockito;

import static org.junit.Assert.*;


public class ListBooksViewTest {

    @Test
    public void listBooksViewTestKnowsHowToDrawItself() {
        Console console = Mockito.mock(Console.class);
        IView userMenuView = Mockito.mock(UserMenuView.class);
        Section books = Mockito.mock(Section.class);
        IView listBooksView = new ListBooksView(console, userMenuView, books);

        Mockito.when(books.listOfAllAvailableLibraryItems()).thenReturn("booklist");
        listBooksView.draw();

        Mockito.verify(console).printOutput("booklist");
    }

    @Test
    public void listBookViewKnowsHowToReturnNextView() {
        Console console = Mockito.mock(Console.class);
        IView userMenuView = Mockito.mock(UserMenuView.class);
        Section books = Mockito.mock(Section.class);
        IView listBooksView = new ListBooksView(console, userMenuView, books);
        UserMenuDispatcher userMenuDispatcher = Mockito.mock(UserMenuDispatcher.class);

        assertEquals(userMenuView, listBooksView.next(userMenuDispatcher));
    }
}