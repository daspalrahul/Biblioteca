package com.twu.biblioteca;


import java.util.ArrayList;

public class Library {

    ArrayList<String[]> bookList;

    public Library(ArrayList<String[]> bookList) {
        this.bookList = bookList;
    }

    public boolean hasBook(String nameOfBook) {
        for (int i = 0; i < bookList.size(); i++) {
            if (bookList.get(0)[0].equals(nameOfBook))
                return true;
        }
        return false;
    }

    public ArrayList<String[]> listOfAllBooks() {
        return bookList;
    }

    public boolean checkOut(String requestedBook) {
        for (String[] book : bookList) {
            if (book[0].equals(requestedBook) && book[3].equals("available")) {
                book[3] = "unavailable";
                return true;
            }
        }
        return false;
    }
}
