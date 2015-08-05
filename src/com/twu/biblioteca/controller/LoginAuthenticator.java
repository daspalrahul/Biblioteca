package com.twu.biblioteca.controller;


import java.util.ArrayList;

public class LoginAuthenticator {

    ArrayList<com.twu.biblioteca.model.User> users;

    public LoginAuthenticator(ArrayList<com.twu.biblioteca.model.User> users) {
        this.users = users;
    }

    public com.twu.biblioteca.model.User authenticateUser(String libraryNumber, String password) {
        for (com.twu.biblioteca.model.User user : users) {
            if (user.authenticateUser(libraryNumber, password))
                return user;
        }
        return null;
    }
}
