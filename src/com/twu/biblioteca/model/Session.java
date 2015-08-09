package com.twu.biblioteca.model;

public class Session {

    User currentUser;

    public Session() {
        this.currentUser = null;
    }

    public User getCurrentUser() {
        return currentUser;
    }

    public void setCurrentUser(User currentUser) {
        this.currentUser = currentUser;
    }

    public void unsetCurrentUser() {
        this.currentUser = null;
    }
}
