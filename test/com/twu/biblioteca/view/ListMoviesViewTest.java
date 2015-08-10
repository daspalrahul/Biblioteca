package com.twu.biblioteca.view;


import com.twu.biblioteca.Console;
import com.twu.biblioteca.controller.ViewDispatcher;
import com.twu.biblioteca.model.Section;
import org.junit.Test;
import org.mockito.Mockito;

import static org.junit.Assert.*;


public class ListMoviesViewTest {

    @Test
    public void listMoviesViewCanDisplayListOfMovies() {
        Console console = Mockito.mock(Console.class);
        Section movies = Mockito.mock(Section.class);
        IView listBooksView = new ListBooksView(console, movies);

        Mockito.when(movies.listOfAllAvailableLibraryItems()).thenReturn("movielist");
        listBooksView.draw();

        Mockito.verify(console).printOutput("movielist");
    }

    @Test
    public void listMoviesViewKnowsHowToReturnNextView() {
        Console console = Mockito.mock(Console.class);
        IView userMenuView = Mockito.mock(UserMenuView.class);
        Section movies = Mockito.mock(Section.class);
        IView listMoviesView = new ListMoviesView(console, movies);
        ViewDispatcher viewDispatcher = Mockito.mock(ViewDispatcher.class);

        Mockito.when(viewDispatcher.userMenuDispatch("List Movies View")).thenReturn(userMenuView);

        assertEquals(userMenuView, listMoviesView.next(viewDispatcher));
    }
}