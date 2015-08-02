package com.twu.biblioteca;


import org.junit.Test;
import org.mockito.Mockito;

public class ListLibraryItemsTest {

    @Test
    public void listBookKnowsHowToListTheBook() {
        View view = Mockito.mock(View.class);
        Section section = Mockito.mock(Section.class);
        ListLibraryItems listLibraryItems = new ListLibraryItems(view, section);

        listLibraryItems.execute();

        Mockito.verify(view).displayListOfAllBooks(section);
    }

}