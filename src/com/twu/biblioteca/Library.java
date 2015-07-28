package com.twu.biblioteca;


import java.util.ArrayList;

public class Library {
    private ArrayList<Book> library;

    public Library(ArrayList<Book> library) {
        this.library = library;
    }

    public int numberOfBooks() {
        return library.size();
    }

    public void addBook(Book book) {
        library.add(book);
    }

    public ArrayList<Book> listOfBooks() {
        return library;
    }
}
