package com.twu.biblioteca;

import org.junit.Test;

import static org.junit.Assert.*;

public class UserTest {

    @Test
    public void userKnowsHowToAuthenticateAUser() {
        User user = new User("123-4567", "diney", "Rahul", "daspalrahul@gmail.com", "8860250486");

        assertEquals(true, user.authenticateUser("123-4567", "diney"));
    }

    @Test
    public void userKnowsTheInformationItNeedsTodisplay() {
        User user = new User("123-4567", "diney", "Rahul", "daspalrahul@gmail.com", "8860250486");

        assertEquals("Rahul daspalrahul@gmail.com 8860250486", user.userInformation());
    }
}