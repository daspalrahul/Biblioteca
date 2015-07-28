package com.twu.biblioteca;

import java.util.ArrayList;

public class Library {
    private ArrayList<Book> library;

    public Library() {
        this.library = new ArrayList<Book>();
    }

    public int numberOfBooks() {
        return library.size();
    }

    public void addBook(Book book) {
        library.add(book);
    }
}
