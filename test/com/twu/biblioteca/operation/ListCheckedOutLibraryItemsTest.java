package com.twu.biblioteca.operation;


import com.twu.biblioteca.model.Section;
import com.twu.biblioteca.view.View;
import org.junit.Test;
import org.mockito.Mockito;

import static org.mockito.Matchers.anyString;

public class ListCheckedOutLibraryItemsTest {

    @Test
    public void listCheckedOutLibraryItemsKnowsHowToGetListOfCheckedOutLibraryItems() {
        View view = Mockito.mock(View.class);
        Section section = Mockito.mock(Section.class);
        com.twu.biblioteca.operation.ListCheckedOutLibraryItems listCheckedOutLibraryItems = new com.twu.biblioteca.operation.ListCheckedOutLibraryItems(view, section);

        listCheckedOutLibraryItems.execute();

        Mockito.verify(view).displayListOfAllCheckedOutLibraryItems(anyString());
    }
}
