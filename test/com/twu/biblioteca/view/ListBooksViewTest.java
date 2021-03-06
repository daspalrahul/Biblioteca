package com.twu.biblioteca.view;


import com.twu.biblioteca.Console;
import com.twu.biblioteca.controller.ViewDispatcher;
import com.twu.biblioteca.model.Section;
import org.junit.Test;
import org.mockito.Mockito;

import static org.junit.Assert.*;


public class ListBooksViewTest {

    @Test
    public void listBooksViewTestKnowsHowToDrawItself() {
        Console console = Mockito.mock(Console.class);
        Section books = Mockito.mock(Section.class);
        IView listBooksView = new ListBooksView(console, books);

        Mockito.when(books.listOfAllAvailableLibraryItems()).thenReturn("booklist");
        listBooksView.draw();

        Mockito.verify(console).printOutput("booklist");
    }

    @Test
    public void listBookViewKnowsHowToReturnNextView() {
        Console console = Mockito.mock(Console.class);
        IView userMenuView = Mockito.mock(UserMenuView.class);
        Section books = Mockito.mock(Section.class);
        IView listBooksView = new ListBooksView(console, books);
        ViewDispatcher viewDispatcher = Mockito.mock(ViewDispatcher.class);

        Mockito.when(viewDispatcher.userMenuDispatch("List Books View")).thenReturn(userMenuView);

        assertEquals(userMenuView, listBooksView.next(viewDispatcher));
    }
}