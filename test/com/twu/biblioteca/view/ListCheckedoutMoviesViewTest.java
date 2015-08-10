package com.twu.biblioteca.view;


import com.twu.biblioteca.Console;
import com.twu.biblioteca.controller.ViewDispatcher;
import com.twu.biblioteca.model.Section;
import org.junit.Test;
import org.mockito.Mockito;

import static org.junit.Assert.*;


public class ListCheckedoutMoviesViewTest {

    @Test
    public void listCheckedoutMoviesViewTestKnowsHowToDrawItself() {
        Console console = Mockito.mock(Console.class);
        Section books = Mockito.mock(Section.class);
        IView listCheckedoutMoviesView = new ListCheckedoutMoviesView(console, books);

        Mockito.when(books.listOfAllCheckedOutLibraryItems()).thenReturn("movielist");
        listCheckedoutMoviesView.draw();

        Mockito.verify(console).printOutput("movielist");
    }

    @Test
    public void listCheckedoutMoviesViewKnowsHowToReturnNextView() {
        Console console = Mockito.mock(Console.class);
        IView librarianMenuView = Mockito.mock(LibrarianMenuView.class);
        Section books = Mockito.mock(Section.class);
        IView listCheckedoutMoviesView = new ListCheckedoutMoviesView(console, books);
        ViewDispatcher viewDispatcher = Mockito.mock(ViewDispatcher.class);

        Mockito.when(viewDispatcher.librarianMenuDispatch("List Checkedout Movies View")).thenReturn(librarianMenuView);

        assertEquals(librarianMenuView, listCheckedoutMoviesView.next(viewDispatcher));
    }
}