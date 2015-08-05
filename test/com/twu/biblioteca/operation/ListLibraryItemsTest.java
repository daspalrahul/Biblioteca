package com.twu.biblioteca.operation;


import com.twu.biblioteca.model.Section;
import com.twu.biblioteca.view.View;
import org.junit.Test;
import org.mockito.Mockito;

public class ListLibraryItemsTest {

    @Test
    public void listBookKnowsHowToListTheBook() {
        View view = Mockito.mock(View.class);
        Section section = Mockito.mock(Section.class);
        com.twu.biblioteca.operation.ListLibraryItems listLibraryItems = new com.twu.biblioteca.operation.ListLibraryItems(view, section);

        listLibraryItems.execute();

        Mockito.verify(view).displayListOfAllAvailableLibraryItems(section);
    }

}