package com.twu.biblioteca.model;


public class Book implements LibraryItem {

    private String title;
    private String author;
    private String year;

    public Book(String title, String author, String year) {
        this.title = title;
        this.author = author;
        this.year = year;
    }

    @Override
    public String toString() {
        return String.format("%-25s %25s %10s", title, author, year);
    }

    @Override
    public boolean hasName(String itemName) {
        return title.equals(itemName);
    }
}
