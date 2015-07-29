package com.twu.biblioteca;

import org.junit.Test;
import org.mockito.Mockito;

import java.util.ArrayList;

public class ListBooksTest {

    @Test
    public void listBookKnowsHowToListTheBook() {
        View view = Mockito.mock(View.class);
        ArrayList<String[]> library = new ArrayList<>();
        ListBooks listBooks = new ListBooks(view, library);

        listBooks.execute();

        Mockito.verify(view).displayListOfBooks(library);
    }

}