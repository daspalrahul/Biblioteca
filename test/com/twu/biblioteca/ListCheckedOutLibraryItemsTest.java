package com.twu.biblioteca;


import org.junit.Test;
import org.mockito.Mockito;

import static org.junit.Assert.*;
import static org.mockito.Matchers.anyString;

public class ListCheckedOutLibraryItemsTest {

    @Test
    public void listCheckedOutLibraryItemsKnowsHowToGetListOfCheckedOutLibraryItems() {
        View view = Mockito.mock(View.class);
        Section section = Mockito.mock(Section.class);
        ListCheckedOutLibraryItems listCheckedOutLibraryItems = new ListCheckedOutLibraryItems(view, section);

        listCheckedOutLibraryItems.execute();

        Mockito.verify(view).displayListOfAllCheckedOutLibraryItems(anyString());
    }
}
