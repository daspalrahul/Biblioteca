package com.twu.biblioteca;


import java.util.ArrayList;

public class Library {

    ArrayList<Book> availableBookList;
    ArrayList<Book> checkedOutBookList;

    public Library(ArrayList<Book> availableBookList, ArrayList<Book> checkedOutBookList) {
        this.availableBookList = availableBookList;
        this.checkedOutBookList = checkedOutBookList;
    }

    public boolean hasBook(String nameOfBook) {
        for (int i = 0; i < availableBookList.size(); i++) {
            if (availableBookList.get(0).hasTitle(nameOfBook))
                return true;
        }
        return false;
    }

    public ArrayList<Book> listOfAllBooks() {
        return availableBookList;
    }

    public ArrayList<Book> listOfAllAvailableBooks() {
        return availableBookList;
    }

    public boolean checkOut(String requestedBook) {
        for (Book book : availableBookList) {
            if (book.hasTitle(requestedBook)) {
                checkedOutBookList.add(book);
                availableBookList.remove(book);
                return true;
            }
        }
        return false;
    }

    public boolean checkIn(String book) {
        for (Book libraryBook : checkedOutBookList) {
            if (libraryBook.hasTitle(book)) {
                availableBookList.add(libraryBook);
                checkedOutBookList.remove(libraryBook);
                return true;
            }
        }
        return false;
    }
}
