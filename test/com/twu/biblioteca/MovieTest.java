package com.twu.biblioteca;


import org.junit.Test;

import static org.junit.Assert.*;

public class MovieTest {

    @Test
    public void movieKnowsIfAGivenStringIsEqualToItsName() {
        Movie movie = new Movie("Kick", "2014", "Parul", "-10");

        assertEquals(true, movie.hasName("Kick"));
    }

    @Test
    public void movieKnowsItsToStringBehaviour() {
        Movie movie = new Movie("Kick", "2014", "Parul", "-10");

        assertEquals("Kick    2014    Parul    -10", movie.toString());
    }
}