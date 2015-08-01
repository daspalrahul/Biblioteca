package com.twu.biblioteca;


import org.junit.Test;

import static org.junit.Assert.*;

public class MovieTest {

    @Test
    public void movieKnowsIfAGivenStringIsEqualToItsName() {
        LibraryItem libraryItem = new Movie("Kick", "2014", "Parul", "-10");

        assertEquals(true, libraryItem.hasName("Kick"));
    }

    @Test
    public void movieKnowsItsToStringBehaviour() {
        LibraryItem libraryItem = new Movie("Kick", "2014", "Parul", "-10");

        assertEquals("Kick    2014    Parul    -10", libraryItem.toString());
    }
}