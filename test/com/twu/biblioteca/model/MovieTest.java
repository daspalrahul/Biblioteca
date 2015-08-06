package com.twu.biblioteca.model;


import org.junit.Test;

import static org.junit.Assert.*;

public class MovieTest {

    @Test
    public void movieKnowsIfAGivenStringIsEqualToItsName() {
        com.twu.biblioteca.model.LibraryItem libraryItem = new com.twu.biblioteca.model.Movie("Kick", "2014", "Parul", "-10");

        assertEquals(true, libraryItem.hasName("Kick"));
    }

    @Test
    public void movieKnowsItsToStringBehaviour() {
        com.twu.biblioteca.model.LibraryItem libraryItem = new com.twu.biblioteca.model.Movie("Kick", "2014", "Parul", "-10");

        assertEquals("Kick                            2014                     Parul        -10", libraryItem.toString());
    }
}