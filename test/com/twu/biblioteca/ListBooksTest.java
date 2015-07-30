package com.twu.biblioteca;


import org.junit.Test;
import org.mockito.Mockito;

public class ListBooksTest {

    @Test
    public void listBookKnowsHowToListTheBook() {
        View view = Mockito.mock(View.class);
        Library library = Mockito.mock(Library.class);
        ListBooks listBooks = new ListBooks(view, library);

        listBooks.execute();

        Mockito.verify(view).displayListOfAllBooks(library);
    }

}