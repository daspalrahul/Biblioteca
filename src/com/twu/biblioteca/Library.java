package com.twu.biblioteca;


import java.util.ArrayList;

public class Library {

    ArrayList<String[]> availableBookList;
    ArrayList<String[]> checkedOutBookList;

    public Library(ArrayList<String[]> availableBookList, ArrayList<String[]> checkedOutBookList) {
        this.availableBookList = availableBookList;
        this.checkedOutBookList = checkedOutBookList;
    }

    public boolean hasBook(String nameOfBook) {
        for (int i = 0; i < availableBookList.size(); i++) {
            if (availableBookList.get(0)[0].equals(nameOfBook))
                return true;
        }
        return false;
    }

    public ArrayList<String[]> listOfAllBooks() {
        return availableBookList;
    }

    public ArrayList<String[]> listOfAllAvailableBooks() {
        return availableBookList;
    }

    public boolean checkOut(String requestedBook) {
        for (String[] book : availableBookList) {
            if (book[0].equals(requestedBook) && book[3].equals("available")) {
                book[3] = "unavailable";
                return true;
            }
        }
        return false;
    }

    public boolean checkIn(String book) {
        for (String[] libraryBook : availableBookList) {
            if (libraryBook[0].equals(book) && libraryBook[3].equals("unavailable")) {
                libraryBook[3] = "available";
                return true;
            }
        }
        return false;
    }
}
