package com.twu.biblioteca.model;

import org.junit.Test;

import static org.junit.Assert.*;

public class UserTest {

    @Test
    public void userKnowsHowToAuthenticateAUser() {
        com.twu.biblioteca.model.User user = new com.twu.biblioteca.model.User("123-4567", "diney", "Rahul", "daspalrahul@gmail.com", "8860250486", "customer");

        assertEquals(true, user.authenticateUser("123-4567", "diney"));
    }

    @Test
    public void userKnowsTheInformationItNeedsTodisplay() {
        com.twu.biblioteca.model.User user = new com.twu.biblioteca.model.User("123-4567", "diney", "Rahul", "daspalrahul@gmail.com", "8860250486", "customer");

        assertEquals("123-4567             Rahul                daspalrahul@gmail.com           8860250486", user.toString());
    }

    @Test
    public void userKnowsAboutItsRole() {
        com.twu.biblioteca.model.User user = new com.twu.biblioteca.model.User("123-4567", "diney", "Rahul", "daspalrahul@gmail.com", "8860250486", "customer");

        assertEquals(false, user.isLibrarian());
    }
}