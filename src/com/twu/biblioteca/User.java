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
        return libraryNumber + " " + name + " " + email + " " + phoneNumber;
    }

    public boolean isLibrarian() {
        return role.equals("librarian");
    }

    @Override
    public boolean equals(Object other) {
        if (this == other) return true;
        if (other == null || getClass() != other.getClass()) return false;

        User thatUser = (User) other;

        if (libraryNumber != null ? !libraryNumber.equals(thatUser.libraryNumber) : thatUser.libraryNumber != null)
            return false;
        if (password != null ? !password.equals(thatUser.password) : thatUser.password != null) return false;
        if (name != null ? !name.equals(thatUser.name) : thatUser.name != null) return false;
        if (email != null ? !email.equals(thatUser.email) : thatUser.email != null) return false;
        if (phoneNumber != null ? !phoneNumber.equals(thatUser.phoneNumber) : thatUser.phoneNumber != null) return false;
        return !(role != null ? !role.equals(thatUser.role) : thatUser.role != null);

    }

    @Override
    public int hashCode() {
        int result = libraryNumber != null ? libraryNumber.hashCode() : 0;
        result = 31 * result + (password != null ? password.hashCode() : 0);
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (email != null ? email.hashCode() : 0);
        result = 31 * result + (phoneNumber != null ? phoneNumber.hashCode() : 0);
        result = 31 * result + (role != null ? role.hashCode() : 0);
        return result;
    }
}
