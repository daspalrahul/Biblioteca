package com.twu.biblioteca.controller;


import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class LoginAuthenticatorTest {

    @Test
    public void loginAuthenticatorKnowsHowToAuthenticateAUserFromAListOfUsers() {
        com.twu.biblioteca.model.User user = new com.twu.biblioteca.model.User("123-4567", "diney", "Rahul", "daspalrahul@gmail.com", "8860250486", "customer");
        ArrayList<com.twu.biblioteca.model.User> users = new ArrayList<>();
        users.add(user);
        com.twu.biblioteca.controller.LoginAuthenticator loginAuthenticator = new com.twu.biblioteca.controller.LoginAuthenticator(users);

        assertEquals(user, loginAuthenticator.authenticateUser("123-4567", "diney"));
    }
}