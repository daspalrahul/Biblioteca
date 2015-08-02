package com.twu.biblioteca;


import org.junit.Test;
import org.mockito.Mockito;

public class ListBooksTest {

    @Test
    public void listBookKnowsHowToListTheBook() {
        View view = Mockito.mock(View.class);
        Section section = Mockito.mock(Section.class);
        ListBooks listBooks = new ListBooks(view, section);

        listBooks.execute();

        Mockito.verify(view).displayListOfAllBooks(section);
    }

}