package com.twu.biblioteca;


import org.junit.Test;

import static org.junit.Assert.*;

public class LibraryItemTest {

    @Test
    public void libraryItemKnowsItsName() {
        LibraryItem libraryItem = new LibraryItem("name");

        assertEquals(true, libraryItem.hasName("name"));
    }

}