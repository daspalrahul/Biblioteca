package com.twu.biblioteca;


import java.util.ArrayList;

public class LoginAuthenticator {

    ArrayList<User> users;

    public LoginAuthenticator(ArrayList<User> users) {
        this.users = users;
    }

    public boolean authenticateUser(String libraryNumber, String password) {
        for (User user : users) {
            if (user.authenticateUser(libraryNumber, password))
                return true;
        }
        return false;
    }
}
