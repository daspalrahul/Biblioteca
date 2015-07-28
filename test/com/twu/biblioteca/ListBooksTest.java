package com.twu.biblioteca;

import org.junit.Test;
import org.mockito.Mock;
import org.mockito.Mockito;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class ListBooksTest {

    @Test
    public void listBookKnowsHowToListTheBook() {
        View view = Mockito.mock(View.class);
        ArrayList<String[]> library = new ArrayList<>();
        ListBooks listBooks = new ListBooks();

        listBooks.execute(view, library);

        Mockito.verify(view).displayListOfBooks(library);
    }

}