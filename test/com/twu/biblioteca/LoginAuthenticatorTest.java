package com.twu.biblioteca;


import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class LoginAuthenticatorTest {

    @Test
    public void loginAuthenticatorKnowsHowToAuthenticateAUserFromAListOfUsers() {
        User user = new User("123-4567", "diney", "Rahul", "daspalrahul@gmail.com", "8860250486", "customer");
        ArrayList<User> users = new ArrayList<>();
        users.add(user);
        LoginAuthenticator loginAuthenticator = new LoginAuthenticator(users);

        assertEquals(true, loginAuthenticator.authenticateUser("123-4567", "diney"));
    }
}