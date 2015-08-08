package com.twu.biblioteca.view;


import com.twu.biblioteca.Console;
import com.twu.biblioteca.model.Section;
import org.junit.Test;
import org.mockito.Mockito;

import static org.junit.Assert.*;


public class ListMoviesViewTest {

    @Test
    public void listMoviesViewCanDisplayListOfMovies() {
        Console console = Mockito.mock(Console.class);
        IView userMenuView = Mockito.mock(UserMenuView.class);
        Section movies = Mockito.mock(Section.class);
        IView listBooksView = new ListBooksView(console, userMenuView, movies);

        Mockito.when(movies.listOfAllAvailableLibraryItems()).thenReturn("movielist");
        listBooksView.draw();

        Mockito.verify(console).printOutput("movielist");
    }

    @Test
    public void listBookViewKnowsHowToReturnNextView() {
        Console console = Mockito.mock(Console.class);
        IView userMenuView = Mockito.mock(UserMenuView.class);
        Section movies = Mockito.mock(Section.class);
        IView listBooksView = new ListBooksView(console, userMenuView, movies);

        assertEquals(userMenuView, listBooksView.next());
    }
}