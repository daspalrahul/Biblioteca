package com.twu.biblioteca.controller;


import com.twu.biblioteca.model.User;

import java.util.ArrayList;

public class LoginAuthenticator {

    ArrayList<User> users;

    public LoginAuthenticator(ArrayList<User> users) {
        this.users = users;
    }

    public User authenticateUser(String libraryNumber, String password) {
        for (User user : users) {
            if (user.authenticateUser(libraryNumber, password))
                return user;
        }
        return null;
    }
}
