package com.twu.biblioteca.view;


import com.twu.biblioteca.Console;
import com.twu.biblioteca.controller.ViewDispatcher;
import com.twu.biblioteca.model.Section;
import org.junit.Test;
import org.mockito.Mockito;

import static org.junit.Assert.*;


public class ListCheckedoutBooksViewViewTest {

    @Test
    public void listBooksViewTestKnowsHowToDrawItself() {
        Console console = Mockito.mock(Console.class);
        Section books = Mockito.mock(Section.class);
        IView listCheckedoutBooksView = new ListCheckedoutBooksView(console, books);

        Mockito.when(books.listOfAllCheckedOutLibraryItems()).thenReturn("booklist");
        listCheckedoutBooksView.draw();

        Mockito.verify(console).printOutput("booklist");
    }

    @Test
    public void listBookViewKnowsHowToReturnNextView() {
        Console console = Mockito.mock(Console.class);
        IView librarianMenuView = Mockito.mock(LibrarianMenuView.class);
        Section books = Mockito.mock(Section.class);
        IView listCheckedoutBooksView = new ListCheckedoutBooksView(console, books);
        ViewDispatcher viewDispatcher = Mockito.mock(ViewDispatcher.class);

        Mockito.when(viewDispatcher.librarianMenuDispatch("List Checkedout Books View")).thenReturn(librarianMenuView);

        assertEquals(librarianMenuView, listCheckedoutBooksView.next(viewDispatcher));
    }
}