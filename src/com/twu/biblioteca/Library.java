package com.twu.biblioteca;


import java.util.ArrayList;

public class Library {

    ArrayList<LibraryItem> availableBookList;
    ArrayList<LibraryItem> checkedOutBookList;

    public Library(ArrayList<LibraryItem> availableBookList, ArrayList<LibraryItem> checkedOutBookList) {
        this.availableBookList = availableBookList;
        this.checkedOutBookList = checkedOutBookList;
    }

    public boolean hasBook(String nameOfBook) {
        for (int i = 0; i < availableBookList.size(); i++) {
            if (availableBookList.get(0).hasName(nameOfBook))
                return true;
        }
        return false;
    }

    public ArrayList<LibraryItem> listOfAllBooks() {
        return availableBookList;
    }

    public ArrayList<LibraryItem> listOfAllAvailableBooks() {
        return availableBookList;
    }

    public boolean checkOut(String requestedBook) {
        for (LibraryItem libraryItem : availableBookList) {
            if (libraryItem.hasName(requestedBook)) {
                checkedOutBookList.add(libraryItem);
                availableBookList.remove(libraryItem);
                return true;
            }
        }
        return false;
    }

    public boolean checkIn(String book) {
        for (LibraryItem libraryItem : checkedOutBookList) {
            if (libraryItem.hasName(book)) {
                availableBookList.add(libraryItem);
                checkedOutBookList.remove(libraryItem);
                return true;
            }
        }
        return false;
    }
}
