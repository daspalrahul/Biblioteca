package com.twu.biblioteca;


public class Book extends LibraryItem {

    private String author;
    private String year;

    public Book(String name, String author, String year) {
        super(name);
        this.author = author;
        this.year = year;
    }

    @Override
    public String toString() {
        return name + "    " + author + "    " + year;
    }
}
