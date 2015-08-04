package com.twu.biblioteca;


public class User {

    private String libraryNumber;
    private String password;
    private String name;
    private String email;
    private String phoneNumber;
    private String role;

    public User(String libraryNumber, String password, String name, String email, String phoneNumber, String role) {
        this.libraryNumber = libraryNumber;
        this.password = password;
        this.name = name;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.role = role;
    }

    public boolean authenticateUser(String libraryNumber, String password) {
        return libraryNumber.equals(this.libraryNumber) && password.equals(this.password);
    }

    public String userInformation() {
        return name + " " + email + " " + phoneNumber;
    }

    public boolean isLibrarian() {
        return role.equals("librarian");
    }
}
